package br.com.rldcarvalho.escola.academico.aplicacao.aluno.matricular;

import br.com.rldcarvalho.escola.shared.dominio.evento.PublicadorDeEventos;
import br.com.rldcarvalho.escola.academico.dominio.aluno.Aluno;
import br.com.rldcarvalho.escola.academico.dominio.aluno.AlunoMatriculado;
import br.com.rldcarvalho.escola.academico.dominio.aluno.RepositorioDeAlunos;

public class MatricularAluno {

    private final RepositorioDeAlunos repositorio;
    private final PublicadorDeEventos publicador;

    public MatricularAluno(RepositorioDeAlunos repositorio, PublicadorDeEventos publicador) {
        this.repositorio = repositorio;
        this.publicador = publicador;
    }

    public void executa(MatricularAlunoDto dados){
        Aluno novo = dados.criarAluno();
        repositorio.matricular(novo);

        AlunoMatriculado evento = new AlunoMatriculado(novo.getCpf());
        publicador.publicar(evento);
    }
}
