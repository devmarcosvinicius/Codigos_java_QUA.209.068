package com.marcosviniciusdev.atividade03;

import java.util.Scanner;

public class Program {
	
	public static void main(String[] args) {
		// Faça um programa que receba 3 valores e indique/retorne que tipo de triangulo ele pode ser;
		
		Scanner sc = new Scanner(System.in);
		
		Triangulo triagulo = new Triangulo();
		
		System.out.println("Digite o tamanho do primeiro lado do triangulo: ");
		triagulo.lado1 = sc.nextDouble();
		
		System.out.println("Digite o tamanho do segundo lado do triangulo: ");
		triagulo.lado2 = sc.nextDouble();;
		
		System.out.println("Digite o tamanho do terceiro lado do triangulo: ");
		triagulo.lado3 = sc.nextDouble();
		
		System.out.println(triagulo.obterTipo());
		
		sc.close();
		
	}

}
