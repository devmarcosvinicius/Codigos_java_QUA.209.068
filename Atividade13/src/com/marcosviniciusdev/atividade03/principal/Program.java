package com.marcosviniciusdev.atividade03.principal;

import java.util.Scanner;

import com.marcosviniciusdev.atividade03.entities.Usuario;

public class Program {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Usuario cadastro = new Usuario();
		
		System.out.println("Digite o seu nome: ");
		cadastro.setNome(sc.nextLine());
		
		System.out.println("Digite o seu email: ");
		cadastro.setEmail(sc.nextLine());
		
		System.out.println("Digite a seu senha: ");
		cadastro.setPassword(sc.next());
		
		System.out.println("Trocar senha? Digite a sua nova senha: ");
		cadastro.setPassword(sc.next());
		
		cadastro.getDados();
		
		sc.close();
	}

}
