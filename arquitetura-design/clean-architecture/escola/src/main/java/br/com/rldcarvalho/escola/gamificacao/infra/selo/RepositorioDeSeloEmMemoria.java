package br.com.rldcarvalho.escola.gamificacao.infra.selo;

import br.com.rldcarvalho.escola.gamificacao.dominio.selo.RepositorioDeSelos;
import br.com.rldcarvalho.escola.gamificacao.dominio.selo.Selo;
import br.com.rldcarvalho.escola.academico.dominio.aluno.CPF;

import java.util.ArrayList;
import java.util.List;

public class RepositorioDeSeloEmMemoria implements RepositorioDeSelos {

    private List<Selo> selos = new ArrayList<>();

    @Override
    public void adicionar(Selo selo) {
        this.selos.add(selo);
    }

    @Override
    public List<Selo> selosDoAlunoDeCPF(CPF cpf) {
        return this.selos.stream()
                .filter(selo -> selo.getCpfDoAluno().equals(cpf)).toList();
    }
}
