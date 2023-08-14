package com.marcosvinicisudev;

import java.util.Scanner;

public class Atividade02 {

	public static void main(String[] args) {
		// Fazer uma matriz 5x5 para inserir nome e as 4 notas do aluno, não precisa
		// mostrar a media. Imprima o nome e as notas.
		Scanner sc = new Scanner(System.in);

		String[][] nome = new String[2][6];
		double media = 0;

		for (int i = 0; i < nome.length; i++) {
			media = 0;
			for (int j = 0; j < nome[i].length; j++) {
				if (j == 0) {
					System.out.println("Digite o nome do " + (i + 1) + " aluno: ");
					nome[i][j] = sc.next();
				} else if (j != 5){
					System.out.println("Digite a nota " + j + " do " + (i + 1) + " aluno: ");
					nome[i][j] = sc.next();
					media += Double.parseDouble(nome[i][j]);
					nome[i][5] = Double.toString(media);
				} else {
					media += Double.parseDouble(nome[i][j]);
					media = media / 4;
					nome[i][5] = Double.toString(media);
				}
			}
		}

		for (int i = 0; i < nome.length; i++) {
			for (int j = 0; j < nome[i].length; j++) {
				System.out.print(nome[i][j] + "\t");
			}
			System.out.println();
		}
		

		sc.close();
	}

}
