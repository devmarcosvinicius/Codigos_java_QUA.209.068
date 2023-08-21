package com.marcosviniciusdev.entities;

public class Conta {

	private String titular;
	private String agencia;
	private int numeroConta;
	private double saldo;

	// Get == obter
	public String getTitular() {
		return titular;
	}

	// Set == atribui
	public void setTitular(String titular) {
		this.titular = titular;
	}

	public String getAgencia() {
		return agencia;
	}

	public void setAgencia(String agencia) {
		this.agencia = agencia;
	}

	public int getNumeroConta() {
		return numeroConta;
	}

	public void setNumeroConta(int numeroConta) {
		this.numeroConta = numeroConta;
	}

	public double getSaldo() {
		return saldo;
	}

	public void depositar(double valorDeposito) {
		saldo += valorDeposito;
		System.out.println("Deposito realizado com sucesso.");
	}

	public void sacar(double valorSaque) {
		saldo -= valorSaque;
		System.out.println("Saque realizado com sucesso.");
	}

	public void obterDadosBancarios() {
		System.out.println("\n=-=-=-=-=-=-=-=-=-=-=-=");
		System.out.println("Titular: " + titular);
		System.out.println("Agencia: " + agencia);
		System.out.println("Conta: " + numeroConta);
		System.out.println("Saldo: " + saldo);
		System.out.println("=-=-=-=-=-=-=-=-=-=-=-=");
	}

}
