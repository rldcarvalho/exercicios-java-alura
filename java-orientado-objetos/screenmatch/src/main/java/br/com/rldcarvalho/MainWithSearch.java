package br.com.rldcarvalho;

import br.com.rldcarvalho.exception.YearConversionErrorException;
import br.com.rldcarvalho.model.Title;
import br.com.rldcarvalho.model.TitleOmdb;
import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileWriter;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainWithSearch {
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner reader = new Scanner(System.in);
        String search = "";
        List<Title> titles = new ArrayList<>();
        Gson gson = new GsonBuilder().setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE).setPrettyPrinting().create();

        while (!search.equalsIgnoreCase("sair")) {


            System.out.println("Digite o filme para a busca: ");
            search = reader.nextLine();

            if (search.equalsIgnoreCase("sair")){
                break;
            }

            String URL = "https://www.omdbapi.com/?t=" + search.replace(" ", "+") + "&apikey=b9a327db";

            try {
                HttpClient client = HttpClient.newHttpClient();
                HttpRequest request = HttpRequest.newBuilder()
                        .uri(URI.create(URL))
                        .build();
                HttpResponse<String> response = client
                        .send(request, HttpResponse.BodyHandlers.ofString());
                String json = response.body();
                System.out.println(json);

                TitleOmdb myTitleOmdb = gson.fromJson(json, TitleOmdb.class);
                Title myTitle = new Title(myTitleOmdb);
                System.out.println(myTitle);

                titles.add(myTitle);

            } catch (NumberFormatException e) {
                System.out.println("Erro: " + e.getMessage());
            } catch (IllegalArgumentException e) {
                System.out.println("Algum erro de argumento na busca, verifique o endereço");
            } catch (YearConversionErrorException e) {
                System.out.println(e.getMessage());
            }

        }

        System.out.println(titles);

        FileWriter writer = new FileWriter("filmes.json");
        writer.write(gson.toJson(titles));
        writer.close();

    }
}
