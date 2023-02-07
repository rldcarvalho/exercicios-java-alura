package br.com.rldcarvalho.loja;

import br.com.rldcarvalho.loja.orcamento.Orcamento;
import br.com.rldcarvalho.loja.pedido.GeraPedido;
import br.com.rldcarvalho.loja.pedido.Pedido;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class TestesPedidos {

    public static void main(String[] args) {

        String cliente = args[0];
        BigDecimal valorOrcamento = new BigDecimal(args[1]);
        int quantidade = Integer.parseInt(args[2]);

        GeraPedido gerador = new GeraPedido(cliente, valorOrcamento, quantidade);
        gerador.excecuta();
    }
}
