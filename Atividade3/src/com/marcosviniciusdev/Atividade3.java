package com.marcosviniciusdev;

import java.util.Scanner;

public class Atividade3 {

	/*
	 * Fa�a um Programa que pergunte quanto voc� ganha por hora e o n�mero de horas trabalhadas no m�s. 
	 * Calcule e mostre o total do seu sal�rio no referido m�s (sem descontos e impostos).
	 */

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Quanto voc� ganha por hora: ");
		double valorPorHora = sc.nextDouble();
		System.out.println("Quantas horas voc� trabalhou: ");
		double horasTrabalhada = sc.nextDouble();
		
		double salarioFinal = valorPorHora * horasTrabalhada;
		
		System.out.println("Voc� ira receber o valor de R$" + salarioFinal);
		
		sc.close();
		
	}
	
}
