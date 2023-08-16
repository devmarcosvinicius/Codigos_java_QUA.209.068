package com.marcosviniciusdev.atividade01;

public class Program {
	
	// Faça um programa que calcule a área de um terreno e mostre o m²;
	
	public static void main(String[] args) {
		Terreno terreno1 = new Terreno();
		
		terreno1.comprimento = 50;
		terreno1.largura = 45;
		
		System.out.println("O terreno tem " + terreno1.calcularMetragem()+ " metros quadrados.");
	}

}
