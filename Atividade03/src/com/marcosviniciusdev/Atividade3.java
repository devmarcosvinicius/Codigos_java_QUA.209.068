package com.marcosviniciusdev;

import java.util.Scanner;

public class Atividade3 {

	/*
	 * Faça um Programa que pergunte quanto você ganha por hora e o número de horas trabalhadas no mês. 
	 * Calcule e mostre o total do seu salário no referido mês (sem descontos e impostos).
	 */

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Quanto você ganha por hora: ");
		double valorPorHora = sc.nextDouble();
		System.out.println("Quantas horas você trabalhou: ");
		double horasTrabalhada = sc.nextDouble();
		
		double salarioFinal = valorPorHora * horasTrabalhada;
		
		System.out.println("Você ira receber o valor de R$" + salarioFinal);
		
		sc.close();
		
	}
	
}
