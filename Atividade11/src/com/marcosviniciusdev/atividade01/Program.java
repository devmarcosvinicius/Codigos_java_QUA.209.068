package com.marcosviniciusdev.atividade01;

import java.util.Scanner;

public class Program {
	
	// Fa�a um programa que calcule a �rea de um terreno e mostre o m�;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Terreno terreno1 = new Terreno();
		
		System.out.println("Digite o comprimento do terreno: ");
		terreno1.comprimento = sc.nextDouble();
		
		System.out.println("Digite a largura do terreno: ");
		terreno1.largura = sc.nextDouble();
		
		System.out.println("O terreno tem " + terreno1.calcularMetragem()+ " metros quadrados.");
		
		sc.close();
	}

}
