package com.marcosviniciusdev.atividade02;

import java.util.Scanner;

public class Program {
	
	
	public static void main(String[] args) {
		// Fa�a um programa que receba o nome e o ano de nascimento e retorne a idade atual do usu�rio;
		
		Scanner sc = new Scanner(System.in);
		
		int anoAtual = 2023;
		
		Usuario usuario1 = new Usuario();
		
		System.out.println("Digite o seu nome: ");
		usuario1.nome = sc.next();
		
		System.out.println("Digite o ano do seu nascimento: ");
		usuario1.anoDeNascimento = sc.nextInt();
		
		System.out.println("Digite o ano atual: ");
		anoAtual = sc.nextInt();
		
		System.out.println(usuario1.nome + " t�m " + usuario1.obterIdade(anoAtual) + " anos de idade.");
		
		sc.close();
	}

}