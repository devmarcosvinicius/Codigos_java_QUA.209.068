package com.marcosviniciusdev;

import java.util.Scanner;

public class Atividade6 {
	
	/*
	 * Uma empresa tem gastos mensais e a cada 3 meses realiza um balanço para verificar a media de gastos dos 3 meses. 
	 * Faça um programa que receba os valores de cada mês e imprima na tela o valor total gasto no período e a media dos gastos.
	 */
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o valor do balanço do primeiro mês: ");
		double mes1 = sc.nextDouble();

		System.out.println("Digite o valor do balanço do segundo mês: ");
		double mes2 = sc.nextDouble();

		System.out.println("Digite o valor do balanço do terceiro mês: ");
		double mes3 = sc.nextDouble();
		
		double valorTotal = mes1 + mes2 + mes3;
		double mediaFinal = valorTotal / 6;
		
		System.out.printf("Valor total gasto nos três meses: R$ %.2f\n", valorTotal);
		System.out.printf("Media do valor gasto nos três meses: R$ %.2f\n", mediaFinal);
		
		sc.close();
	}

}
