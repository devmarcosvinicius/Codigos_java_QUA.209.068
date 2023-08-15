package com.marcosviniciusdev;

import java.util.Scanner;

public class Atividade4 {
	
	public static void main(String[] args) {
		
		/*
		 * Ler um vetor Q de 20 posi��es (aceitar somente n�meros positivos), caso n�o atenda a condi��o deve informar novamente 
		o numero at� que a condi��o seja aceita, ao final mostre os n�meros inseridos no vetor e a soma deles.
		 */
		
		Scanner sc = new Scanner(System.in);
		
		// Criando o vetor de 3 posi��es.
		int[] numeros = new int[3];
		
		// Criando o loop para percorrer o vetor para inserir os dados do usuario.
		for (int i = 1; i < numeros.length; i++) {
			
			// Validando os dados inseridos pelo usuarios para n�o ser menor ou igual a zero.
			do {
				System.out.println("Digite o " + (i) + " valor a ser inserido: ");
				numeros[i] = sc.nextInt();
				numeros[0] += numeros[i];
			} while (numeros[i] <= 0);
		}
		
		// Imprimindo o titulo para organiza��o.
		System.out.println("=-=-=-=-= A lista do elementos do vetor =-=-=-=-=");
		
		// Imprimindo o vetor com um foreach.
		for (int numero: numeros) {
			System.out.println(numero);
		}
		
		sc.close();
		
	}

}
