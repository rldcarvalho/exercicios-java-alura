package principal;

public class TestaCondicionais2 {
    public static void main(String[] args) {

        System.out.println("Testando Condicionais");

        int idade = 20;
        int quantidadePessoas = 3;
        boolean acompanhado = quantidadePessoas >= 2;

        if (idade >= 18 || acompanhado) {
            System.out.println("Você tem mais de 18 anos");
            System.out.println("Seja bem vindo");
        } else {
            System.out.println("Infelizmente você não pode entrar");
        }

    }
}

