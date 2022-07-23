package principal;

public class TestaBanco {
    public static void main(String[] args) {
        Cliente rafael = new Cliente();
        rafael.nome = "Rafael Carvalho";
        rafael.cpf = "111.111.111-11";
        rafael.profissao = "Eng. Eletricista";

        Conta contaDoRafael = new Conta();
        contaDoRafael.titular = rafael;
        contaDoRafael.deposita(1000.00);

        System.out.println(contaDoRafael.titular.nome);


    }
}
