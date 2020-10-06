package br.com.unipe.aula.model;

public class Torcedor {

	private String nome;
	private String time;
	public Torcedor() {}
	
	public Torcedor(String nome, String time) {
		super();
		this.nome = nome;
		this.time = time;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	
	
}
