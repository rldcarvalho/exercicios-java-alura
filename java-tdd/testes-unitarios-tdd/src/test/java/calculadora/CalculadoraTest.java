package calculadora;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

//Teste da classe calculadora utilizando JUnit
public class CalculadoraTest {

    @Test
    public void deveriaSomarDoisNumerosPositivos(){
        Calculadora calc = new Calculadora();
        int soma = calc.somar(3, 7);

        Assertions.assertEquals(10, soma);
    }

}
