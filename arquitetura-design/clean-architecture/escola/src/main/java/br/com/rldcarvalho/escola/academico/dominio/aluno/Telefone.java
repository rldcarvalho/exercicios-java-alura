package br.com.rldcarvalho.escola.academico.dominio.aluno;

public class Telefone {

    private String ddd;
    private String numero;

    public Telefone(String ddd, String numero) {

        if ((ddd == null) || (numero == null)){
            throw new IllegalArgumentException("Numero de telefone inválido");
        }

        if (!ddd.matches("\\d{2}")){
            throw new IllegalArgumentException("Numero de telefone inválido");
        }

        if (!numero.matches("\\d{8}|\\d{9}")){
            throw new IllegalArgumentException("Numero de telefone inválido");
        }

        this.ddd = ddd;
        this.numero = numero;
    }

    public String getDdd() {
        return ddd;
    }

    public String getNumero() {
        return numero;
    }
}
