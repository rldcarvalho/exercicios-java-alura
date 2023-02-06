package br.com.rldcarvalho.loja.orcamento.situacao;

import br.com.rldcarvalho.loja.orcamento.Orcamento;

import java.math.BigDecimal;

public class Aprovado extends SituacaoOrcamento{

    public BigDecimal calcularValorDescontoExtra(Orcamento orcamento){
        return orcamento.getValor().multiply(new BigDecimal("0.05"));
    }

    public void finalizar(Orcamento orcamento){
        orcamento.setSituacao(new Finalizado());
    }

}
