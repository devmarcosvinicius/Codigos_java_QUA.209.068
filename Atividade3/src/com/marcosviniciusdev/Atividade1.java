package com.marcosviniciusdev;

import java.util.Scanner;

public class Atividade1 {
	
	// Fa�a um Programa que pe�a dois n�meros e imprima a soma;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int numero1 = sc.nextInt();
		int numero2 = sc.nextInt();
		
		System.out.println("A soma dos dois numeros: " + (numero1 + numero2));
		
		sc.close();
	}

}
