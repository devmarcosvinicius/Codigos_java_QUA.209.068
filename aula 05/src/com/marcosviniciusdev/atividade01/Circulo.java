package com.marcosviniciusdev.atividade01;

public class Circulo {
	
	private double raio;
	// private static double PI = 3.14;
	
	public Circulo(double raio) {
		this.raio = raio;
	}
	
	public double getRaio() {
		return raio;
	}
	public void setRaio(double raio) {
		this.raio = raio;
	}
	
	public double getArea() {
		return Math.PI * (raio * raio);
	}
	
	public double getPerimetro() {
		return raio * 2;
	}
	
	@Override
	public String toString() {
		return String.format("Area do circulo: %.2f\nPerimetro do circulo: %.2f", this.getArea(), this.getPerimetro());
	}

}
