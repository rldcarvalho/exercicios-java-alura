package br.com.bytebank.banco.teste.util;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;

import java.util.ArrayList;

public class TesteArrayList {
    public static void main(String[] args) {
        //Generics
        ArrayList<Conta> lista = new ArrayList<Conta>();

        ArrayList<String> nomes = new ArrayList<>();

        Conta cc = new ContaCorrente(22, 333);
        lista.add(cc);

        Conta cc2 = new ContaCorrente(22, 444);
        lista.add(cc2);

        System.out.println(lista.size());
        Conta ref = lista.get(0);
        System.out.println(ref.getNumero());

        lista.remove(0);

        System.out.println("Tamanho: " + lista.size());

        Conta cc3 = new ContaCorrente(22, 555);
        lista.add(cc3);
        Conta cc4 = new ContaCorrente(22, 666);
        lista.add(cc4);

        for (int i = 0; i < lista.size(); i++) {
            System.out.println(lista.get(i));
        }

        System.out.println("------------");

        for (Conta conta : lista
             ) {
            System.out.println(conta);
        }
    }
}
