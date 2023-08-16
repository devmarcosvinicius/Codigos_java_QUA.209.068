package com.marcosviniciusdev;

import java.util.Scanner;

public class Atividade5 {
	
	// Faça um Programa que peça a temperatura em graus Celsius, transforme e mostre em graus Fahrenheit.

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite a temperatura em celsius: ");
		
		double celsius = sc.nextDouble();
		double fahrenheit = 1.8 * celsius + 32;
		
		System.out.println("A tempera convertida para Fahrenheit é: " + fahrenheit);
		
		sc.close();
	}

}
