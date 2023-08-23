package com.marcosviniciusdev;
import java.util.Scanner;

public class Atividade1 {
	
	public static void main(String[] args) {
		/* Faça um programa que peça uma nota, entre zero e dez.
		 * Mostre uma mensagem caso o valor seja inválido e continue até que o usuario informe um valor válido.
		 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite uma nota entre 0 e 10: ");
		double nota = sc.nextDouble();
		
		while (nota < 0 || nota > 10) {
			System.out.println("Digite uma nota entre 0 e 10: ");
			nota = sc.nextDouble();
		}
		
		System.out.println("Obrigado! Sua nota é " + nota);
		
		sc.close();
	}

}
