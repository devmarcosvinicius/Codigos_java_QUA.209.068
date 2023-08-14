package com.marcosviniciusdev;

public class Matriz {
	
	public static void main(String[] args) {
		/*
		 * Uma matriz é um vetor multidimensional, geralmente trabalhamos com 2 dimensões, linha e coluna.
		 * E ela parece uma tabela.
		 */
		
		// Os primeiros colchetes indicam coluna e os segundos indicam linha.
		int[][] numeros = new int[3][3];
		
		int contador = 10;
		
		for (int i = 0; i < numeros.length; i++) {
			for (int j = 0; j < numeros.length; j++) {
				numeros[i][j] = contador;
				System.out.print(numeros[i][j] + "\t");
				contador++;
			}
			System.out.println();
		}
		
		
	}

}
