package br.com.rldcarvalho.loja.impostos;

import br.com.rldcarvalho.loja.orcamento.Orcamento;

import java.math.BigDecimal;

public interface Imposto {

    BigDecimal calcular(Orcamento orcamento);
}
