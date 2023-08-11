package com.marcosviniciusdev;

import java.util.Scanner;

public class Atividade4 {
	
	public static void main(String[] args) {
		
		/*
		 * Ler um vetor Q de 20 posi��es (aceitar somente n�meros positivos), caso n�o atenda a condi��o deve informar novamente 
		o numero at� que a condi��o seja aceita, ao final mostre os n�meros inseridos no vetor e a soma deles.
		 */
		
		Scanner sc = new Scanner(System.in);
		
		int[] numeros = new int[3];
		
		for (int i = 1; i < numeros.length; i++) {
			
			do {
				System.out.println("Digite o " + (i) + " valor a ser inserido: ");
				numeros[i] = sc.nextInt();
				numeros[0] += numeros[i];
			} while (numeros[i] <= 0);
		}
		
		System.out.println("=-=-=-=-= A lista do elementos do vetor =-=-=-=-=");
		
		for (int numero: numeros) {
			System.out.println(numero);
		}
		
		sc.close();
		
	}

}
