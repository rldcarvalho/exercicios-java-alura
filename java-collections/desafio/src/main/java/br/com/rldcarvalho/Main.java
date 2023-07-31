package br.com.rldcarvalho;

import java.math.BigDecimal;
import java.util.Collections;
import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        System.out.println("Digite o limite do cartão: ");

        CartaoDeCredito cartao = new CartaoDeCredito(leitura.nextDouble());

        String controle = "1";

        while (!Objects.equals(controle, "0")) {
            if (Objects.equals(controle, "1")) {
                if (realizaCompra(leitura, cartao)) {
                    System.out.println("Compra realizada!");
                    System.out.println("Saldo do cartão: " + cartao.getSaldo());
                    System.out.println("Digite 0 para sair ou 1 para continuar: ");
                    controle = leitura.next();
                } else {
                    System.out.println("Saldo insuficiente!");
                    finalizaCompra(cartao);
                }
            } else {
                System.out.println("Número inválido!");
                System.out.println("Digite 0 para sair ou 1 para continuar: ");
                controle = leitura.next();
            }
        }
        finalizaCompra(cartao);

    }

    private static boolean realizaCompra(Scanner leitura, CartaoDeCredito cartao) {
        System.out.println("Digite a descrição da compra: ");
        String descricao = leitura.next();

        System.out.println("Digite o valor da compra:");
        BigDecimal valor = leitura.nextBigDecimal();

        Compra compra = new Compra(descricao, valor);

        return cartao.addCompra(compra);
    }

    private static void finalizaCompra(CartaoDeCredito cartao) {
        System.out.println("********************");
        System.out.println("COMPRAS REALIZADAS:");
        Collections.sort(cartao.getCompras());
        cartao.getCompras().forEach( compra -> System.out.println(compra.getDescricao() + " - " + compra.getValor()));
        System.out.println("********************");
        System.out.println("Saldo do cartão: " + cartao.getSaldo());
    }
}