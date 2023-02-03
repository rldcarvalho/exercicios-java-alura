package br.com.rldcarvalho.loja.desconto;

import br.com.rldcarvalho.loja.orcamento.Orcamento;

import java.math.BigDecimal;

public class SemDesconto extends Desconto {

    SemDesconto() {
        super(null);
    }

    public BigDecimal calcular(Orcamento orcamento){

        return BigDecimal.ZERO;
    }
}
