package com.marcosviniciusdev;

public class Atividade3 {
	
	public static void main(String[] args) {
		// Fa�a um programa que imprima na tela apenas os n�meros �mpares entre 1 e 50
		
		for (int i = 1; i <= 50; i++) {
			if (i % 2 != 0) {
				System.out.println(i);
			}
		}
		
		System.out.println("\n=-=-=-=-=-=-=-=-= Outra op��o =-=-=-=-=-=-=-=-=");
		
		for (int i = 1; i <= 50; i += 2) {
			System.out.println(i);
		}
		
		for (int i = 0; i <= 50; ++i) {
			System.out.println(i);
		}
	}

}