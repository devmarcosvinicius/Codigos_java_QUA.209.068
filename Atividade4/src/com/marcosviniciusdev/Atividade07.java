package com.marcosviniciusdev;

import java.util.Scanner;

public class Atividade07 {
	
	public static void main(String[] args) {
		// Faça um programa que leia 4 notas de um aluno e retorne a media, se a media for menor que 6 está reprovado, 
		// se media ficar entre 6 e 7, está de recuperação, se a nota ficar acima de 7, está aprovado, se a media for 10, está aprovado com honras.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite a primeiro nota: ");
		double nota1 = sc.nextDouble();

		System.out.println("Digite a segunda nota: ");
		double nota2 = sc.nextDouble();

		System.out.println("Digite a terceira nota: ");
		double nota3 = sc.nextDouble();

		System.out.println("Digite a quarta nota: ");
		double nota4 = sc.nextDouble();
		
		double media = (nota1 + nota2 + nota3 + nota4) / 4;
		
		if (media == 10) {
			System.out.println("Parabens, você foi aprovado com honras!!!");
		} else if (media >= 7) {
			System.out.println("Parabens, você foi aprovado!");
		} else if (media > 6 && media < 7) {
			System.out.println("Atenção, você está de recuperação!");
		} else {
			System.out.println("Você não atingiu a media e foi reprovado.");
		}
		
		sc.close();
	}

}
