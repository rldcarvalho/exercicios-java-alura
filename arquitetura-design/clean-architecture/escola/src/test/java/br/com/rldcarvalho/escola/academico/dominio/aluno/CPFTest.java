package br.com.rldcarvalho.escola.academico.dominio.aluno;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CPFTest {

    @Test
    void naoDeveriaCriarCPFsComNumerosInvalidos(){
        assertThrows(IllegalArgumentException.class, () -> new CPF(null));
        assertThrows(IllegalArgumentException.class, () -> new CPF(""));
        assertThrows(IllegalArgumentException.class, () -> new CPF("1111111111"));
    }

    @Test
    void deveriaPermitirCriarCPFComNumeroValido(){
        String numero = "111.111.111-11";
        CPF cpf = new CPF(numero);

        assertEquals(numero, cpf.getNumero());
    }
}