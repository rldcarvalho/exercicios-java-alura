package br.com.rldcarvalho.loja.impostos;

import br.com.rldcarvalho.loja.orcamento.Orcamento;

import java.math.BigDecimal;

public abstract class Imposto {

    private Imposto outro;

    public Imposto(Imposto outro) {
        this.outro = outro;
    }

    protected abstract BigDecimal realizarCalculo(Orcamento orcamento);

    public BigDecimal calcular(Orcamento orcamento){

        BigDecimal valorImposto = realizarCalculo(orcamento);
        BigDecimal valorDoOutroImposto = BigDecimal.ZERO;

        if (outro != null){
            valorDoOutroImposto = outro.realizarCalculo(orcamento);
        }

        return valorImposto.add(valorDoOutroImposto);

    }
}
