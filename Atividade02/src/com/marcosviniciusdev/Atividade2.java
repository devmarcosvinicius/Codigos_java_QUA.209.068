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
		
		System.out.println("Digite seu endereço: ");
		String endereco = scanner.next();
		
		System.out.println("Seu nome é: " + nome);
		System.out.println("Sua idade é: " + idade);
		System.out.println("Sua altura é: " + altura);
		System.out.println("Seu sexo é: " + sexo);
		System.out.println("\nSeu endereço é: " + endereco);
		
		scanner.close();
		
	}

}
