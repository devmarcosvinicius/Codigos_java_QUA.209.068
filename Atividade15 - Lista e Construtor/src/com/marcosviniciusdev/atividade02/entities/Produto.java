package com.marcosviniciusdev.atividade02.entities;

public class Produto {
	
	private String nome;
	private int quantidade;
	private double preco;
	
	public Produto() {
	}
	
	public Produto(String nome, int quantidade, double preco) {
		super();
		this.nome = nome;
		this.quantidade = quantidade;
		this.preco = preco;
	}

	public Produto(String nome) {
		super();
		this.nome = nome;
	}

	public Produto(int quantidade) {
		super();
		this.quantidade = quantidade;
	}

	public Produto(double preco) {
		super();
		this.preco = preco;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

}
