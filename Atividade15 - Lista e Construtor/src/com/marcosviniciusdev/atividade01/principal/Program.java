package com.marcosviniciusdev.atividade01.principal;

import java.util.ArrayList;
import java.util.Scanner;

public class Program {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		ArrayList<String> nomes = new ArrayList<>();
		
		for (int i = 0; i < 5; i++) {
			System.out.println("Digite o nome do " + (i + 1) + " aluno: ");
			nomes.add(sc.nextLine());
		}
		
		System.out.println("=-=-=-=-= Lista de Pessoas =-=-=-=-=");
		for(String nome: nomes) {
			System.out.println(nome);
		}
		
		sc.close();
	}

}
