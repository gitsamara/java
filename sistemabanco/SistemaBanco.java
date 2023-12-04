import javax.swing.JOptionPane;

public class SistemaBanco {

	public static void main(String[] args) {

		Conta contaSamara = new Conta("Samara", 123, 456789, 0);
		Conta contaVagner = new Conta("Vagner", 456, 987654, 0);
		
		/*
		
		//metodo get serve para pegar os valores das variaveis que estao privadas
		System.out.println(contaSamara.getSaldo());
		
		double meuSaldo = contaSamara.getSaldo();
		System.out.println(meuSaldo);

		String nome = JOptionPane.showInputDialog("Digite o nome do titular da conta Samara: ");
		contaSamara.nomeTitular = nome;

		contaSamara.numeroAgencia = 123;
		contaSamara.getNumeroConta();

		double valorDeposito = 500;
		contaSamara.depositar(valorDeposito);

		System.out.println(contaSamara.getSaldo());
		System.out.println(contaVagner.getSaldo());

		double valorSaldo = contaSamara.obterSaldo();
		
		contaSamara.depositar(1000);
		System.out.println(contaSamara.getSaldo());
		
		contaSamara.sacar(325);
		System.out.println(contaSamara.getSaldo());
		
		contaSamara.setNumeroConta(100);
		System.out.println(contaSamara.getNumeroConta()); */

	}

}
