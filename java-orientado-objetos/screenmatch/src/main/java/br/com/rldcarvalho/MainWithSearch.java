package br.com.rldcarvalho;

import br.com.rldcarvalho.model.Title;
import br.com.rldcarvalho.model.TitleOmdb;
import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class MainWithSearch {
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner reader = new Scanner(System.in);
        System.out.println("Digite o filme para a busca: ");
        String search = reader.nextLine();

        String URL = "https://www.omdbapi.com/?t=" + search + "&apikey=b9a327db";

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(URL))
                .build();
        HttpResponse<String> response = client
                .send(request, HttpResponse.BodyHandlers.ofString());
        String json = response.body();;
        System.out.println(json);

        Gson gson = new GsonBuilder().setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE).create();
        TitleOmdb myTitleOmdb = gson.fromJson(json, TitleOmdb.class);
        Title myTitle = new Title(myTitleOmdb);
        System.out.println(myTitle);



    }
}
