package com.marcosviniciusdev;

import java.util.Scanner;

public class Atividade6 {
	
	/*
	 * Uma empresa tem gastos mensais e a cada 3 meses realiza um balan�o para verificar a media de gastos dos 3 meses. 
	 * Fa�a um programa que receba os valores de cada m�s e imprima na tela o valor total gasto no per�odo e a media dos gastos.
	 */
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o valor do balan�o do primeiro m�s: ");
		double mes1 = sc.nextDouble();

		System.out.println("Digite o valor do balan�o do segundo m�s: ");
		double mes2 = sc.nextDouble();

		System.out.println("Digite o valor do balan�o do terceiro m�s: ");
		double mes3 = sc.nextDouble();
		
		double valorTotal = mes1 + mes2 + mes3;
		double mediaFinal = valorTotal / 6;
		
		System.out.println("Valor total gasto nos tr�s meses: R$" + valorTotal);
		System.out.println("Media do valor gasto nos tr�s meses: R$" + mediaFinal);
		
		sc.close();
	}

}
