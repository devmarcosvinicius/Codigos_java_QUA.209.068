package com.marcosviniciusdev;

import java.util.Scanner;

public class Atividade05 {
	
	public static void main(String[] args) {
		// Faça um programa que leia 3 numeros e imprima os em ordem decrescente.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o primeiro numero: ");
		int numero1 = sc.nextInt();

		System.out.println("Digite o segundo numero: ");
		int numero2 = sc.nextInt();

		System.out.println("Digite o terceiro numero: ");
		int numero3 = sc.nextInt();
		
		/* =-=-=-= Possibilidades?  =-=-=-=  
		 * 1, 2, 3
		 * 1, 3, 2
		 * 2, 1, 3
		 * 2, 3, 1
		 * 3, 1, 2
		 * 3, 2, 1
		 */
		
		if ((numero1 > numero2) && (numero1 > numero3)) {
			if (numero2 > numero3) {
				System.out.printf("%d, %d e %d.", numero3, numero2, numero1);
			} else {
				System.out.printf("%d, %d e %d.", numero2, numero3, numero1);
			}
		} else if ((numero2 > numero1) && (numero2 > numero3)) {
			if (numero1 > numero3) {
				System.out.printf("%d, %d e %d.", numero3, numero1, numero2);
			} else {
				System.out.printf("%d, %d e %d.", numero1, numero3, numero2);
			}
		} else {
			if (numero1 > numero2) {
				System.out.printf("%d, %d e %d.", numero2, numero1, numero3);
			} else {
				System.out.printf("%d, %d e %d.", numero1, numero2, numero3);
			}
			
		}
		
		sc.close();
	}

}
