package com.marcosviniciusdev;

import java.util.Scanner;

public class Atividade2 {
	
	public static void main(String[] args) {
		
		/* 
		 * Faça um programa que receba um operador (+, -, /, *) e um numero e mostre a tabuada conforme os dados de entrada 
		 * (numero não pode ser maior que 10 e nem menor que 0)
		 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um numero para obter a tabuada: ");
		int numero = sc.nextInt();
		
		while (numero < 0 && numero > 10) {
			System.out.println("Digite um numero para obter a tabuada: ");
			numero = sc.nextInt();
		}
		
		System.out.println("Qual operação da tabuada você deseja? [+, -, *, /] ");
		char operacao = sc.next().charAt(0);
		
		while (operacao != '+' && operacao != '-' && operacao != '/' && operacao != '*') {
			System.out.println("Qual operação da tabuada você deseja? [+, -, *, /] ");
			operacao = sc.next().charAt(0);
		}
		
		for (int i = 0; i <= 10; i++) {
			if (operacao == '+') {
				System.out.printf("%d %c %d = %d\n", numero, operacao, i, numero + i);
			} else if (operacao == '-') {
				System.out.printf("%d %c %d = %d\n", numero, operacao, i, numero - i);
			} else if (operacao == '/') {
				System.out.printf("%d %c %d = %d\n", numero, operacao, i, numero / i);
			} else if (operacao == '*') {
				System.out.printf("%d %c %d = %d\n", numero, operacao, i, numero * i);
			}
		}
		
		sc.close();
		
	}

}
