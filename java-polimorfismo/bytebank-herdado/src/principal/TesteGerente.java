package principal;

public class TesteGerente {
    public static void main(String[] args) {
        Gerente g1 = new Gerente();
        g1.setNome("Marcos");
        g1.setCpf("122122122-22");
        g1.setSalario(5000.00);
        g1.setSenha(2222);

        System.out.println(g1.getNome());
        System.out.println(g1.getCpf());
        System.out.println(g1.getSalario());

        boolean autenticou = g1.autentica(2222);
        System.out.println(autenticou);

        System.out.println(g1.getBonificacao());



    }


}
