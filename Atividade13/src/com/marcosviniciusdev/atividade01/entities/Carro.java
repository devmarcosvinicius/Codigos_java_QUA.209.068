package com.marcosviniciusdev.atividade01.entities;

public class Carro {

	private String modelo;
	private int ano;
	private String cor;
	private double motor;
	private String cambio;
	private double velocidade;

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public double getMotor() {
		return motor;
	}

	public void setMotor(double motor) {
		this.motor = motor;
	}

	public String getCambio() {
		return cambio;
	}

	public void setCambio(String cambio) {
		this.cambio = cambio;
	}

	public double getVelocidade() {
		return velocidade;
	}

	public void setVelocidade(double velocidade) {
		this.velocidade = velocidade;
	}

	public void aumentarVelocidade() {
		velocidade += 1;
	}

	public void diminuirVelocidade() {
		velocidade -= 1;
	}

}
