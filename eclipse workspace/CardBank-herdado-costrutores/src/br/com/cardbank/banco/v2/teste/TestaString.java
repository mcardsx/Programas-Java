package br.com.cardbank.banco.v2.teste;

public class TestaString {
	
	public static void main(String[] args) {
		
		String nome = "ma:ri:o"; //object literal. Boa pr�tica
		String outro = new String("LUIGI"); //M� pr�tica
		
		 nome = nome.replace('m', 'M'); //Strings s�o imut�veis mas podem receber outras(ou ela mesma)
		                               //por refer�ncia.
		 outro = outro.toLowerCase();
		
		String nomeCpslock = nome.toUpperCase();
		
		 System.out.println(nome);
		 System.out.println(outro);
		 System.out.println(nomeCpslock);
		 
		 char a = nome.charAt(0);
		 System.out.println(a);
		 
		 int posicaoDeInicio = nome.indexOf("ario");
		 System.out.println(posicaoDeInicio);
		 
		 String substring = nome.substring(1);
		 System.out.println(substring);
		 
		 for(int index = 0; index < nome.length(); index++) {
			 System.out.println(nome.charAt(index));
		 }
		 
		 System.out.println(outro.contains("lui"));
		
		 System.out.println(nome.isEmpty());
		
		 String espacada = "     tirando espa�os ";
		 String semEspacos = espacada.trim();
		 System.out.println(espacada);
		 System.out.println(semEspacos);
		 
		 String nova = "Mateus:Melhor:Phenix:do:valorant";
		 
		 String[] parts = nova.split(":");
		 
		 for(int index = 0; index<parts.length; index++) {
			 System.out.println("------>" + parts[index]);
		 }
		 
		 
	}

}
