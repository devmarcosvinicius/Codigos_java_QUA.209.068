package com.marcosviniciusdev;

import java.util.Scanner;

public class EstruturasRepeticao {
	
	public static void main(String[] args) {
		/*
		 * =-=-=-= Estrutura de repetição =-=-=-=
		 * Uma estrutura de repetição repete determinado bloco de codigo 
		 * até que uma condição for satisfeita.
		 */
		
		/*
		 * =-=-=-= FOR =-=-=-=
		 * É utilizado quando sabemos a quantidade de vezes necessaria da repetição.
		 */
		
		for (int i = 0; i < 10; i++) {
			System.out.println("Contador está em: " + i);
		}
		
		/*
		 * =-=-=-= WHILE =-=-=-=
		 * É utilizado quando não sabemos a quantidade de vezes necessaria de repetições.
		 */
		
		Scanner sc = new Scanner(System.in);
		
		int contador = 0;
		char opcao;
		
		System.out.println("Dseja entrar no loop s/n: ");
		opcao = sc.next().charAt(0);
		
		while (opcao == 'S' || opcao == 's') {
			System.out.println("Contador valendo " + contador);
			contador++;
			System.out.println("Deseja continuar no loop? s/n ");
			opcao = sc.next().charAt(0);
		}
		
		/*
		 * =-=-=-= DO WHILE =-=-=-=
		 * É executado pelo menos uma vez.
		 */
		
		contador = 0;
		
		do {
			System.out.println("Contador está valendo: " + contador);
			contador++;
			System.out.println("Deseja continuar no loop? s/n ");
			opcao = sc.next().charAt(0);
		} while (opcao == 's' || opcao == 'S');
		
		sc.close();
		
	}

}
