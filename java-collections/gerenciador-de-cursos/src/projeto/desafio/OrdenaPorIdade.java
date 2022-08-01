package projeto.desafio;

import java.util.Comparator;

public class OrdenaPorIdade implements Comparator<Funcionario> {

    @Override
    public int compare(Funcionario o1, Funcionario o2) {
        return o1.compareTo(o2);
    }
}
