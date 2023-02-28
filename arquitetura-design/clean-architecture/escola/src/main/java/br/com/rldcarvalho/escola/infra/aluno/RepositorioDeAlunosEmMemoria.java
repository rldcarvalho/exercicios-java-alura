package br.com.rldcarvalho.escola.infra.aluno;

import br.com.rldcarvalho.escola.dominio.aluno.Aluno;
import br.com.rldcarvalho.escola.dominio.aluno.AlunoNaoEncontrado;
import br.com.rldcarvalho.escola.dominio.aluno.CPF;
import br.com.rldcarvalho.escola.dominio.aluno.RepositorioDeAlunos;

import java.util.ArrayList;
import java.util.List;

public class RepositorioDeAlunosEmMemoria implements RepositorioDeAlunos {

    private List<Aluno> matriculados = new ArrayList<>();
    @Override
    public void matricular(Aluno aluno) {
        this.matriculados.add(aluno);
    }

    @Override
    public Aluno buscarPorCPF(CPF cpf) {
        return this.matriculados.stream()
                .filter(a -> a.getCpf().equals(cpf.getNumero())).findFirst()
                .orElseThrow(() -> new AlunoNaoEncontrado(cpf));
    }

    @Override
    public List<Aluno> listarTodosAlunosMatriculados() {
        return this.matriculados;
    }
}
