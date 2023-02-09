package br.com.rldcarvalho.loja.pedido.acao;

import br.com.rldcarvalho.loja.pedido.Pedido;

public class LogDePedido implements AcaoAposGerarPedido {

    @Override
    public void executarAcao(Pedido pedido) {
        System.out.println("Pedido foi gerado: " + pedido);
    }
}
