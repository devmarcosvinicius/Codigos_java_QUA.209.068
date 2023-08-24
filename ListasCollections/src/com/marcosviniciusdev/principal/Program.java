package com.marcosviniciusdev.principal;

import java.util.ArrayList;

public class Program {

	public static void main(String[] args) {
		/*
		 *  Litas trabalham com dados do mesmo tipo.
		 *  Uma lista é um tipo generico de uma collection.
		 *  Uma lista é uma coleção de dados.
		 */
		
		ArrayList<String> nomes = new ArrayList<>();
		
		String nome1 = "Adicionado por ultimo";
		
		nomes.add("Marcos");
		nomes.add("Maria");
		nomes.add(nome1);
		
		System.out.println(nomes);
		System.out.println(nomes.get(2));
		
		nomes.remove(1);
		
		System.out.println(nomes);
		
		System.out.println("\n\n=-=-=-=-=-=-= Imprimindo com foreach =-=-=-=-=-=-=");
		for (String arrays: nomes) {
			System.out.println(arrays);
		}

		System.out.println("\n\n=-=-=-=-=-=-= Imprimindo com for =-=-=-=-=-=-=");
		for (int i = 0; i < nomes.size(); i++) {
			System.out.println(nomes.get(i));
		}

		System.out.println("\n\n=-=-=-=-=-=-= Imprimindo com lambda =-=-=-=-=-=-=");
		nomes.forEach(nome -> System.out.println(nome));		

	}

}
