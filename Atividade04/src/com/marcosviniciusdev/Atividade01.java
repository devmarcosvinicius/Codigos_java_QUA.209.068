package com.marcosviniciusdev;

import java.util.Scanner;

public class Atividade01 {
	
	public static void main(String[] args) {
		// Fa�a um programa que pe�a para o usuario entrar com uma ano e dizer se esse ano � bissexto ou n�o.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um ano: ");
		int ano = sc.nextInt();
		
		if ((ano % 4 == 0) && (ano % 100 != 0)) {
			System.out.printf("O ano %d � uma ano bissexto.", ano);
		} else if (ano % 400 == 0){
			System.out.printf("O ano %d � uma ano bissexto.", ano);
		} else {
			System.out.printf("O ano %d n�o � uma ano bissexto.", ano);
		}
		
		sc.close();
	}

}
