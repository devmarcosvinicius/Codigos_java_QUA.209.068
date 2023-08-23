package com.marcosviniciusdev.atividade03.entities;

public class Triangulo {

	public double lado1;
	public double lado2;
	public double lado3;

	public String obterTipo() {
		if ((lado1 <= 0) || (lado2 <= 0) || (lado3 <= 0)) {
			return "Isso n�o � um triangulo.";
		}

		if ((lado1 == lado2) && (lado2 == lado3)) {
			return "Triangulo equil�tero";
		} else if ((lado1 == lado2) || (lado1 == lado3) || (lado2 == lado3)) {
			return "Triangulo Is�celes";
		} else {
			return "Triangulo Escaleno";
		}
	}

}
