package com.marcosviniciusdev.atividade02;

public class Atividade02 {
	
	public static void main(String[] args) {
		
		int[] numeros = {5, 89, 65, 32, 74, 55, 14};
		int maior = 0;
		
		for (int numero: numeros) {
			if (maior < numero) maior = numero;
		}
		
		System.out.println("Maior numero do vetor: " + maior);
		
	}

}