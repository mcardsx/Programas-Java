
public class Conta {

	int numero;
	int agencia;
	private double saldo;
	Cliente cliente;

	public void consulteSaldo() {
		System.out.println("-------CardBank-------");
		System.out.println("Seu saldo atual é de: " + this.saldo);
	}

	public void deposite(double valor) {
		this.saldo += valor;
	}

	public boolean saque(double valor) {
		if (this.saldo >= valor) {
			this.saldo -= valor;

			return true;
		}
		return false;
	}

	public boolean transfira(Conta destino, double valor) {
		this.saque(valor);
		destino.deposite(valor);

		return true;
	}
}