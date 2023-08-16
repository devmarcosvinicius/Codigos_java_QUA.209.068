package com.marcosvinicius;

import java.util.Scanner;

public class Atividade2 {
	
	public static void main(String[] args) {
		// Faça um programa que peça quantidade x de nomes, insara os nomes e mostre os nomes inseridos;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Quantos nomes você deseja adicionar? ");
		int qtd = sc.nextInt();
		
		String[] nomes = new String[qtd];
		
		// Adicionando os nomes ao vetor
		for (int i = 0; i < qtd; i++) {
			System.out.println("Digite o nome da " + (i + 1) + " pessoa: " );
			nomes[i] = sc.next();
		}
		
		System.out.println("=-=-=-= Nomes =-=-=-=");
		for (String nome: nomes) {
			System.out.println(nome);
		}
		
		sc.close();
		
	}

}
