package br.com.bytebank.banco.teste;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;

public class Teste {
    public static void main(String[] args){
        System.out.println("x");
        System.out.println(3);
        System.out.println(false);

        Object cc = new ContaCorrente(33, 222);
        ContaPoupanca cp = new ContaPoupanca(33, 555);

        System.out.println(cc);
        System.out.println(cp);

    }

    static void println(){

    }

    static void println(int a){

    }

    static void println( boolean valor){

    }

    static void println(Conta conta){

    }
}
