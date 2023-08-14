package br.com.rldcarvalho.util;

import java.io.FileWriter;
import java.io.IOException;

public class CepJsonWriter {

    public void write(String text) {

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
