package br.com.bytebank.banco.teste;

import br.com.bytebank.banco.modelo.Cliente;
import br.com.bytebank.banco.modelo.ContaCorrente;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class TesteSerialização {

    public static void main(String[] args) throws IOException {

        Cliente cliente = new Cliente();
        cliente.setNome("Rafael");
        cliente.setProfissao("Dev");
        cliente.setCpf("12312312355");

        ContaCorrente cc = new ContaCorrente(222, 333);
        cc.deposita(222.3);
        cc.setTitular(cliente);

        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("cc.bin"));
        oos.writeObject(cc);
        oos.close();
    }
}
