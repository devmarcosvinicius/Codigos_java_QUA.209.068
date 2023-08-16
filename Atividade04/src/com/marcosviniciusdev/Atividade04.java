package com.marcosviniciusdev;

import java.util.Scanner;

public class Atividade04 {
	
	public static void main(String[] args) {
		// Faça um programa que leia 3 numeros e mostre o maior deles.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o primeiro numero: ");
		int numero1 = sc.nextInt();

		System.out.println("Digite o segundo numero: ");
		int numero2 = sc.nextInt();

		System.out.println("Digite o terceiro numero: ");
		int numero3 = sc.nextInt();
		
		if (numero1 > numero2 && numero1 > numero3) {
			System.out.printf("%d é o maior.\n", numero1);
		} else if (numero2 > numero1 && numero2 > numero3) {
			System.out.printf("%d é o maior.\n", numero2);
		} else if (numero3 > numero1 && numero3 > numero2) {
			System.out.printf("%d é o maior.\n", numero3);
		}
		
		sc.close();
	}

}
