package br.com.rldcarvalho.loja;

import br.com.rldcarvalho.loja.orcamento.Orcamento;
import br.com.rldcarvalho.loja.pedido.Pedido;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class TestesPedidos {

    public static void main(String[] args) {

        Orcamento orcamento = new Orcamento(new BigDecimal("600.00"), 4);
        String cliente = "João da Silva";
        LocalDateTime data = LocalDateTime.now();

        Pedido pedido = new Pedido(cliente, data, orcamento);

        System.out.println("Salvar pedido no banco de dados");
        System.out.println("Enviar email com dados do novo pedido");
    }
}
