package br.com.rldcarvalho.escola;

public class Telefone {

    private String ddd;
    private String numero;

    public Telefone(String ddd, String numero) {

        if ((ddd == null) || (numero == null) ||
                !ddd.matches("\\d{2}") || !numero.matches("^\\d{8}(\\d)?$")){
            throw new IllegalArgumentException("Numero de telefone inválido");
        }

        this.ddd = ddd;
        this.numero = numero;
    }
}
