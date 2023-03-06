package br.com.rldcarvalho.escola.academico.aplicacao.aluno.matricular;

import br.com.rldcarvalho.escola.academico.dominio.PublicadorDeEventos;
import br.com.rldcarvalho.escola.academico.dominio.aluno.Aluno;
import br.com.rldcarvalho.escola.shared.dominio.CPF;
import br.com.rldcarvalho.escola.academico.dominio.aluno.LogAlunoMatriculado;
import br.com.rldcarvalho.escola.academico.infra.aluno.RepositorioDeAlunosEmMemoria;
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