package principal;

public class TesteFuncionario {
    public static void main(String[] args) {

        Funcionario rafael = new Funcionario();
        rafael.setNome("Rafael Carvalho");
        rafael.setCpf("111111111-9");
        rafael.setSalario(2500.00);

        System.out.println(rafael.getNome());
        System.out.println(rafael.getBonificacao());

    }
}
