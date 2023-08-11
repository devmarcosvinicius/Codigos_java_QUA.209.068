package com.marcosviniciusdev;

import java.util.Scanner;

public class Atividade3 {
	
	public static void main(String[] args) {
		/*Escreva um algoritmo para ler 2 valores e se algum dos valores for zero não aceite, deve ser lido
		um novo valor, imprimir o resultado da divisão do primeiro valor lido pelo segundo valor lido. (utilize a estrutura de repetição que mais se adeque).
		*/
		
		Scanner sc = new Scanner(System.in);
		
		double num1, num2;
		
		do {
			System.out.println("Digite o primeiro numero: (!= 0) ");
			num1 = sc.nextDouble();
		} while (num1 == 0);
		
		do {
			System.out.println("Digite o segundo numero: (!= 0) ");
			num2 = sc.nextDouble();
		} while (num2 == 0);
		
		System.out.println(num1 + "/" + num2 + " = " + (num1 / num2));
		
		sc.close();
		
	}

}
