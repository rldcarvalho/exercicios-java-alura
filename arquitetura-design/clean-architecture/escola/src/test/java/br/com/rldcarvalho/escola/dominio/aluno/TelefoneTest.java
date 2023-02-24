package br.com.rldcarvalho.escola.dominio.aluno;

import br.com.rldcarvalho.escola.dominio.aluno.Telefone;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TelefoneTest {

    @Test
    void naoDeveriaCriarTelefonesComNumerosInvalidos(){
        assertThrows(IllegalArgumentException.class, () -> new Telefone("11", null));
        assertThrows(IllegalArgumentException.class, () -> new Telefone("11", ""));
        assertThrows(IllegalArgumentException.class, () -> new Telefone("11", "3333333333"));
        assertThrows(IllegalArgumentException.class, () -> new Telefone("11", "3333333"));
    }

    @Test
    void naoDeveriaCriarTelefonesComDDDInvalido(){
        assertThrows(IllegalArgumentException.class, () -> new Telefone( null , "33333333"));
        assertThrows(IllegalArgumentException.class, () -> new Telefone( "", "33333333"));
        assertThrows(IllegalArgumentException.class, () -> new Telefone( "333", "33333333"));
        assertThrows(IllegalArgumentException.class, () -> new Telefone( "3", "33333333"));
    }

    @Test
    void deveriaPermitirCriarTelefoneComDDDENumeroValidos(){
        String ddd = "11";
        String numero = "123456789";
        Telefone telefone = new Telefone(ddd, numero);

        assertEquals(ddd, telefone.getDdd());
        assertEquals(numero, telefone.getNumero());
    }



}