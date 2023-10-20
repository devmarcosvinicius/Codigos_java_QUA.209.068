package com.marcosviniciusdev.atividade04;

public class Retangulo {

	private double altura;
	private double largura;

	public Retangulo(double altura, double largura) {
		super();
		this.altura = altura;
		this.largura = largura;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public double getLargura() {
		return largura;
	}

	public void setLargura(double largura) {
		this.largura = largura;
	}
	
	public double getArea() {
		return this.getAltura() * this.getLargura();
	}
	
	public double getPerimetro() {
		return 2 * (this.getAltura() + this.getLargura());
	}
	
	@Override
	public String toString() {
		return String.format("Area do retangulo: %.2f\nPerimetro do retangulo: %.2f", this.getArea(), this.getPerimetro());
	}

}
