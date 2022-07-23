package principal;

public class TestaGetESet {
    public static void main(String[] args) {
        Conta conta = new Conta(112,5578);
        conta.setNumero(1337);
        System.out.println(conta.getNumero());

        Cliente rafael = new Cliente();
        rafael.setNome("Rafael Carvalho");

        conta.setTitular(rafael);

        System.out.println(conta.getTitular().getNome());

        conta.getTitular().setProfissao("Eng.");


    }
}
