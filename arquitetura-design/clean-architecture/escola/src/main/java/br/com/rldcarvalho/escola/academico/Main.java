package br.com.rldcarvalho.escola.academico;

import br.com.rldcarvalho.escola.academico.aplicacao.aluno.matricular.MatricularAluno;
import br.com.rldcarvalho.escola.academico.aplicacao.aluno.matricular.MatricularAlunoDto;
import br.com.rldcarvalho.escola.academico.dominio.PublicadorDeEventos;
import br.com.rldcarvalho.escola.academico.dominio.aluno.LogAlunoMatriculado;
import br.com.rldcarvalho.escola.academico.infra.aluno.RepositorioDeAlunosEmMemoria;

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
