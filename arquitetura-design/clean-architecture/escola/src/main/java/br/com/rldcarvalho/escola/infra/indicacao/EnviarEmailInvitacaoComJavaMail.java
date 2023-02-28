package br.com.rldcarvalho.escola.infra.indicacao;

import br.com.rldcarvalho.escola.aplicacao.indicacao.EnviarEmailIndicacao;
import br.com.rldcarvalho.escola.dominio.aluno.Aluno;

public class EnviarEmailInvitacaoComJavaMail implements EnviarEmailIndicacao {

    @Override
    public void enviarPara(Aluno indicado) {
        //logica de envio de email com a lib java Mail
    }
}
