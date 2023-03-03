package br.com.rldcarvalho.escola.academico.dominio.aluno;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AlunoTest {

    Aluno aluno;
    @BeforeEach
    void setUp() {
        CPF cpf = new CPF("123.456.789-00");
        String nome = "João da Silva";
        Email email = new Email("joao@email.com");
        this.aluno = new Aluno(cpf, nome, email);
    }

    @Test
    void deveriaPermitirCadastrarUmTelefone(){
        this.aluno.adicionarTelefone("33", "33333333");
        assertEquals(1, this.aluno.getTelefones().size());
    }

    @Test
    void deveriaPermitirCadastrarDoisTelefones(){
        this.aluno.adicionarTelefone("33", "33333333");
        this.aluno.adicionarTelefone("33", "44444444");
        assertEquals(2, this.aluno.getTelefones().size());
    }

    @Test
    void naoDeveriaPermitirCadastrarTresTelefones(){
        this.aluno.adicionarTelefone("33", "33333333");
        this.aluno.adicionarTelefone("33", "44444444");
        assertThrows(NumeroMaximoDeTelefonesAtingido.class, () -> this.aluno.adicionarTelefone("33", "55555555"));
    }
}