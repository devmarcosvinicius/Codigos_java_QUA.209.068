package com.marcosviniciusdev;

import java.util.Scanner;

public class EstruturasRepeticao {
	
	public static void main(String[] args) {
		/*
		 * =-=-=-= Estrutura de repeti��o =-=-=-=
		 * Uma estrutura de repeti��o repete determinado bloco de codigo 
		 * at� que uma condi��o for satisfeita.
		 */
		
		/*
		 * =-=-=-= FOR =-=-=-=
		 * � utilizado quando sabemos a quantidade de vezes necessaria da repeti��o.
		 */
		
		for (int i = 0; i < 10; i++) {
			System.out.println("Contador est� em: " + i);
		}
		
		/*
		 * =-=-=-= WHILE =-=-=-=
		 * � utilizado quando n�o sabemos a quantidade de vezes necessaria de repeti��es.
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
		 * � executado pelo menos uma vez.
		 */
		
		contador = 0;
		
		do {
			System.out.println("Contador est� valendo: " + contador);
			contador++;
			System.out.println("Deseja continuar no loop? s/n ");
			opcao = sc.next().charAt(0);
		} while (opcao == 's' || opcao == 'S');
		
		sc.close();
		
	}

}
