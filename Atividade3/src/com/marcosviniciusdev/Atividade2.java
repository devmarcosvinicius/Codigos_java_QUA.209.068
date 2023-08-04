package com.marcosviniciusdev;

import java.util.Scanner;

public class Atividade2 {

	// Faça um Programa que peça as 4 notas bimestrais e mostre a média.

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

	
		System.out.println("Digite a primeira nota: ");
		double nota1 = sc.nextDouble();
		System.out.println("Digite a segunda nota: ");
		double nota2 = sc.nextDouble();
		System.out.println("Digite a terceira nota: ");
		double nota3 = sc.nextDouble();
		System.out.println("Digite a quarta nota: ");
		double nota4 = sc.nextDouble();
		
		double media = (nota1 + nota2 + nota3 + nota4) / 4;

		System.out.println("A media bimestral é: " + media);
		
		sc.close();
	}

}
