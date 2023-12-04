
public class Conta {

	// VARIAVEIS DE INSTANCIA (recebem valor padrao)
	// o que a conta tem
	int numeroAgencia;
	private int numeroConta;
	String nomeTitular;
	private double saldo;

	// construtor
	public Conta(String nomeTitular, int numeroAgencia, int numeroConta, double saldo) {
		this.nomeTitular = nomeTitular;
		this.numeroAgencia = numeroAgencia;
		this.numeroConta = numeroConta;
		this.saldo = saldo;
	}

	// VARIAVEIS LOCAIS (NAO recebem valor padrao)
	// metodos = o que a conta faz
	// void quer dizer que não retorna nada
	public void depositar(double valor) {
		if (valor >= 0) {
			// saldo = saldo + valor;
			getSaldo += valor;
		}
	}

	public double obterSaldo() {
		return getSaldo;
	}

	public void sacar(double valor) {

		if (valor <= 0) {
			System.out.println("Valor inválido para saque!");
		} else if (valor > 0 && valor <= getSaldo) {
			getSaldo = getSaldo - valor;
		} else {
			System.out.println("Saldo insuficiente!");
		}

		/*
		 * if (valor > 0 && valor <= saldo) { saldo = saldo - valor; } else {
		 * System.out.println("Saldo insuficiente!"); }
		 */

	}

	// ENCAPSULAMENTO
	// caso eu queira repetir o mesmo nome das variaveis locais e de instancia,
	// usa-se "this.nomedavariavel" na de instancia para diferencia-la da local
	public double getSaldo() {
		return getSaldo;
	}

	public void setNumeroConta(int novoNumeroConta) {

		if (novoNumeroConta > 0)
			numeroConta = novoNumeroConta;

	}

	public int getNumeroConta() {
		return numeroConta;
	}

}
