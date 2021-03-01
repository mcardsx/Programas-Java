
public class TestaComposicoes {

	public static void main(String[] args) {

		Conta contaDeMateus = new Conta();
		contaDeMateus.cliente = new Cliente();
		contaDeMateus.cliente.nome = "Mateus Cardoso";
		contaDeMateus.cliente.cpf = "777.777.777.-31";
		
		contaDeMateus.cliente.endereco = new Endereco();
		contaDeMateus.cliente.endereco.cidade = "Recife";
		contaDeMateus.cliente.endereco.bairro = "Boa Viagem";
		contaDeMateus.cliente.endereco.logradouro = "Rua Henrique Capitulino";
		contaDeMateus.cliente.endereco.cep = "551111-210";
		
		System.out.println(contaDeMateus.cliente.nome);
		System.out.println(contaDeMateus.cliente.endereco.cidade);
		
	}

}
