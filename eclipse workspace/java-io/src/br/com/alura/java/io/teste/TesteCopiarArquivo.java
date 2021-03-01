package br.com.alura.java.io.teste;

import java.io.*;

public class TesteCopiarArquivo {
	
	public static void main(String[] args) throws IOException {

//Guardando Arquivo
		InputStream fis = System.in;
		
		Reader isr = new InputStreamReader(fis);//"transformando em car�cteres"
		
		BufferedReader br = new BufferedReader(isr);//"guardando um arquivo de car�cteres(Reader)"

//Escrevendo Arquivo
		OutputStream fos = new FileOutputStream("lorem3.txt");	//Processo Inverso
		
		Writer osw = new OutputStreamWriter(fos);
		
		BufferedWriter bw = new BufferedWriter(osw); 
		
		String linha = br.readLine();//lendo arquivo guardado
		
		while(linha != null && !linha.isEmpty()) {
			//System.out.println(linha);
			//linha = br.readLine();
			
			bw.write(linha);
			bw.newLine();
			bw.flush();
			linha = br.readLine();
		}
		
		br.close();
		bw.close();
	}

}
