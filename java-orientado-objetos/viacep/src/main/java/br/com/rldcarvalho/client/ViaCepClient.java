package br.com.rldcarvalho.client;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ViaCepClient {

    public String getBody(String cep){
        String URL = "https://viacep.com.br/ws/" + cep + "/json/";
        String json = "";

        try {
            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create(URL))
                    .build();
            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());
            json = response.body();
        } catch (Exception e){
            System.out.println("Erro: " + e.getMessage());
        }
        return json;
    }


}
