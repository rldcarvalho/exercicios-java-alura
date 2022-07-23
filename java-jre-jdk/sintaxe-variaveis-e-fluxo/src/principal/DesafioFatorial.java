package principal;
//Nesse exercício opcional, o seu desafio é imprimir os fatoriais de 1 a 10!
public class DesafioFatorial {
    public static void main(String[] args) {
        int total = 1;
        for (int i = 0; i <= 10; i++) {
            for (int j = 1; j <= i; j++) {
                total *= j;
            }
            System.out.println("O fatorial de " + i + "! é: " + total);
            total = 1;
        }
    }
}
