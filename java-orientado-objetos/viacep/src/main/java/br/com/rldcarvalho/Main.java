package br.com.rldcarvalho;

import br.com.rldcarvalho.client.ViaCepClient;
import br.com.rldcarvalho.util.CepJsonWriter;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Scanner reader = new Scanner(System.in);
        System.out.println("Digite um cep para pesquisar: ");
        String cep = reader.nextLine();

        ViaCepClient client = new ViaCepClient();

        String json = client.getBody(cep);

        CepJsonWriter writer = new CepJsonWriter();
        writer.write(json);

    }
}