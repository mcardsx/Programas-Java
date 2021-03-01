
public class TestaLaços {

	public static void main(String[] args) {
		int linha, coluna;

		for ( linha = 0; linha <= 10; linha++) {
//o segredo é a condição de parada...
			for ( coluna = 0; coluna <= linha; coluna++) {

				
				System.out.print("*");

			}
			
			System.out.print(" linha = " + linha);
			System.out.print(" coluna = " + coluna);

			System.out.println();

		}

	}

}
