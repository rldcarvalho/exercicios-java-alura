package br.com.rldcarvalho.escola.infra.selo;

import br.com.rldcarvalho.escola.dominio.aluno.CPF;
import br.com.rldcarvalho.escola.dominio.selo.RepositorioDeSelos;
import br.com.rldcarvalho.escola.dominio.selo.Selo;

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
