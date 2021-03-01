package br.com.alura.java.io.teste;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class TesteSerializacaoCliente {
	
	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		
		/*Cliente cliente = new Cliente();
		cliente.setNome("Mateus");
		cliente.setCpf("10899977721");
		cliente.setProfissao("monoRenek e Dev");
		
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("cliente.bin"));
		oos.writeObject(cliente);
		oos.close();*/
		
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("cliente.bin"));
		Cliente cliente = (Cliente) ois.readObject();
		
		String nome = cliente.getNome();	
		
		System.out.println(nome);
		
		
		
	}

}
