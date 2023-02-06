package br.com.rldcarvalho.loja.orcamento.situacao;

import br.com.rldcarvalho.loja.orcamento.Orcamento;

import java.math.BigDecimal;

public class Reprovado extends SituacaoOrcamento{

    public void finalizar(Orcamento orcamento){
        orcamento.setSituacao(new Finalizado());
    }
}
