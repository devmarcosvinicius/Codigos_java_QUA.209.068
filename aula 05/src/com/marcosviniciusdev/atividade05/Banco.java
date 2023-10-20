package com.marcosviniciusdev.atividade05;

public class Banco {
	
	private String nomeDoTitular;
	private double saldo;
	private int numeroDaConta;
	
	public Banco(String nomeDoTitular, int numeroDaConta) {
		super();
		this.nomeDoTitular = nomeDoTitular;
		this.numeroDaConta = numeroDaConta;
	}

	public String getNomeDoTitular() {
		return nomeDoTitular;
	}

	public void setNomeDoTitular(String nomeDoTitular) {
		this.nomeDoTitular = nomeDoTitular;
	}

	public int getNumeroDaConta() {
		return numeroDaConta;
	}

	public void setNumeroDaConta(int numeroDaConta) {
		this.numeroDaConta = numeroDaConta;
	}

	public double getSaldo() {
		return saldo;
	}
	
	public String depositar(double valor) {
		this.saldo += valor;
		return String.format("O valor de %.2f foi depositado com sucesso.", valor);
	}
	
	public String sacar(double valor) {
		if (valor > this.saldo) return "Saldo insuficiente para realizar esse saque.";
		
		this.saldo -= valor;
		
		return String.format("O valor de %.2f foi sacado com sucesso.", valor);
		
	}

}
