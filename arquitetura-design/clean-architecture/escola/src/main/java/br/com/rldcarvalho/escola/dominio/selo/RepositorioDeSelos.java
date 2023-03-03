package br.com.rldcarvalho.escola.dominio.selo;

import br.com.rldcarvalho.escola.dominio.aluno.CPF;

import java.util.List;

public interface RepositorioDeSelos {

    void adicionar(Selo selo);
    List<Selo> selosDoAlunoDeCPF(CPF cpf);
}
