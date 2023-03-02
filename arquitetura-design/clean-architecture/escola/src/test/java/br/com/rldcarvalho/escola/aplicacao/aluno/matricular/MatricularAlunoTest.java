package br.com.rldcarvalho.escola.aplicacao.aluno.matricular;

import br.com.rldcarvalho.escola.dominio.PublicadorDeEventos;
import br.com.rldcarvalho.escola.dominio.aluno.Aluno;
import br.com.rldcarvalho.escola.dominio.aluno.CPF;
import br.com.rldcarvalho.escola.dominio.aluno.LogAlunoMatriculado;
import br.com.rldcarvalho.escola.infra.aluno.RepositorioDeAlunosEmMemoria;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MatricularAlunoTest {

    @Test
    void alunoDeveriaSerPersistido(){

        RepositorioDeAlunosEmMemoria repositorio = new RepositorioDeAlunosEmMemoria();
        PublicadorDeEventos publicador = new PublicadorDeEventos();
        publicador.adicionar(new LogAlunoMatriculado());
        MatricularAluno useCase = new MatricularAluno(repositorio, publicador);

        MatricularAlunoDto dados = new MatricularAlunoDto(
                "Fulano",
                "123.456.789-00",
                "fulano@email.com");
        useCase.executa(dados);

        Aluno encontrado = repositorio.buscarPorCPF(new CPF("123.456.789-00"));

        assertEquals("Fulano", encontrado.getNome());
        assertEquals("123.456.789-00", encontrado.getCpf().getNumero());
        assertEquals("fulano@email.com", encontrado.getEmail().getEndereco());
    }

}