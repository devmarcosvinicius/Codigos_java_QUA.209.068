package com.marcosviniciusdev.atividade03.entities;

public class Usuario {

	private String nome;
	private String email;
	private String password;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	public void getDados() {
		System.out.println(getNome() + ", " + getEmail());
	}

}
