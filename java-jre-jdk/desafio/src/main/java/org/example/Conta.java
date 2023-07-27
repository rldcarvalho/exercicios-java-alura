package org.example;

import java.math.BigDecimal;

public class Conta {
    private String nome;
    private TipoConta tipoConta;
    private BigDecimal saldo;

    public Conta(String nome, TipoConta tipoConta, double saldo) {
        this.nome = nome;
        this.tipoConta = tipoConta;
        this.saldo = BigDecimal.valueOf(saldo);
    }

    public String getNome() {
        return this.nome;
    }

    public TipoConta getTipoConta() {
        return this.tipoConta;
    }

    public double valorSaldo() {
        return this.saldo.doubleValue();
    }

    public void consultaSaldo() {
        System.out.printf("Seu saldo atual é de R$ %,.2f%n%n", this.valorSaldo());
    }

    public void transfereValor(double valor){

        if (podeTransferir(valor)){
            this.saldo = this.saldo.subtract(BigDecimal.valueOf(valor));
            System.out.println("Transferência realizada com sucesso!");
            this.consultaSaldo();
            return;
        }
        System.out.println("Saldo insuficiente para realizar a operação!");
        this.consultaSaldo();
    }

    public boolean podeTransferir(double valor) {
        return this.saldo.compareTo(BigDecimal.valueOf(valor)) > 0;
    }

    public void depositaValor(double valor) {
        this.saldo = this.saldo.add(BigDecimal.valueOf(valor));
        System.out.println("Depósito efetuado com sucesso!");
        this.consultaSaldo();
    }
}
