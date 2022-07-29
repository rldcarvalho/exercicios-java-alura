package br.com.bytebank.banco.teste.util;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;

import java.util.ArrayList;

public class TesteArrayListEquals {
    public static void main(String[] args) {
        //Generics
        ArrayList<Conta> lista = new ArrayList<Conta>();

        Conta cc = new ContaCorrente(22, 333);
        lista.add(cc);

        Conta cc2 = new ContaCorrente(22, 444);
        lista.add(cc2);

        Conta cc3 = new ContaCorrente(22, 444);

        boolean existe = lista.contains(cc3);
        System.out.println("Existe? " + existe);

        for (Conta conta: lista) {
            if(conta == cc3){
                System.out.println("Já existe essa conta");
            }
        }

        System.out.println("------------");

        for (Conta conta : lista) {
            System.out.println(conta);
        }
    }
}
