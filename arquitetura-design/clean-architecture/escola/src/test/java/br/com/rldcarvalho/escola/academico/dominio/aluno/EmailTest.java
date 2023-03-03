package br.com.rldcarvalho.escola.academico.dominio.aluno;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EmailTest {

    @Test
    void naoDeveriaCriarEmailsComEnderecosInvalidos(){
        assertThrows(IllegalArgumentException.class, () -> new Email(null));
        assertThrows(IllegalArgumentException.class, () -> new Email(""));
        assertThrows(IllegalArgumentException.class, () -> new Email("emailinvalido.com"));
    }

    @Test
    void deveriaPermitirCriarEmailComEnderecoValido() {
        String endereco = "aluno@email.com";
        Email email = new Email(endereco);

        assertEquals(endereco, email.getEndereco());
    }

}