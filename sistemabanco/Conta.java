
public class Conta {

	// o que a conta tem
	int numeroAgencia;
	int numeroConta;
	String nomeTitular;
	double saldo;

	// metodos = o que a conta faz
	// void quer dizer que não retorna nada
	public void depositar(double valor) {
		if (valor >= 0) {
			saldo = saldo + valor;
		}
	}

	public double obterSaldo() {
		return saldo;
	}

	public void sacar(double valor) {

		if (valor <= 0) {
			System.out.println("Valor inválido para saque!");
		} else if (valor > 0 && valor <= saldo) {
			saldo = saldo - valor;
		} else {
			System.out.println("Saldo insuficiente!");
		}

		/*
		 * if (valor > 0 && valor <= saldo) { saldo = saldo - valor; } else {
		 * System.out.println("Saldo insuficiente!"); }
		 */

	}

}
