package com.marcosvinicisudev;

public class Atividade01 {
	
	public static void main(String[] args) {
		// Fazer uma matriz 3x3 ou 4x4, imprimir os numeros da diagonal dessa matriz;
		
		int[][] matriz = new int[3][3];
		
		int numero = 2;
		
		/*for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz.length; j++) {
				matriz[i][j] = numero;
				System.out.print(matriz[i][j] + "\t");
				numero *= 2;
			}
			System.out.println();
		}*/
		
		System.out.println("\n\n");
		numero = 2;
		
		
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz.length; j++) {
				matriz[i][j] = numero;

				if (i == j) {
					System.out.print(matriz[i][j] + "\t");
				} else {
					System.out.print("\t");
				}
				numero *= 2;
			}
			System.out.println();
		}
		
		
	}

}
