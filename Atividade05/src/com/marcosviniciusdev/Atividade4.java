package com.marcosviniciusdev;

import java.util.Scanner;

public class Atividade4 {
	
	public static void main(String[] args) {
		// Fa�a um programa que leia um n�mero envi
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("=-=-=-=-= Primeira Op��o com duas op��es =-=-=-=-=");
		
		System.out.println("Digite o primeiro numero inteiro: ");
		int numero1 = sc.nextInt();
		System.out.println("Digite o segundo numero inteiro: ");
		int numero2 = sc.nextInt();
		
		if (numero1 < numero2) {
			for (int i = numero1; i <= numero2; i++) {
				System.out.println(i);
			}
		} else if (numero2 < numero1) {
			for (int i = numero2; i <= numero1; i++) {
				System.out.println(i);
			}
		}
		System.out.println("\n\n\n=-=-=-=-= Segunda Op��o com duas op��es =-=-=-=-=");
		
		System.out.println("Digite o primeiro numero inteiro: ");
		int numero3 = sc.nextInt();
		System.out.println("Digite o segundo numero inteiro: ");
		int numero4 = sc.nextInt();
		
		if (numero3 < numero4) {
			for (int i = numero3; i <= numero4; i++) {
				System.out.println(i);
			}
		} else if (numero3 > numero4) {
			for (int i = numero3; i > numero4; i--) {
				System.out.println(i);
			}
		}
		
		sc.close();
	}

}
