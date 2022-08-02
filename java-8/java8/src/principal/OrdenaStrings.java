package principal;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

public class OrdenaStrings {

    public static void main(String[] args) {

        List<String> palavras = new ArrayList<>();
        palavras.add("alura online");
        palavras.add("editora casa do codigo");
        palavras.add("caelum");


//        Comparator<String> comparador = new ComparadorPorTamanho();
//        Collections.sort(palavras, comparador); //metodo pre java 8

//        palavras.sort(comparador);

//        palavras.sort((s1, s2) -> s1.length() - s2.length());

        palavras.sort(Comparator.comparing(String::length));

        System.out.println(palavras);

//        -------------------------------------------
//        for (String palavra : palavras) { //método pre java 8
//            System.out.println(palavra);
//        }

//        Consumer<String> consumidor = new imprimeNaLinha();
//        palavras.forEach(consumidor);

//        palavras.forEach(s -> System.out.println(s));

        palavras.forEach(System.out::println);


    }
}

//class ComparadorPorTamanho implements Comparator<String>{
//
//    @Override
//    public int compare(String s1, String s2) {
//        return s1.length() - s2.length();
//    }
//}


//class imprimeNaLinha implements Consumer<String>{
//
//    @Override
//    public void accept(String s) {
//        System.out.println(s);
//    }
//}
