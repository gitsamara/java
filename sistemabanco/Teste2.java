
import java.util.ArrayList;

public class Teste2 {

	public static void main(String[] args) {

		ArrayList<Conta> contas = new ArrayList<Conta>();

		Conta contaSamara = new Conta("Samara", 123, 456789, 0);
		contas.add(contaSamara);

		Conta contaVagner = new Conta("Vagner", 456, 987654, 0);
		contas.add(contaVagner);

		for (Conta temp : contas) {
			System.out.println("Titular: " + temp.nomeTitular + " | Agência: " + temp.numeroAgencia);
		}

	}

}
