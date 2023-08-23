package com.marcosviniciusdev;

import java.util.Scanner;

public class Atividade1 {

	public static void main(String[] args) {
		/*
		 * Ler o nome de 2 times e o número de gols marcados na partida (para cada
		 * time). Escrever o nome do vencedor. Caso não haja vencedor deverá ser
		 * impressa a palavra EMPATE
		 */

		Scanner sc = new Scanner(System.in);

		// Obtendo o nome do primeiro time.
		System.out.println("Digite o nome do primeiro time: ");
		String time1 = sc.next();

		// Obtendo o total de gols marcado pelo primeiro time.
		System.out.println("Quantos gols o " + time1 + " marcou? ");
		int golsTime1 = sc.nextInt();

		// Obtendo o nome do segundo time.
		System.out.println("Digite o nome do segundo time: ");
		String time2 = sc.next();

		// Obtendo o total de gols marcado pelo segundo time.
		System.out.println("Quantos gols o " + time2 + " marcou? ");
		int golsTime2 = sc.nextInt();

		// Verificando se o primeiro time venceu
		if (golsTime1 > golsTime2) {
			System.out.println("O " + time1 + " foi o vencedor!");
			// Verificando se o segundo time venceu
		} else if (golsTime1 < golsTime2) {
			System.out.println("O " + time2 + " foi o vencedor!");
			// Verificando se houve IMPATE
		} else {
			System.out.println("EMPATE");
		}

		sc.close();
	}

}
