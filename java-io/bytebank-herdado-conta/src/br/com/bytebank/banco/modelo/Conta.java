package br.com.bytebank.banco.modelo;

import java.io.Serializable;

/**
 * Classe que representa a moldura de uma conta no Bytebank.
 *
 * @autor Rafael Carvalho
 */

public abstract class Conta implements Comparable<Conta>, Serializable {
    protected Double saldo = 0.0;
    private int agencia;
    private int numero;
    private transient Cliente titular;
    private static int total;

    /**
     * Construtor para inicializar o objeto Conta a partir da agência e número.
     *
     * @param agencia
     * @param numero
     */
    public Conta(int agencia, int numero){
        Conta.total++;
        //System.out.println("o total de contas é " + total);
        this.numero = numero;
        this.agencia = agencia;
        //System.out.println("Estou criando uma conta " + this.numero);
    }

    public Conta() {

    }

    public abstract void deposita(double valor);

    /**
     *Valor precisa ser maior do que o saldo.
     *
     * @param valor
     * @throws SaldoInsuficienteException
     */
    public void saca(double valor) throws SaldoInsuficienteException {
        if (this.saldo < valor) {
            throw new SaldoInsuficienteException("Não é possível concluir a operação. Saldo: "+ this.saldo + ", Valor: " + valor);
        }
        this.saldo -= valor;
    }

    public void transfere(double valor, Conta destino) throws SaldoInsuficienteException {
        this.saca(valor);
        destino.deposita(valor);
    }

    public Double getSaldo() {
        return this.saldo;
    }

    public int getNumero() {
        return this.numero;
    }

    public void setNumero(int numero) {
        if (numero <= 0) {
            System.out.println("Não é permitido valores menores ou iguais a zero");
            return;
        }
        this.numero = numero;

    }

    public int getAgencia() {
        return this.agencia;
    }

    public void setAgencia(int agencia) {
        if (agencia <= 0) {
            System.out.println("Não é permitido valores menores ou iguais a zero");
            return;
        }
        this.agencia = agencia;
    }

    public void setTitular(Cliente titular) {
        this.titular = titular;
    }

    public Cliente getTitular() {
        return titular;
    }

    public static int getTotal() {
        return total;
    }

    @Override
    public String toString() {
        return ", Número: " + this.numero + ", Agência: " + this.agencia + ", Saldo: " + this.saldo ;
    }

    @Override
    public boolean equals(Object outra) {
        if (this == outra) return true;
        if (outra == null || getClass() != outra.getClass()) return false;
        Conta conta = (Conta) outra;
        return agencia == conta.agencia && numero == conta.numero;
    }

    @Override
    public int compareTo(Conta outra) {
        return Double.compare(this.saldo, outra.saldo);
    }
}
