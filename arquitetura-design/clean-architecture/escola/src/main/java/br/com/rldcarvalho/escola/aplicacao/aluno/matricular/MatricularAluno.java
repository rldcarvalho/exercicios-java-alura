package br.com.rldcarvalho.escola.aplicacao.aluno.matricular;

import br.com.rldcarvalho.escola.dominio.aluno.Aluno;
import br.com.rldcarvalho.escola.dominio.aluno.RepositorioDeAlunos;

public class MatricularAluno {

    private final RepositorioDeAlunos repositorio;

    public MatricularAluno(RepositorioDeAlunos repositorio) {
        this.repositorio = repositorio;
    }

    public void executa(MatricularAlunoDto dados){
        Aluno novo = dados.criarAluno();
        repositorio.matricular(novo);
    }
}