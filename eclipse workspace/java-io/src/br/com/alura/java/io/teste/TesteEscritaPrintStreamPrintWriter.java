package br.com.alura.java.io.teste;

import java.io.*;

public class TesteEscritaPrintStreamPrintWriter {
	
	public static void main(String[] args) throws IOException {
		
		PrintWriter pw = new PrintWriter("lorem3.txt");
		
		pw.print("NEW Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod");
		pw.println();
		pw.print("NEW tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam");
		
		pw.close();
	}

}
