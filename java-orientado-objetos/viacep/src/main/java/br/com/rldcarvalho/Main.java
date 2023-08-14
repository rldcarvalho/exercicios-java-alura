package br.com.rldcarvalho;

import br.com.rldcarvalho.client.ViaCepClient;
import br.com.rldcarvalho.model.Address;
import br.com.rldcarvalho.util.AddressJsonWriter;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Scanner reader = new Scanner(System.in);
        System.out.println("Digite um cep para pesquisar: ");
        String cep = reader.nextLine();

        ViaCepClient client = new ViaCepClient();

        Address myAddress = client.getAddress(cep);

        AddressJsonWriter writer = new AddressJsonWriter();
        writer.write(myAddress);

    }
}