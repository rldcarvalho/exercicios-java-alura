package br.com.rldcarvalho.escola.academico.dominio.aluno;

import br.com.rldcarvalho.escola.academico.dominio.Ouvinte;
import br.com.rldcarvalho.escola.academico.dominio.Evento;

import java.time.format.DateTimeFormatter;

public class LogAlunoMatriculado extends Ouvinte {

    public void reageAo(Evento evento){
        String momentoFormatado = evento.momento().format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm"));
        System.out.println(
                String.format(
                        "Aluno com CPF %s matriculado em: %s", ((AlunoMatriculado)evento).getCpfDoAluno(), momentoFormatado));
    }

    @Override
    protected boolean deveProcessar(Evento evento) {
        return evento instanceof AlunoMatriculado;
    }
}
