package projeto.teste;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class TesteLeitura2 {

    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(new File("contas.csv"), StandardCharsets.UTF_8);

        while (scanner.hasNextLine()) {
            String linha = scanner.nextLine();
            //System.out.println(linha);

            Scanner linhaScanner = new Scanner(linha);
            linhaScanner.useLocale(Locale.US);
            linhaScanner.useDelimiter(",");

            String tipoConta = linhaScanner.next();
            int agencia = linhaScanner.nextInt();
            int numero = linhaScanner.nextInt();
            String nome = linhaScanner.next();
            double saldo = linhaScanner.nextDouble();

            String valorFormatado = String.format(new Locale("pt", "BR"),
                    "%s - %04d-%08d, %s: %.2f",
                    tipoConta, agencia, numero, nome, saldo);
            System.out.println(valorFormatado);

            linhaScanner.close();

//            String[] valores = linha.split(",");
//            System.out.println(valores[3]);
        }

        scanner.close();

    }
}
