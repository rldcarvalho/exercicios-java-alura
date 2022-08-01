package projeto.testes;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;

public class TestaAlunos {
    public static void main(String[] args) {
        Collection<String> alunos = new HashSet<>();
        alunos.add("Rafael Carvalho");
        alunos.add("Joyce Resende");
        alunos.add("Rodrigo Turini");
        alunos.add("Alberto Souza");
        alunos.add("Nico Steppat");

        boolean pauloEstaMatriculado = alunos.contains("Paulo Silveira");
        alunos.remove("Rodrigo Turini");
        System.out.println(pauloEstaMatriculado);


//        for (String aluno : alunos) {
//            System.out.println(aluno);
//        }

        System.out.println(alunos.size());

        alunos.forEach(aluno -> {
            System.out.println(aluno);
        });

        System.out.println(alunos);

        List<String> alunosEmLista = new ArrayList<>(alunos);
    }
}
