package com.marcosviniciusdev.atividade02.principal;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

import com.marcosviniciusdev.atividade02.entities.Produto;

public class Program {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		ArrayList<Produto> produtos = new ArrayList<>();
		
		
		for (int i = 0; i < 3; i++) {
			Produto produto = new Produto();
			
			System.out.println("Digite o nome do " + (i + 1) + " produto: ");
			produto.setNome(sc.nextLine());
			
			System.out.println("Digite o quantidade do " + (i + 1) + " produto: ");
			produto.setQuantidade(sc.nextInt());
			sc.nextLine();
			
			System.out.println("Digite o preco do " + (i + 1) + " produto: ");
			produto.setPreco(sc.nextDouble());
			sc.nextLine();
			
			produtos.add(produto);
			
		}

		Collections.sort(produtos, Comparator.comparing(Produto::getNome));
		System.out.println("\n\n=-=-=-=-= Ordenado por Nome =-=-=-=-=");
		for (Produto produto: produtos) {
			System.out.println("Nome: " + produto.getNome());
			System.out.println("Quantidade: " + produto.getQuantidade());
			System.out.println("Preço: " + produto.getPreco());
		}

		Collections.sort(produtos, Comparator.comparing(Produto::getQuantidade));
		System.out.println("\n\n=-=-=-=-= Ordenado por Quantidade =-=-=-=-=");
		for (Produto produto: produtos) {
			System.out.println("Nome: " + produto.getNome());
			System.out.println("Quantidade: " + produto.getQuantidade());
			System.out.println("Preço: " + produto.getPreco());
		}
		
		sc.close();
		
	}

}
