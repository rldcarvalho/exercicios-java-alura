package br.com.rldcarvalho.loja;

import br.com.rldcarvalho.loja.http.JavaHttpClient;
import br.com.rldcarvalho.loja.orcamento.Orcamento;
import br.com.rldcarvalho.loja.orcamento.RegistroDeOrcamento;

import java.math.BigDecimal;

public class TestesAdapter {

    public static void main(String[] args) {

        Orcamento orcamento = new Orcamento(BigDecimal.TEN, 1);
        orcamento.aprovar();
        orcamento.finalizar();

        RegistroDeOrcamento registro = new RegistroDeOrcamento(new JavaHttpClient());

        registro.registrar(orcamento);
    }
}
