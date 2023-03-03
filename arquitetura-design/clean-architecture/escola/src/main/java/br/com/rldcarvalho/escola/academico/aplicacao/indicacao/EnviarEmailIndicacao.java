package br.com.rldcarvalho.escola.academico.aplicacao.indicacao;

import br.com.rldcarvalho.escola.academico.dominio.aluno.Aluno;

public interface EnviarEmailIndicacao {

    void enviarPara(Aluno indicado);
}
