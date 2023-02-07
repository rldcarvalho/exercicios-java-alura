package br.com.rldcarvalho.loja.pedido.acao;

import br.com.rldcarvalho.loja.pedido.Pedido;

public class EnviarEmailPedido implements AcaoAposGerarPedido{

    public void executarAcao(Pedido pedido){
        System.out.println("Enviando email com dados do pedido");
    }
}
