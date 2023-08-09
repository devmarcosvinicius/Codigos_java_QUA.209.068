package com.marcosviniciusdev;
import java.util.Scanner;

public class Atividade1 {
	
	public static void main(String[] args) {
		/* Fa�a um programa que pe�a uma nota, entre zero e dez.
		 * Mostre uma mensagem caso o valor seja inv�lido e continue at� que o usuario informe um valor v�lido.
		 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite uma nota entre 0 e 10: ");
		double nota = sc.nextDouble();
		
		while (nota < 0 || nota > 10) {
			System.out.println("Digite uma nota entre 0 e 10: ");
			nota = sc.nextDouble();
		}
		
		System.out.println("Obrigado! Sua nota � " + nota);
		
		sc.close();
	}

}
