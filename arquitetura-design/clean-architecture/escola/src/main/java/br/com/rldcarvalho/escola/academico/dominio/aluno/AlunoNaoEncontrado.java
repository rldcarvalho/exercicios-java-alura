package br.com.rldcarvalho.escola.academico.dominio.aluno;

import br.com.rldcarvalho.escola.shared.dominio.CPF;

public class AlunoNaoEncontrado extends RuntimeException {
    public AlunoNaoEncontrado(CPF cpf) {
        super("Aluno não encontrado com CPF: " + cpf.getNumero());
    }
}
