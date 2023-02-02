package br.com.rldcarvalho.loja.impostos;

import br.com.rldcarvalho.loja.orcamento.Orcamento;

import java.math.BigDecimal;

public class CalculadoraDeImpostos {

    public BigDecimal calcular(Orcamento orcamento, TipoImposto tipoImposto){

        return switch (tipoImposto){
            case ICMS -> orcamento.getValor().multiply(new BigDecimal("0.1"));
            case ISS -> orcamento.getValor().multiply(new BigDecimal("0.06"));
            default -> BigDecimal.ZERO;
        };

    }
}
