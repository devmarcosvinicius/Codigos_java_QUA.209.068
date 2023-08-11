package com.marcosviniciusdev;

import java.util.Scanner;

public class Atividade1 {
	
	public static void main(String[] args) {
		/*Ler o nome de 2 times e o número de gols marcados na partida (para cada time). Escrever o nome
		do vencedor. Caso não haja vencedor deverá ser impressa a palavra EMPATE
		 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o nome do primeiro time: ");
		String time1 = sc.next();
		
		System.out.println("Quantos gols o " + time1 + " marcou? ");
		int golsTime1 = sc.nextInt();
		
		System.out.println("Digite o nome do segundo time: ");
		String time2 = sc.next();
		
		System.out.println("Quantos gols o " + time2 + " marcou? ");
		int golsTime2 = sc.nextInt();
		
		if (golsTime1 > golsTime2) {
			System.out.println("O " + time1 + " foi o vencedor!");
		} else if (golsTime1 < golsTime2) {
			System.out.println("O " + time2 + " foi o vencedor!");
		} else {
			System.out.println("EMPATE");
		}
		
		
		sc.close();
	}

}
