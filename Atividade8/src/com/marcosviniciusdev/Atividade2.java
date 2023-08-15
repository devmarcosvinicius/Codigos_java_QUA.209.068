package com.marcosviniciusdev;

import java.util.Scanner;

public class Atividade2 {
	
	public static void main(String[] args) {
		/*Um posto está vendendo combustíveis com a seguinte tabela de descontos:
		
				=-=-=-= Alcool =-=-=-=
		- Até 20 litros, desconto de 3% por litro Álcool.
		- Acima de 20 litros, desconto de 5% por litro.
		
				=-=-=-= Gasolina =-=-=-=
		- Até 20 litros, desconto de 4% por litro Gasolina.
		- Acima de 20 litros, desconto de 6% por litro.

		Escreva um algoritmo que leia o número de litros vendidos e o tipo de combustível (codificado da
		seguinte forma: A-álcool, G-gasolina), calcule e imprima o valor a ser pago pelo cliente sabendo-se
		que o preço do litro da gasolina é R$ 5,80 e o preço do litro do álcool é R$ 3,90.
		 */
		
		Scanner sc = new Scanner(System.in);
		
		// Criando as variaveis.
		char tipo;
		double litros;
		
		// Obtenho o tipo de combustivel e validando a entrada de dados.
		do {
			System.out.println("Qual tipo de combustivel: ");
			tipo = sc.next().charAt(0);
		} while (tipo != 'a' && tipo != 'A' && tipo != 'g' && tipo != 'G');
		
		// Obtendo a quantidade de combustivel e validando a entrada de dados.
		do {
			System.out.println("Digite quantos litros foi vendido: ");
			litros = sc.nextDouble();
		} while (litros <= 0);

		// Verificando se é alcool.
		if (tipo == 'a' || tipo == 'A') {
			// Verificando se é menor ou igual a 20 litros.
			if (litros <= 20.00) {
				// Calculando o valor do combustivel sem o desconto.
				double valorFinal = litros * 3.9;
				// Imprimindo o valor sem o desconto.
				System.out.println(valorFinal);
				// Calculando o valor do combustivel com o desconto.
				valorFinal = valorFinal - (valorFinal * .03);

				// Imprimindo o valor com o desconto.
				System.out.printf("O preço final com desconto de 4 porcento é: R$ %.3f", valorFinal);
			} else {
				// Verificando qualquer outro caso.
				double valorFinal = litros * 3.9;
				// Imprimindo o valor sem o desconto.
				System.out.println(valorFinal);
				// Calculando o valor do combustivel com o desconto.
				valorFinal = valorFinal - (valorFinal * .05);

				// Imprimindo o valor com o desconto.
				System.out.printf("O preço final com desconto de 6 porcento é: R$ %.3f", valorFinal);
			}
			
		// Verificando se é gasolina.
		} else if (tipo == 'g' || tipo == 'G') {
			// Verificando se é menor ou igual a 20 litros.
			if (litros <= 20.00) {
				// Calculando o valor do combustivel sem o desconto.
				double valorFinal = litros * 3.9;
				// Calculando o valor do combustivel com o desconto.
				valorFinal = valorFinal - (valorFinal * .04);

				// Imprimindo o valor com o desconto.
				System.out.printf("O preço final com desconto de 4 porcento é: R$ %.3f", valorFinal);
			} else {
				// Verificando qualquer outro caso.
				double valorFinal = litros * 3.9;
				// Imprimindo o valor sem o desconto.
				System.out.println(valorFinal);
				// Calculando o valor do combustivel com o desconto.
				valorFinal = valorFinal - (valorFinal * .06);

				// Imprimindo o valor com o desconto.
				System.out.printf("O preço final com desconto de 6 porcento é: R$ %.3f", valorFinal);
			}
		}
		
		sc.close();
		
	}

}
