package projeto.teste;

import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

public class TesteUnicodeEEncoding {

    public static void main(String[] args) throws UnsupportedEncodingException {

        String s = "ç";
        System.out.println(s.codePointAt(0));

        Charset charset = Charset.defaultCharset();
        System.out.println(charset.displayName());

        byte[] bytes = s.getBytes(StandardCharsets.UTF_8);
        System.out.println(bytes.length + ", utf-8");
        String sNovo = new String(bytes, "UTF-8");
        System.out.println(sNovo);

        bytes = s.getBytes(StandardCharsets.UTF_16);
        System.out.println(bytes.length + ", utf-16");
        sNovo = new String(bytes, "UTF-16");
        System.out.println(sNovo);

        bytes = s.getBytes(StandardCharsets.US_ASCII);
        System.out.println(bytes.length + ", US_ASCII");
        sNovo = new String(bytes, "US-ASCII");
        System.out.println(sNovo);
    }
}
