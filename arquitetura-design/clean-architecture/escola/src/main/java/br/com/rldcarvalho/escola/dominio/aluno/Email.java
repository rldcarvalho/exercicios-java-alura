package br.com.rldcarvalho.escola.dominio.aluno;

public class Email {

    private String endereco;

    public Email(String endereco) {

        if (endereco == null || !isValido(endereco)){
            throw new IllegalArgumentException("E-mail inválido");
        }

        this.endereco = endereco;
    }

    public boolean isValido(String endereco){
        return endereco.matches("^[a-zA-Z0-9._]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$");
    }

    public String getEndereco() {
        return endereco;
    }
}
