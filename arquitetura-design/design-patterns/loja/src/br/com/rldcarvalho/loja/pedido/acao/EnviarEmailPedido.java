package br.com.rldcarvalho.loja.pedido.acao;

import br.com.rldcarvalho.loja.pedido.Pedido;

public class EnviarEmailPedido {

    public void executar(Pedido pedido){
        System.out.println("Enviando email com dados do pedido");
    }
}
