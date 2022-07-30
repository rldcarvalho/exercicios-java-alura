package projeto.teste;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class TesteEscritaPrintWriter {

    public static void main(String[] args) throws IOException {

//        OutputStream fos = new FileOutputStream("lorem2.txt");
//        Writer osw = new OutputStreamWriter(fos);
//        BufferedWriter bw = new BufferedWriter(osw);

//        BufferedWriter bw = new BufferedWriter(new FileWriter("lorem2.txt"));
//        PrintStream ps = new PrintStream("lorem2.txt");
        PrintWriter ps = new PrintWriter("lorem2.txt", StandardCharsets.UTF_8);

        ps.println("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod");
        ps.println();
        ps.println("tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, ");

        ps.close();
        
    }
}
