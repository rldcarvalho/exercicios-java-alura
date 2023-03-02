package br.com.rldcarvalho.escola.dominio.aluno;

public class NumeroMaximoDeTelefonesAtingido extends IllegalArgumentException{

    public NumeroMaximoDeTelefonesAtingido(){
        super("Número máximo de 2 telefones atingido!");
    }
}
