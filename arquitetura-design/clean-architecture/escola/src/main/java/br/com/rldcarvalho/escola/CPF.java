package br.com.rldcarvalho.escola;

public class CPF {

    private String numero;

    public CPF(String numero) {
        if (numero == null || !isValido(numero)){
            throw new IllegalArgumentException("CPF inválido");
        }
        this.numero = numero;
    }

    private boolean isValido(String numero) {

        return numero.matches("^\\d{3}.\\d{3}.\\d{3}-\\d{2}$");
    }
}
