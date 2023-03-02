package br.com.rldcarvalho.escola;

import br.com.rldcarvalho.escola.aplicacao.aluno.matricular.MatricularAluno;
import br.com.rldcarvalho.escola.aplicacao.aluno.matricular.MatricularAlunoDto;
import br.com.rldcarvalho.escola.dominio.PublicadorDeEventos;
import br.com.rldcarvalho.escola.dominio.aluno.LogAlunoMatriculado;
import br.com.rldcarvalho.escola.infra.aluno.RepositorioDeAlunosEmMemoria;

public class Main {

    public static void main(String[] args) {
        String nome = "Fulano da Silva";
        String cpf = "123.456.789-00";
        String email = "fulano@email.com";

        PublicadorDeEventos publicador = new PublicadorDeEventos();
        publicador.adicionar(new LogAlunoMatriculado());

        MatricularAluno matricular = new MatricularAluno(new RepositorioDeAlunosEmMemoria(), publicador);
        matricular.executa(new MatricularAlunoDto(nome, cpf, email));
    }
}
