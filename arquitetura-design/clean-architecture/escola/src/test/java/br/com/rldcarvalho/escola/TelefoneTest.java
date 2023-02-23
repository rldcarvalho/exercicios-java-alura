package br.com.rldcarvalho.escola;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TelefoneTest {

    @Test
    void naoDeveriaCriarTelefonesComNumerosInvalidos(){
        assertThrows(IllegalArgumentException.class, () -> new Telefone(null, null));
        assertThrows(IllegalArgumentException.class, () -> new Telefone("", ""));
        assertThrows(IllegalArgumentException.class, () -> new Telefone("33", "3333333333"));
        assertThrows(IllegalArgumentException.class, () -> new Telefone("333", "33333333"));
    }

}