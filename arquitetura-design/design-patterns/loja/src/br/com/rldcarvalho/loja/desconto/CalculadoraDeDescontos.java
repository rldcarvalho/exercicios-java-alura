package br.com.rldcarvalho.loja.desconto;

import br.com.rldcarvalho.loja.orcamento.Orcamento;

import java.math.BigDecimal;

public class CalculadoraDeDescontos {

    public BigDecimal calcular(Orcamento orcamento){

        Desconto desconto = new DescontoParaMaisDeCincoItens(
                new DescontoParaValorMaiorQueQuinhentos(new DescontoParaValorMaiorQueQuinhentos(
                       new SemDesconto())));


        return desconto.efetuarCalculo(orcamento);
    }

}
