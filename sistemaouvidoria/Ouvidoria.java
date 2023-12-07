package br.com.sistemaOuvidoria.atendimento;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Ouvidoria {

	private ArrayList<Ocorrencia> ocorrencias = new ArrayList<Ocorrencia>();

	public void adicionarOcorrencias(Ocorrencia novaOcorrencia) {
		ocorrencias.add(novaOcorrencia);
	}

	public Ocorrencia pesquisarOcorrenciaTipo(String tipoOcorrencia) {

		Ocorrencia ocorrenciaEncontrada = null;

		for (Ocorrencia temp : ocorrencias) {

			if (temp.getTipoOcorrencia().equals(tipoOcorrencia)) {
				ocorrenciaEncontrada = temp;
				break;
			}
		}

		return ocorrenciaEncontrada;
	}

	public void removerOcorrenciaProtocolo(int protocolo) {
		Ocorrencia ocorrenciaEncontrada = null;

		// Encontrar a ocorrência pelo protocolo
		for (Ocorrencia temp : ocorrencias) {
			if (temp.getProtocolo() == protocolo) {
				ocorrenciaEncontrada = temp;
				break;
			}
		}

		// Remover a ocorrência encontrada (se existir)
		if (ocorrenciaEncontrada != null) {
			ocorrencias.remove(ocorrenciaEncontrada);
			JOptionPane.showMessageDialog(null, "Manifestação removida com sucesso!");
		} else {
			JOptionPane.showMessageDialog(null, "Manifestação não encontrada para o protocolo " + protocolo);

		}
	}

	public void listar() {

		for (Ocorrencia ocorrencia : ocorrencias) {
			System.out.println("nº do protocolo: " + ocorrencia.getProtocolo() + " | tipo de manifestação: "
					+ ocorrencia.getTipoOcorrencia() + " | título: " + ocorrencia.getTitulo() + " | manifestação: "
					+ ocorrencia.getTexto());

		}
	}

	public ArrayList<Ocorrencia> getOcorrencias() {
		return ocorrencias;
	}

}
