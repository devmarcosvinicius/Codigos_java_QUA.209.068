package com.macosviniciusdev.entities;

public class Pessoa {
	
	private String nome;
	private int idade;
	private String cpf;
	private String genero;
	private double altura;
	
	public Pessoa() {}

	public Pessoa(String nome, int idade, String cpf, String genero, double altura) {
		super();
		this.nome = nome;
		this.idade = idade;
		this.cpf = cpf;
		this.genero = genero;
		this.altura = altura;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}
	
	@Override
	public String toString() {
		return "Nome: " + this.getNome()
				+ "\nCPF: " + this.getCpf()
				+ "\nIdade: " + this.getIdade()
				+ "\nGenero: " + this.getGenero()
				+ "\nAltura: " + this.getAltura();
	}

}
