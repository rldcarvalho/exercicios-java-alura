package br.com.bytebank.banco.teste;

import br.com.bytebank.banco.modelo.Cliente;
import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;

public class TesteArrayReferencias {
    public static void main(String[] args){

        Object[] contas = new Object[5];

        ContaCorrente cc1 = new ContaCorrente(33, 222);
        contas[0] = cc1;

        ContaPoupanca cp2 = new ContaPoupanca(33, 225);
        contas[1] = cp2;

        Cliente cliente = new Cliente();
        contas[2] = cliente;

        ContaPoupanca ref = (ContaPoupanca) contas[1];//type cast
        System.out.println(contas[1]);
    }

}
