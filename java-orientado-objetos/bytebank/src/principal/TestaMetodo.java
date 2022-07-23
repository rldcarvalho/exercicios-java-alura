package principal;

public class TestaMetodo {
    public static void main(String[] args) {
        Conta contaUm = new Conta();
        contaUm.deposita(50.0);
        System.out.println(contaUm.saldo);

        contaUm.saca(20);
        System.out.println(contaUm.saldo);

        Conta contaDois = new Conta();
        contaDois.deposita(1000.0);
        boolean resultado = contaDois.transfere(500, contaUm);
        System.out.println(resultado);
        System.out.println(contaUm.saldo);
        System.out.println(contaDois.saldo);

        contaUm.titular = "Rafael";
    }
}
