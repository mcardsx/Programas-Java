package br.com.alura.java.io.teste;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;

public class TesteLeitura {
	
	public static void main(String[] args) throws IOException {
		
		OutputStream fos = new FileOutputStream("lorem2.txt");//"arquivo binario"
		
		Writer osr = new OutputStreamWriter(fos);//"transformando em carácteres"
		
		BufferedWriter bw = new BufferedWriter(osr);//"guardando um arquivo de carácteres(Reader)"
	
		bw.write("O jogo virou, todos tem o livre arbitrio, eu escolhi ser cantor");
		
		bw.newLine();
		
		bw.write("tchu chu chuuhcuhcuuchu");
		
		bw.close();
	}

}
