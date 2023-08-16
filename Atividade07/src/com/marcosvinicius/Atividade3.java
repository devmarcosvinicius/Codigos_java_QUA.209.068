package com.marcosvinicius;

import java.util.Scanner;

public class Atividade3 {
	
	public static void main(String[] args) {
		// Faça um programa que receba o nome do aluno e as 4 notas bimestrais desse aluno, mostre a media e se foi aprovado (>=7) ou reprovado(<7);
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o nome do aluno: ");
		String nome = sc.next();
		
		double[] notas = new double[5];
		notas[0] = 0;
		
		for (int i = 1; i < 5; i++) {
			System.out.println("Digite a " + i + " nota: ");
			notas[i] = sc.nextDouble();
			notas[0] += notas[i];
		}
		
		System.out.println("A media do aluno " + nome + " é igual a " + (notas[0] / 4) + " pontos.");
		
		if ((notas[0] / 4) >= 7) {
			System.out.println("O aluno " + nome + " foi aprovado com a media igual a " + (notas[0] / 4) + " pontos.");
		} else {
			System.out.println("O aluno " + nome + " foi reprovado com a media igual a " + (notas[0] / 4) + " pontos.");
		}
		
		sc.close();
		
	}

}
