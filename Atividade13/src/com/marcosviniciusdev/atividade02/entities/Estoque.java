package com.marcosviniciusdev.atividade02.entities;

public class Estoque {
	
	private String nomeProduto;
	private int quantidade;
	
	public String getNomeProduto() {
		return nomeProduto;
	}
	
	public void setNomeProduto(String nomeProduto) {
		this.nomeProduto = nomeProduto;
	}
	
	public int getQuantidade() {
		return quantidade;
	}
	
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	
	public void adicionarQuantidade(int quantidade) {
		this.quantidade += quantidade;
	}
	
	public void removerQuantidade(int quantidade) {
		this.quantidade -= quantidade;
	}
	
	public void getBalanco() {
		System.out.printf("Produto: %s\nQuantidade: %d", nomeProduto, quantidade);
	}

}
