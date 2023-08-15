package com.marcosviniciusdev;

import java.util.Scanner;

public class Atividade01 {
	
	public static void main(String[] args) {
		/*
		 * Fa�a um programa que receba um valor em real e converta para d�lares na cota��o atual,
		 * fa�a o inverso tamb�m;
		 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite o valor em real para converter para dolar: R$");
		double real = sc.nextDouble();
		
		System.out.printf("R$%.2f � igual a $%.2f", real, conversorDolar(real));
		
		sc.close();
		
	}
	
	static double conversorDolar(double real) {
		return real / 4.99;
	}

}
