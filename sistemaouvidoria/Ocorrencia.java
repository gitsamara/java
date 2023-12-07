package br.com.sistemaOuvidoria.atendimento;

public class Ocorrencia {

	private int protocolo;
	private String tipoOcorrencia;
	private String titulo;
	private String texto;

	public Ocorrencia(int protocolo, String tipoOcorrencia, String titulo, String texto) {
		super();
		this.protocolo = protocolo;
		this.tipoOcorrencia = tipoOcorrencia;
		this.titulo = titulo;
		this.texto = texto;
	}

	public int getProtocolo() {
		return protocolo;
	}

	public void setProtocolo(int protocolo) {
		this.protocolo = protocolo;
	}

	public String getTipoOcorrencia() {
		return tipoOcorrencia;
	}

	public void setTipoOcorrencia(String tipoOcorrencia) {
		this.tipoOcorrencia = tipoOcorrencia;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getTexto() {
		return texto;
	}

	public void setTexto(String texto) {
		this.texto = texto;
	}

}
