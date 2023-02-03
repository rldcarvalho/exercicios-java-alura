package br.com.rldcarvalho.loja;

import br.com.rldcarvalho.loja.desconto.CalculadoraDeDescontos;
import br.com.rldcarvalho.loja.impostos.CalculadoraDeImpostos;
import br.com.rldcarvalho.loja.impostos.ICMS;
import br.com.rldcarvalho.loja.orcamento.Orcamento;

import java.math.BigDecimal;

public class TesteDescontos {

    public static void main(String[] args) {

        Orcamento primeiro = new Orcamento(new BigDecimal("200"), 6);
        Orcamento segundo = new Orcamento(new BigDecimal("1000"), 4);


        CalculadoraDeDescontos calculadora = new CalculadoraDeDescontos();
        System.out.println(calculadora.calcular(primeiro));
        System.out.println(calculadora.calcular(segundo));
    }
}
