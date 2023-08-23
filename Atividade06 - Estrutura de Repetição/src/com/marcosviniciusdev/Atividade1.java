package com.marcosviniciusdev;

import java.util.Scanner;

public class Atividade1 {
	
	public static void main(String[] args) {
		// Faça um programa que receba a altura de 10 pessoas e mostre a media da altura delas.
		
		Scanner sc = new Scanner(System.in);
		double media = 0;
		double altura = 0;
		
		for (int i = 0; i < 10; i++) {
			System.out.println("Digite a altura da " + (i + 1) + " pessoa: ");
			altura = sc.nextDouble();
			media += altura;
		}
		
		media = media / 10;
		System.out.printf("A media da altura de 10 pessoas é igual a: %.2fcm.", media);
		
		sc.close();		
	}

}
