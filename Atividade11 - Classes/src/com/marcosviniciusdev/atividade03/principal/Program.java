package com.marcosviniciusdev.atividade03.principal;

import java.util.Scanner;

import com.marcosviniciusdev.atividade03.entities.Triangulo;

public class Program {
	
	public static void main(String[] args) {
		// Fa�a um programa que receba 3 valores e indique/retorne que tipo de triangulo ele pode ser;
		
		Scanner sc = new Scanner(System.in);
		
		Triangulo triagulo = new Triangulo();
		
		double x = 8.5;
		double y = 10.2;
		System.out.println((x*4/2)+y);
		
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
