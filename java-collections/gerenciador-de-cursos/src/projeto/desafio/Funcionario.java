package projeto.desafio;

public class Funcionario implements Comparable<Funcionario>{

    private String nome;
    private int idade;

    public Funcionario(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {

        this.nome = nome;

    }

    public int getIdade() {
        return this.idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }


    @Override
    public int compareTo(Funcionario outroFuncionario) {
        if (this.idade < outroFuncionario.idade) {
            return -1;
        }
        if (this.idade > outroFuncionario.idade) {
            return 1;
        }
        return 0;
    }
}
