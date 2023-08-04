package com.marcosviniciusdev;

import java.util.Scanner;

public class Atividade4 {
	
	/*
	 * Faça um Programa que peça a temperatura em graus Fahrenheit, transforme e mostre a temperatura em graus Celsius.
		C = 5 * ((F-32) / 9).
	 */
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite a temperatura em Fahrenheit: ");
		double fahrenheit = sc.nextDouble();
		
		double celsius = (fahrenheit - 32) / 1.8;
		
		System.out.println("A tempera convertida para Celsius é: " + celsius);
		
		sc.close();
		
	}

}
