package principal;

import org.w3c.dom.ls.LSOutput;

import java.util.*;
import java.util.stream.Collectors;

class Curso {
    private String nome;
    private int alunos;

    public Curso(String nome, int alunos) {
        this.nome = nome;
        this.alunos = alunos;
    }

    public String getNome() {
        return nome;
    }

    public int getAlunos() {
        return alunos;
    }
}

public class ExemploCursos {
    public static void main(String[] args) {
        List<Curso> cursos = new ArrayList<Curso>();
        cursos.add(new Curso("Python", 45));
        cursos.add(new Curso("JavaScript", 150));
        cursos.add(new Curso("Java 8", 113));
        cursos.add(new Curso("C", 55));

        cursos.sort(Comparator.comparing(Curso::getAlunos));
        cursos.forEach(curso -> System.out.println(curso.getNome()));

        System.out.println("----------------------------------");

        cursos.stream()
                .filter(curso -> curso.getAlunos() > 50)
                .forEach(curso -> System.out.println(curso.getNome()));

        System.out.println("----------------------------------");

        cursos.stream()
                .filter(curso -> curso.getAlunos() > 50)
                .map(curso -> curso.getAlunos())
                .forEach(total -> System.out.println(total));

        System.out.println("----------------------------------");

        int sum = cursos.stream()
                .filter(curso -> curso.getAlunos() > 50)
                .mapToInt(curso -> curso.getAlunos())
                .sum();
        System.out.println(sum);

        System.out.println("#################################");

        cursos.stream()
                .filter(curso -> curso.getAlunos() > 50)
                .findAny()
                .ifPresent(curso -> System.out.println(curso.getNome()));

        System.out.println("----------------------------------");

        double mediaAlunos = cursos.stream()
                .mapToDouble(curso -> curso.getAlunos())
                .average()
                .orElse(0.0);
        System.out.println(mediaAlunos);

        System.out.println("----------------------------------");

        List<Curso> cursosFiltrados = cursos.stream()
                .filter(curso -> curso.getAlunos() > 50)
                .collect(Collectors.toList());
    }
}
