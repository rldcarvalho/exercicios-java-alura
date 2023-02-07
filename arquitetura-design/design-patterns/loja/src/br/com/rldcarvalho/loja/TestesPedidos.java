package br.com.rldcarvalho.loja;

import br.com.rldcarvalho.loja.pedido.GeraPedido;
import br.com.rldcarvalho.loja.pedido.GeraPedidoHandler;

import java.math.BigDecimal;

public class TestesPedidos {

    public static void main(String[] args) {

        String cliente = args[0];
        BigDecimal valorOrcamento = new BigDecimal(args[1]);
        int quantidade = Integer.parseInt(args[2]);

        GeraPedido gerador = new GeraPedido(cliente, valorOrcamento, quantidade);
        GeraPedidoHandler handler = new GeraPedidoHandler(/*dependencias*/);
        handler.execute(gerador);
    }
}
