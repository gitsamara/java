import javax.swing.JOptionPane;

public class Teste1 {

	public static void main(String[] args) {

		// 1 listar contas, 2 adicionar nova conta, 3 sair do sistema

		int opcao = 1;

		while (opcao != 3) {

			String opcaoStr = JOptionPane.showInputDialog(
					"Banco Itaú \n 1) Listar contas; \n 2) Adicionar nova conta; \n 3) Sair do sistema.");
			opcao = Integer.parseInt(opcaoStr);

			System.out.println(opcao);

		}

	}

}
