package br.com.rldcarvalho.loja.impostos;

import br.com.rldcarvalho.loja.orcamento.Orcamento;

import java.math.BigDecimal;

public class ICMSComISS implements Imposto{

    @Override
    public BigDecimal calcular(Orcamento orcamento) {
        BigDecimal icms = new ICMS().calcular(orcamento);
        BigDecimal iss = new ISS().calcular(orcamento);
        return icms.add(iss);
    }
}
