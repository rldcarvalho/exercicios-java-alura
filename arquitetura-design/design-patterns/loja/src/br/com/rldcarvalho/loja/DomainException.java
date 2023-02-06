package br.com.rldcarvalho.loja;

public class DomainException extends RuntimeException {
    public DomainException(String mensagem) {
        super(mensagem);
    }
}
