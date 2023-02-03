package br.com.rldcarvalho.loja.desconto;

import br.com.rldcarvalho.loja.orcamento.Orcamento;

import java.math.BigDecimal;

public abstract class Desconto {

    protected Desconto proximo;

    Desconto(Desconto proximo) {
        this.proximo = proximo;
    }

    public abstract BigDecimal calcular(Orcamento orcamento);

}
