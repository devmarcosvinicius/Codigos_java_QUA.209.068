package com.marcosviniciusdev.entities;

public class Pessoa {

	private String nome;
	private int idade;
	private int ano;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public int getIdade() {
		return idade;
	}

	public void imprimeDados() {
		System.out.printf("%s tem %d anos.", nome, (idade = 2023 - ano));
	}

}
