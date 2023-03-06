package br.com.rldcarvalho.escola.academico.dominio.aluno;

import br.com.rldcarvalho.escola.academico.dominio.Evento;
import br.com.rldcarvalho.escola.shared.dominio.CPF;

import java.time.LocalDateTime;

public class AlunoMatriculado implements Evento {

    private final CPF cpfDoAluno;
    private final LocalDateTime momento;

    public AlunoMatriculado(CPF cpfDoAluno) {
        this.cpfDoAluno = cpfDoAluno;
        this.momento = LocalDateTime.now();
    }

    @Override
    public LocalDateTime momento() {
        return this.momento;
    }

    public CPF getCpfDoAluno() {
        return cpfDoAluno;
    }
}
