package projeto.testes;

import projeto.principal.Aluno;
import projeto.principal.Aula;
import projeto.principal.Curso;

public class TestaBuscaAlunosNoCurso {

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

        System.out.println("Quem é o aluno com matricula 569874");
        Aluno aluno = javaColecoes.buscaMatriculado(569874);
    }
}
