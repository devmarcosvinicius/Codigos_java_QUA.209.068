package com.marcosviniciusdev;

import java.util.Scanner;

public class Atividade2 {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite seu nome: ");
		String nome = scanner.next();
		
		System.out.println("Digite sua idade: ");
		int idade = scanner.nextInt();
		
		System.out.println("Digite sua altura: ");
		double altura = scanner.nextDouble();
		
		System.out.println("Digite seu sexo: [M/F] ");
		char sexo = scanner.next().charAt(0);
		
		System.out.println("Digite seu endere�o: ");
		String endereco = scanner.next();
		
		System.out.println("Seu nome �: " + nome);
		System.out.println("Sua idade �: " + idade);
		System.out.println("Sua altura �: " + altura);
		System.out.println("Seu sexo �: " + sexo);
		System.out.println("\nSeu endere�o �: " + endereco);
		
		scanner.close();
		
	}

}
