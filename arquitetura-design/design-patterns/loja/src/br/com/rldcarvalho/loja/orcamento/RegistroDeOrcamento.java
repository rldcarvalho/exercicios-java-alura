package br.com.rldcarvalho.loja.orcamento;

import br.com.rldcarvalho.loja.DomainException;
import br.com.rldcarvalho.loja.http.HttpAdapter;

import java.util.Map;

public class RegistroDeOrcamento {

    private HttpAdapter http;

    public RegistroDeOrcamento(HttpAdapter http) {
        this.http = http;
    }

    public void registrar(Orcamento orcamento){

        if (!orcamento.isFinalizado()){
            throw new DomainException("Orçamento não finalizado");
        }

        String url = "http://api.externa/orcamento";
        Map<String, Object> dados = Map.of(
                "valor", orcamento.getValor(),
                "quantidadeItens", orcamento.getQuantidadeItens()
        );

        http.post(url, dados);
    }
}
