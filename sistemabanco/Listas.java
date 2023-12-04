import javax.swing.JOptionPane;

public class Listas {

	public static void main(String[] args) {
		
		String titular = JOptionPane.showInputDialog("Digite o nome do titular da conta: ");
		
		String agenciaStr = JOptionPane.showInputDialog("Digite o número da agência: ");
		int agencia = Integer.parseInt(agenciaStr);
		
		String contaStr = JOptionPane.showInputDialog("Digite o número da conta: ");
		int numeroConta = Integer.parseInt(contaStr);
		
		String saldoStr = JOptionPane.showInputDialog("Digite o saldo: ");
		double saldo = Double.parseDouble(saldoStr);
		
		Conta contaSamara = new Conta (titular, agencia, numeroConta, saldo);
				
	}

}
