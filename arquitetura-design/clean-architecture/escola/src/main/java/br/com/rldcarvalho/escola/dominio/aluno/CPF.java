package br.com.rldcarvalho.escola.dominio.aluno;

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

    public String getNumero() {
        return numero;
    }

    @Override
    public String toString() {
        return numero;
    }
}
