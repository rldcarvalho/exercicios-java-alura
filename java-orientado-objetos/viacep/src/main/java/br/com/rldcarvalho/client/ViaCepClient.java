package br.com.rldcarvalho.client;

import br.com.rldcarvalho.model.Address;
import com.google.gson.Gson;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ViaCepClient {

    public Address getAddress(String cep){
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
            throw new RuntimeException("Não foi possível obter endereço a partir desse cep");
        }
        return new Gson().fromJson(json, Address.class);
    }


}
