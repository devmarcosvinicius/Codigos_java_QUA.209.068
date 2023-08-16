package com.marcosviniciusdev;

import java.util.Scanner;

public class Atividade07 {
	
	public static void main(String[] args) {
		// Fa�a um programa que leia 4 notas de um aluno e retorne a media, se a media for menor que 6 est� reprovado, 
		// se media ficar entre 6 e 7, est� de recupera��o, se a nota ficar acima de 7, est� aprovado, se a media for 10, est� aprovado com honras.
		
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
			System.out.println("Parabens, voc� foi aprovado com honras!!!");
		} else if (media >= 7) {
			System.out.println("Parabens, voc� foi aprovado!");
		} else if (media > 6 && media < 7) {
			System.out.println("Aten��o, voc� est� de recupera��o!");
		} else {
			System.out.println("Voc� n�o atingiu a media e foi reprovado.");
		}
		
		sc.close();
	}

}
