package com.marcosviniciusdev.atividade02;

import java.util.Scanner;

import com.marcosviniciusdev.atividade02.entities.Estoque;

public class Program {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Estoque estoque = new Estoque();
		
		System.out.println("Digite o nome do produto: ");
		estoque.setNomeProduto(sc.nextLine());
		
		System.out.println("Digite a quantidade do produto: ");
		estoque.setQuantidade(sc.nextInt());
		
		estoque.getBalanco();
		
		sc.close();
	}

}
