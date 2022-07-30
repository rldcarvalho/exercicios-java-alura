package projeto.teste;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class TesteLeitura {

    public static void main(String[] args) throws IOException {

        //Fluxo de entrada com arquivo

        InputStream fis = new FileInputStream("lorem.txt");
        Reader isr = new InputStreamReader(fis, StandardCharsets.UTF_8);
        BufferedReader br = new BufferedReader(isr);

        String linha = br.readLine();

        while (linha != null ){
            System.out.println(linha);
            linha = br.readLine();
        }

        br.close();

    }
}
