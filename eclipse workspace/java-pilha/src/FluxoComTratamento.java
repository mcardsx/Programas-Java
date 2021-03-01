
public class FluxoComTratamento {
	public static void main(String[] args) {
		System.out.println("Inicio do main");
		try {
			metodo1();
		}catch(NullPointerException | ArithmeticException | MinhaExcecao ex) {
			String msg = ex.getMessage();
			System.out.println("Exceptions: "+ msg);
			ex.printStackTrace();
			
		}
		System.out.println("Fim do main");
	}

	private static void metodo1() throws MinhaExcecao{
		System.out.println("Inicio do metodo1");
			metodo2();
		System.out.println("Fim do metodo1");
	}

	private static void metodo2 () throws MinhaExcecao {
		System.out.println("Inicio do metodo2");
		//ArithmeticException exception = new ArithmeticException();
		throw new MinhaExcecao("algo não está certo"); 
		//System.out.println("Fim do metodo2");
	}
}
