package br.com.rldcarvalho.escola.academico.infra.aluno;

import br.com.rldcarvalho.escola.academico.dominio.aluno.AlunoNaoEncontrado;
import br.com.rldcarvalho.escola.academico.dominio.aluno.RepositorioDeAlunos;
import br.com.rldcarvalho.escola.academico.dominio.aluno.Aluno;
import br.com.rldcarvalho.escola.shared.dominio.CPF;

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
                .filter(a -> a.getCpf().getNumero().equals(cpf.getNumero())).findFirst()
                .orElseThrow(() -> new AlunoNaoEncontrado(cpf));
    }

    @Override
    public List<Aluno> listarTodosAlunosMatriculados() {
        return this.matriculados;
    }
}
