package br.com.cardbank.banco.v2.teste.io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import br.com.cardbank.banco.v2.modelo.ContaCorrente;

public class TesteSerializacao {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		

        Cliente cliente = new Cliente();
        cliente.setNome("Mateus");
        cliente.setProfissao("Dev e monoRenek");
        cliente.setCpf("234113131");
        
        ContaCorrente cc = new ContaCorrente(22222, 2222222);
        cc.deposite(500);
        
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("cc.bin"));
        oos.writeObject(cc);
        oos.close();
		
	}
}
