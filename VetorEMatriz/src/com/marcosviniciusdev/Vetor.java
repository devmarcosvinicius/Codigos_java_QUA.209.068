package com.marcosviniciusdev;

public class Vetor {
	
	public static void main(String[] args) {
		/*
		 * Vetor � uma sequencia nao ordenada de dados do mesmo tipos a contagem do vetor � por indices e incia do indice 0.
		 * Vetor n�o pode conter dados de tipos diferentes.
		 * Vetor tamb�m � conhecido como Array
		 * Vetor � unidimensional, uma dire��o.
		 * Os dados do array s�o armazenados em um espa�o de memoria.
		 * 
		 * Array => [25, 63, 98, 74]
		 * Indices   0   1   2   3
		 */
		
		int[] numeros = new int[5];
		numeros[0] = 10;
		numeros[1] = 20;
		numeros[2] = 30;
		numeros[3] = 40;
		numeros[4] = 50;
		
		System.out.println("Fora do loop for: " + numeros[0]);
		
		for (int i = 0; i < numeros.length; i++) {
			System.out.println("Dentro do loop for: " + numeros[i]);
		}
		
		
	}

}
