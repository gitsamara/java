package br.com.sistemaOuvidoria.atendimento;

import javax.swing.JOptionPane;

public class Menu {

	public static void main(String[] args) {

		Ouvidoria ouvidoriaSamara = new Ouvidoria();

		Ocorrencia ocorrencia1 = new Ocorrencia(123, "REC", "sujeira", "muito pó");

		ouvidoriaSamara.adicionarOcorrencias(ocorrencia1);

		Ocorrencia ocorrencia2 = new Ocorrencia(125, "SUG", "fios", "ligar equipamento via bluetooth");

		ouvidoriaSamara.adicionarOcorrencias(ocorrencia2);

		ouvidoriaSamara.listar();

		ouvidoriaSamara.removerOcorrenciaProtocolo(125);
		JOptionPane.showMessageDialog(null, "Manifestação removida com sucesso!");

	}

}
