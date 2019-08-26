package com.vinicpinheiro.vini.dto;

public class Resposta {

	String id;
	String nome;
	public Resposta(String string, String string2) {
		this.id = string;
		this.nome = string2;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
}
