package br.com.rldcarvalho.loja.desconto;

import br.com.rldcarvalho.loja.orcamento.Orcamento;

import java.math.BigDecimal;

public class DescontoParaValorMaiorQueQuinhentos extends Desconto {

    DescontoParaValorMaiorQueQuinhentos(Desconto proximo) {
        super(proximo);
    }

    public BigDecimal calcular(Orcamento orcamento){

        if (orcamento.getValor().compareTo(new BigDecimal("500")) > 0){
            return orcamento.getValor().multiply(new BigDecimal("0.05"));
        }

        return BigDecimal.ZERO;
    }
}
