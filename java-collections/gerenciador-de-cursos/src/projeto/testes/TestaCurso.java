package projeto.testes;

import projeto.principal.Aula;
import projeto.principal.Curso;

import java.util.List;

public class TestaCurso {

    public static void main(String[] args) {

        Curso javaColecoes = new Curso("Dominando coleções do Java", "Paulo Silveira");

        //javaColecoes.getAulas().add(new Aula("Trabalhando com Arraylists", 21));
        javaColecoes.adiciona(new Aula("Trabalhando com Arraylists", 21));
        javaColecoes.adiciona(new Aula("Criando uma aula", 20));
        javaColecoes.adiciona(new Aula("Modelando com coleções", 20));

        System.out.println(javaColecoes.getAulas());


    }
}
