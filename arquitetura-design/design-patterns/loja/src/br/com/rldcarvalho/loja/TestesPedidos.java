package br.com.rldcarvalho.loja;

import br.com.rldcarvalho.loja.pedido.GeraPedido;
import br.com.rldcarvalho.loja.pedido.GeraPedidoHandler;
import br.com.rldcarvalho.loja.pedido.acao.EnviarEmailPedido;
import br.com.rldcarvalho.loja.pedido.acao.LogDePedido;
import br.com.rldcarvalho.loja.pedido.acao.SalvarPedidoNoBancoDeDados;

import java.math.BigDecimal;
import java.util.Arrays;

public class TestesPedidos {

    public static void main(String[] args) {

        String cliente = "João da Silva";
        BigDecimal valorOrcamento = new BigDecimal("600.00");
        int quantidade = 4;

        GeraPedido gerador = new GeraPedido(cliente, valorOrcamento, quantidade);
        GeraPedidoHandler handler = new GeraPedidoHandler(
                Arrays.asList(new SalvarPedidoNoBancoDeDados(),
                        new EnviarEmailPedido(),
                        new LogDePedido())
        );
        handler.execute(gerador);
    }
}
