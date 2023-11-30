import javax.swing.JOptionPane;

public class SistemaBanco {

	public static void main(String[] args) {

		Conta contaSamara = new Conta();
		Conta contaVagner = new Conta();

		System.out.println(contaSamara.saldo);

		contaSamara.saldo = 8000;

		String nome = JOptionPane.showInputDialog("Digite o nome do titular da conta Samara: ");
		contaSamara.nomeTitular = nome;

		contaSamara.numeroAgencia = 123;
		contaSamara.numeroConta = 8859700;

		System.out.println(contaSamara.saldo);
		System.out.println(contaVagner.saldo);

	}

}
