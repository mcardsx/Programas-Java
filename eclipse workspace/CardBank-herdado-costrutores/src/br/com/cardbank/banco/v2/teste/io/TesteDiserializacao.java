package br.com.cardbank.banco.v2.teste.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

import br.com.cardbank.banco.v2.modelo.ContaCorrente;

public class TesteDiserializacao {
	
	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("cc.bin"));
		ContaCorrente cc = (ContaCorrente) ois.readObject(); 
		
		cc.consulteSaldo();
		
	}

}