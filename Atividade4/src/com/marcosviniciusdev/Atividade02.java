package com.marcosviniciusdev;

import java.util.Scanner;

public class Atividade02 {

	public static void main(String[] args) {
		// Fa�a um programa que entre com um numero e indique se ele � impar ou par.
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite um numero inteiro: ");
		int num = sc.nextInt();
		
		if (num % 2 == 0) {
			System.out.printf("O numero %d � par.", num);
		} else {
			System.out.printf("O numero %d � impar.", num);
		}

		sc.close();

	}

}
