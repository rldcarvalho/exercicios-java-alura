package org.example;

public class MenuEletronico {

    public void iniciarOperacao(Conta conta) {
        String mensagemInicial = """
                ***********************
                Dados iniciais do cliente:
                                
                Nome: %s
                Tipo conta: %s
                Saldo inicial: R$ %,.2f
                ***********************
                """.formatted(conta.getNome(), conta.getTipoConta().getDescricao(), conta.valorSaldo());

        System.out.println(mensagemInicial);
    }

    public void repetirOperacao(){
        System.out.println("""
                Operações
                                
                    1- Consultar saldos
                    2- Receber valor
                    3- Transferir valor
                    4- Sair
                                
                Digite a opção desejada:
                """);
    }
}
