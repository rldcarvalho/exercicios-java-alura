package br.com.rldcarvalho.loja;

import br.com.rldcarvalho.loja.desconto.CalculadoraDeDescontos;
import br.com.rldcarvalho.loja.impostos.CalculadoraDeImpostos;
import br.com.rldcarvalho.loja.impostos.ICMS;
import br.com.rldcarvalho.loja.orcamento.ItemOrcamento;
import br.com.rldcarvalho.loja.orcamento.Orcamento;

import java.math.BigDecimal;

public class TesteDescontos {

    public static void main(String[] args) {

        Orcamento primeiro = new Orcamento();
        primeiro.adicionarItem(new ItemOrcamento(new BigDecimal("200")));
        Orcamento segundo = new Orcamento();
        segundo.adicionarItem(new ItemOrcamento(new BigDecimal("1000")));

        CalculadoraDeDescontos calculadora = new CalculadoraDeDescontos();
        System.out.println(calculadora.calcular(primeiro));
        System.out.println(calculadora.calcular(segundo));
    }
}
