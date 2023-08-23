package com.marcosviniciusdev;

import java.util.Scanner;

public class Atividade01 {
	
	static double DOLLAR = 4.99;
	
	public static void main(String[] args) {
		/*
		 * Fa�a um programa que receba um valor em real e converta para d�lares na cota��o atual,
		 * fa�a o inverso tamb�m;
		 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite o valor em real para converter para dolar: R$");
		double real = sc.nextDouble();
		
		System.out.printf("R$%.2f � igual a $%.2f\n", real, realToDollar(real));
		
		System.out.print("Digite o valor em dollar para converter para real: $");
		double dollar = sc.nextDouble();
		
		System.out.printf("$%.2f � igual a R$%.2f", dollar, dollarToReal(dollar));
		
		sc.close();
		
	}
	
	static double realToDollar(double real) {
		return real / DOLLAR;
	}
	
	static double dollarToReal(double dollar) {
		return DOLLAR * dollar;
	}

}
