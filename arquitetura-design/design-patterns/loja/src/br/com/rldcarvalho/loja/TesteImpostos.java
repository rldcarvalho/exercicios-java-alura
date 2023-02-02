package br.com.rldcarvalho.loja;

import br.com.rldcarvalho.loja.impostos.CalculadoraDeImpostos;
import br.com.rldcarvalho.loja.impostos.ICMS;
import br.com.rldcarvalho.loja.orcamento.Orcamento;

import java.math.BigDecimal;

public class TesteImpostos {

    public static void main(String[] args) {

        Orcamento orcamento = new Orcamento(new BigDecimal("100"));
        CalculadoraDeImpostos calculadora = new CalculadoraDeImpostos();
        System.out.println(calculadora.calcular(orcamento, new ICMS()));
    }
}
