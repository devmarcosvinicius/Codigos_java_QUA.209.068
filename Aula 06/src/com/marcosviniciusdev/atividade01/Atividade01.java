package com.marcosviniciusdev.atividade01;

public class Atividade01 {
	
	public static void main(String[] args) {
		
		int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		
		int total = 0;
		
		for (int number: numbers) {
			total += number;
		}
		
		System.out.println("Soma dos numeros do vetor: " + total);
	}

}
