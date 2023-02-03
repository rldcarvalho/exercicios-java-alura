package br.com.rldcarvalho.loja.desconto;

import br.com.rldcarvalho.loja.orcamento.Orcamento;

import java.math.BigDecimal;

public class DescontoParaMaisDeCincoItens extends Desconto {

    DescontoParaMaisDeCincoItens(Desconto proximo) {
        super(proximo);
    }

    public BigDecimal calcular(Orcamento orcamento){

        if (orcamento.getQuantidadeItens() > 5){
            return orcamento.getValor().multiply(new BigDecimal("0.1"));
        }

        return proximo.calcular(orcamento);
    }
}
