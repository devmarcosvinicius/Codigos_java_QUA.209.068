package com.marcosviniciusdev.atividade03;

public class Atividade03 {

	public static void main(String[] args) {

		int[][] A = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		int[][] B = { { 9, 8, 7 }, { 6, 5, 4 }, { 3, 2, 1 } };

		int linhasA = A.length;
		int colunasA = A[0].length;
		int colunasB = B[0].length;

		int[][] C = new int[linhasA][colunasB];

		for (int i = 0; i < linhasA; i++) {
			for (int j = 0; j < colunasB; j++) {
				for (int k = 0; k < colunasA; k++) {
					C[i][j] += A[i][k] * B[k][j];
				}
			}
		}

		System.out.println("Matriz C:");
		for (int i = 0; i < linhasA; i++) {
			for (int j = 0; j < colunasB; j++) {
				System.out.print(C[i][j] + " ");
			}
			System.out.println();
		}
	}

}
