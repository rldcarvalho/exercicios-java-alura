package br.com.bytebank.banco.teste;

import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;
import br.com.bytebank.banco.modelo.SaldoInsuficienteException;

public class TesteContas {
    public static void main(String[] args) throws SaldoInsuficienteException {
        ContaCorrente cc = new ContaCorrente(111, 111);
        cc.deposita(100.00);

        ContaPoupanca cp = new ContaPoupanca(222,222);
        cp.deposita(200.00);

        cc.transfere(10.0, cp);

        System.out.println("CC saldo: " + cc.getSaldo());
        System.out.println("CP saldo: " + cp.getSaldo());
    }
}
