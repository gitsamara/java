package br.com.sistemaOuvidoria.atendimento;

import javax.swing.JOptionPane;

public class Menu {

	public static void main(String[] args) {

		int opcao = 1;
		Ouvidoria ouvidoriaSamara = new Ouvidoria();

		JOptionPane.showMessageDialog(null, "Bem-vindo ao nosso Sistema de Ouvidoria!");

		while (opcao != 5) {

			String opcaoStr = JOptionPane.showInputDialog(
					"Digite sua opção:\n\n 1. Listar ocorrências registradas\n 2. Adicionar uma nova manifestação\n 3. Remover manifestação\n 4. Pesquisar manifestações\n 5. Sair do sistema");
			opcao = Integer.parseInt(opcaoStr);

			if (opcao == 1) {

				// listar as ocorrências

				ouvidoriaSamara.listarOcorrencias();

			} else if (opcao == 2) {

				// leitura dos dados para criação do bd

				int protocolo = ouvidoriaSamara.getOcorrencias().size() + 1; // geração automática do número de
																				// protocolo

				String tipoOcorrencia = JOptionPane
						.showInputDialog("Digite o tipo da sua manifestação (REC, ELO, SUG): ");
				String titulo = JOptionPane.showInputDialog("Assunto: ");
				String texto = JOptionPane.showInputDialog("Descrição: ");

				// criação do bd

				Ocorrencia novaOcorrencia = new Ocorrencia(protocolo, tipoOcorrencia, titulo, texto);

				// adição da nova ocorrência ao sistema

				ouvidoriaSamara.adicionarOcorrencias(novaOcorrencia);

				JOptionPane.showMessageDialog(null, "Ocorrência adicionada com sucesso!");

			} else if (opcao == 3) {

				// remoção de manifestação por nº de protocolo

				int protocoloRemover = Integer.parseInt(
						JOptionPane.showInputDialog("Digite o número do protocolo da ocorrência a ser removida: "));
				ouvidoriaSamara.removerOcorrenciaProtocolo(protocoloRemover);

			} else if (opcao == 4) {

				// pesquisa por tipo de ocorrência

				String tipoPesquisar = JOptionPane.showInputDialog("Digite o tipo de ocorrência a ser pesquisada: ");
				Ocorrencia ocorrenciaEncontrada = ouvidoriaSamara.pesquisarOcorrenciaTipo(tipoPesquisar);

				if (ocorrenciaEncontrada != null) {
					JOptionPane.showMessageDialog(null,
							"Ocorrência encontrada:\n\n" + "Número do protocolo: " + ocorrenciaEncontrada.getProtocolo()
									+ "\n" + "Tipo de ocorrência: " + ocorrenciaEncontrada.getTipoOcorrencia() + "\n"
									+ "Título: " + ocorrenciaEncontrada.getTitulo() + "\n" + "Manifestação: "
									+ ocorrenciaEncontrada.getTexto());
				} else {
					JOptionPane.showMessageDialog(null, "Nenhuma ocorrência encontrada para o tipo: " + tipoPesquisar);
				}

			} else if (opcao != 5) {

				JOptionPane.showMessageDialog(null, "Opção inválida! Tente novamente.");

			}
		}

		JOptionPane.showMessageDialog(null, "Volte sempre! Sua opinião é muito importante.");

	}

}
