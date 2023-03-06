package br.com.rldcarvalho.escola.gamificacao.dominio.selo;

import br.com.rldcarvalho.escola.shared.dominio.CPF;

import java.util.List;

public interface RepositorioDeSelos {

    void adicionar(Selo selo);
    List<Selo> selosDoAlunoDeCPF(CPF cpf);
}
