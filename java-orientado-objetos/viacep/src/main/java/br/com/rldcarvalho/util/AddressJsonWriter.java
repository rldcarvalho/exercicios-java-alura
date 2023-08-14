package br.com.rldcarvalho.util;

import br.com.rldcarvalho.model.Address;
import com.google.gson.Gson;

import java.io.FileWriter;
import java.io.IOException;

public class AddressJsonWriter {

    public void write(Address address) {
        String text = new Gson().toJson(address);
        try {
            FileWriter writer = new FileWriter("cep.json");
            writer.write(text);
            writer.close();
            System.out.println("Arquivo criado com sucesso");
        } catch (IOException e){
            System.err.println("Erro ao escrever o arquivo: " + e.getMessage());
        }
    }
}
