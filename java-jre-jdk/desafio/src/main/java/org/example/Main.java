package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Conta conta = new Conta("Rafael", TipoConta.CORRENTE, 500.00);
        MenuEletronico menu = new MenuEletronico();

        menu.iniciarOperacao(conta);

        Scanner leitura = new Scanner(System.in);
        int opcao = 0;

        while (opcao != 4){
            menu.repetirOperacao();
            opcao = leitura.nextInt();
            switch (opcao) {
                case 1:
                    conta.consultaSaldo();
                    break;
                case 2:
                    System.out.println("Digite o valor a ser depositado:");
                    double valorADepositar = leitura.nextInt();
                    conta.depositaValor(valorADepositar);
                    break;
                case 3:
                    System.out.println("Digite o valor a ser transferido:");
                    double valorATransferir = leitura.nextInt();
                    conta.transfereValor(valorATransferir);
                    break;
                case 4:
                    break;
                default:
                    System.out.println("Valor inválido. Digite um valor de 1 a 4 correspondente ao valor indicado no menu.");

            }
        }

        System.out.println("Operação finalizada!");
    }

}