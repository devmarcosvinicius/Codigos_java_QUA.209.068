package com.marcosviniciusdev;

import java.util.Scanner;

public class CalcularMetroQuadrado {
	
	public static void main(String[] args) {
		/*
		 *  Crie um programa que receba dois valores de largura e comprimento do terreno e 
		 *  informe quantos metros quadrados ele tem utilizando função.
		 *  
		 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite a largura do terreno: ");
		double largura = sc.nextDouble();
		
		System.out.println("Digite o comprimento do terreno: ");
		double comprimento = sc.nextDouble();
		
		System.out.println("O terreno tem " + metroQuadrado(largura, comprimento) + " metros quadrados.");
		
		sc.close();
	}
	
	static double metroQuadrado(double largura, double comprimento) {
		return largura * comprimento;
	}

}
