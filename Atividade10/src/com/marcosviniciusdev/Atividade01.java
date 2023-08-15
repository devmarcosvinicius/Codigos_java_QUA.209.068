package com.marcosviniciusdev;

import java.util.Scanner;

public class Atividade01 {
	
	public static void main(String[] args) {
		/*
		 * Faça um programa que receba um valor em real e converta para dólares na cotação atual,
		 * faça o inverso também;
		 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite o valor em real para converter para dolar: R$");
		double real = sc.nextDouble();
		
		System.out.printf("R$%.2f é igual a $%.2f", real, conversorDolar(real));
		
		sc.close();
		
	}
	
	static double conversorDolar(double real) {
		return real / 4.99;
	}

}
