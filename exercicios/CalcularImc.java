import javax.swing.JOptionPane;

public class CalcularImc {

	public static void main(String[] args) {

		String nome = JOptionPane.showInputDialog("digite seu nome: ");

		String alturaStr = JOptionPane.showInputDialog("digite sua altura: ");
		double altura = Double.parseDouble(alturaStr);

		String pesoStr = JOptionPane.showInputDialog("digite sua peso: ");
		double peso = Double.parseDouble(pesoStr);

		double imc = peso / (altura * altura);

		JOptionPane.showMessageDialog(null, nome + ", seu IMC é " + imc);

		if (imc < 18) {
			JOptionPane.showMessageDialog(null, "Você está abaixo do peso ideal!");
		} else if (imc >= 18 && imc < 25) {
			JOptionPane.showMessageDialog(null, "Seu peso está ótimo!");
		} else {
			JOptionPane.showMessageDialog(null, "Procure um profissional da saúde! Você está acima do peso ideal.");
		}

	}

}
