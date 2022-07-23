package principal;

public class TestaConversao {
    public static void main(String[] args) {
        double salario = 1270.5;
        int valor = (int) salario;
        System.out.println(valor);

        long numeroGrande = 32156468789456l;
        short valorPequeno = 3214;
        byte numeroPequeno = 127;

        double a = 0.2;
        double b = 0.1;
        double total = a + b;
        System.out.println(total);
    }
}
