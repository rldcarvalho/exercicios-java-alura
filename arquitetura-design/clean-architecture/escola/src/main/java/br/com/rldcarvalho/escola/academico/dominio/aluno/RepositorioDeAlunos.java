package br.com.rldcarvalho.escola.academico.dominio.aluno;

import br.com.rldcarvalho.escola.shared.dominio.CPF;

import java.util.List;

public interface RepositorioDeAlunos {

    void matricular(Aluno aluno);

    Aluno buscarPorCPF(CPF cpf);

    List<Aluno> listarTodosAlunosMatriculados();
}
