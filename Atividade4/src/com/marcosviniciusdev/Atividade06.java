package com.marcosviniciusdev;

import java.util.Scanner;

public class Atividade06 {
	
	public static void main(String[] args) {
		// Faça um programa que receba o sexo de uma pessoa e imprima na tele o sexo digitado, o programa não pode distinguir de maiusculas e minusculas.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o seu sexo: ");
		String sexo = sc.next();
		
		if (sexo.equalsIgnoreCase("m")) {
			System.out.println("Sexo masculino.");
		} else if (sexo.equalsIgnoreCase("f")) {
			System.out.println("Sexo feminino.");
		}
		
		sc.close();
	}

}
