package br.com.rldcarvalho.escola.aplicacao.indicacao;

import br.com.rldcarvalho.escola.dominio.aluno.Aluno;

public interface EnviarEmailIndicacao {

    void enviarPara(Aluno indicado);
}
