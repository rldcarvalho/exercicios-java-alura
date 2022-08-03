package calculadora;

// Testando classe com java puro

public class CalculadoraTestes {
    public static void main(String[] args) {
        Calculadora calc = new Calculadora();
        int soma = calc.somar(5,7);
        System.out.println(soma);

        soma = calc.somar(5,0);
        System.out.println(soma);

        soma = calc.somar(0,0);
        System.out.println(soma);

        soma = calc.somar(3,-1);
        System.out.println(soma);
    }
}
