package projeto.testes;

import projeto.principal.Aluno;
import projeto.principal.Aula;
import projeto.principal.Curso;

import java.util.Iterator;
import java.util.Set;

public class TestaCursoComAluno {

    public static void main(String[] args) {
        Curso javaColecoes = new Curso("Dominando coleções do Java", "Paulo Silveira");

        javaColecoes.adiciona(new Aula("Trabalhando com Arraylists", 21));
        javaColecoes.adiciona(new Aula("Criando uma aula", 20));
        javaColecoes.adiciona(new Aula("Modelando com coleções", 24));

        Aluno a1 = new Aluno("Rafael Carvalho", 55874);
        Aluno a2 = new Aluno("Joyce Resende", 569874);
        Aluno a3 = new Aluno("Patricia Carvalho", 21478);

        javaColecoes.matricula(a1);
        javaColecoes.matricula(a2);
        javaColecoes.matricula(a3);

        System.out.println("Todos os alunos matriculados");

        System.out.println("Método de iteração utilizado antes do java 5:");

        Set<Aluno> alunos = javaColecoes.getAlunos();
        Iterator<Aluno> iterator = alunos.iterator();
        while (iterator.hasNext()){
            Aluno proximo = iterator.next();
            System.out.println(proximo);
        }

        System.out.println("Iteração pós java 8:");

        javaColecoes.getAlunos().forEach(aluno -> {
            System.out.println(aluno);
        });

        System.out.println("O aluno " + a1 + " está matriculado?");
        System.out.println(javaColecoes.estaMatriculado(a1));

        Aluno rafael = new Aluno("Rafael Carvalho", 55874);
        System.out.println("Esse rafael está matriculado?");
        System.out.println(javaColecoes.estaMatriculado(rafael));


        System.out.println("O a1 equals é igual ao rafael?");
        System.out.println(a1.equals(rafael));

        //obrigatoriamente o seguinte é true:

        System.out.println(a1.hashCode() == rafael.hashCode());
    }
}
