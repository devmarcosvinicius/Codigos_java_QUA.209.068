package com.marcosviniciusdev;

import java.util.Scanner;

public class Atividade01 {
	
	public static void main(String[] args) {
		// Faça um programa que peça para o usuario entrar com uma ano e dizer se esse ano é bissexto ou não.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um ano: ");
		int ano = sc.nextInt();
		
		if ((ano % 4 == 0) && (ano % 100 != 0)) {
			System.out.printf("O ano %d é uma ano bissexto.", ano);
		} else if (ano % 400 == 0){
			System.out.printf("O ano %d é uma ano bissexto.", ano);
		} else {
			System.out.printf("O ano %d não é uma ano bissexto.", ano);
		}
		
		sc.close();
	}

}
