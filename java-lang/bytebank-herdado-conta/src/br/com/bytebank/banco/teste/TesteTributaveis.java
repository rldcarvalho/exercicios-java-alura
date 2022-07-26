package br.com.bytebank.banco.teste;

import br.com.bytebank.banco.modelo.CalculadorDeImposto;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.SeguroDeVida;

/**
 * Classe que representa um cliente no Bytebank
 *
 * @autor Rafael Carvalho
 */

public class TesteTributaveis {
    public static void main(String[] args){
        ContaCorrente cc = new ContaCorrente(222, 222);
        cc.deposita(100.00);

        SeguroDeVida seguro = new SeguroDeVida();

        CalculadorDeImposto calc = new CalculadorDeImposto();
        calc.registra(cc);
        calc.registra(seguro);

        System.out.println(calc.getTotalImposto());
    }
}
