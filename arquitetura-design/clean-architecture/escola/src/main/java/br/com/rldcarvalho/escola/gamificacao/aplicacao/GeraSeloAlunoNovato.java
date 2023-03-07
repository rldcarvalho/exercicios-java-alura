package br.com.rldcarvalho.escola.gamificacao.aplicacao;

import br.com.rldcarvalho.escola.gamificacao.dominio.selo.RepositorioDeSelos;
import br.com.rldcarvalho.escola.gamificacao.dominio.selo.Selo;
import br.com.rldcarvalho.escola.shared.dominio.CPF;
import br.com.rldcarvalho.escola.shared.dominio.evento.Evento;
import br.com.rldcarvalho.escola.shared.dominio.evento.Ouvinte;
import br.com.rldcarvalho.escola.shared.dominio.evento.TipoDeEvento;

public class GeraSeloAlunoNovato extends Ouvinte {

    private final RepositorioDeSelos repositorioDeSelos;

    public GeraSeloAlunoNovato(RepositorioDeSelos repositorioDeSelos) {
        this.repositorioDeSelos = repositorioDeSelos;
    }

    @Override
    protected void reageAo(Evento evento) {
        CPF cpfDoAluno = (CPF) evento.informacoes().get("cpf");
        Selo novato = new Selo(cpfDoAluno, "Novato");
        repositorioDeSelos.adicionar(novato);
    }

    @Override
    protected boolean deveProcessar(Evento evento) {
        return evento.tipo() == TipoDeEvento.ALUNO_MATRICULADO;
    }
}
