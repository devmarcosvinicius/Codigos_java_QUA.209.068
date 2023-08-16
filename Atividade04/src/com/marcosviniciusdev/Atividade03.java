package com.marcosviniciusdev;

import java.util.Scanner;

public class Atividade03 {
	
	public static void main(String[] args) {
		// Faça um programa que leia dois numeros e imprima o maior deles.
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o primeiro numero: ");
		int numero1 = sc.nextInt();

		System.out.println("Digite o segundo numero: ");
		int numero2 = sc.nextInt();
		
		if (numero1 > numero2) {
			System.out.println(numero1);
		} else if (numero1 < numero2) {
			System.out.println(numero2);
		} else {
			System.out.printf("%d e %d são iguais.\n", numero1, numero2);
		}
		
		sc.close();
	}

}
