package com.marcosviniciusdev;

import java.util.Scanner;

public class Atividade02 {

	static double INSS = .05;
	static double IRPF = .11;

	public static void main(String[] args) {
		/*
		 * Fa�a um programa que receba o salario e a quantidade de venda total que o
		 * vendedor fez no mes, e calcule o salario do m�s. H� tamb�m o desconto de 5%
		 * de inss e 11% de IRPF sobre o salario bruto.
		 * 
		 * Se o vendedor possui o total de venda acima de 20 mil no m�s, ele recebe uma
		 * bonifica��o de 5% sobre o valor das vendas;
		 * 
		 * Se o vendedor possui o total de venda entre 15 e 20 mil reais, recebe uma
		 * bonifica��o de 3% no valor da venda;
		 * 
		 * Se o vendedor possui o total de venda entre 10 e 15 mil reais, recebe uma
		 * bonifica��o de 1% no valor da venda;
		 * 
		 * Se o valor n�o passar de 10 mil, imprima uma frase motivacional;
		 * 
		 * Todos os funcion�rios devem ter o contracheques detalhado, funcion�rios que
		 * receberam bonifica��es n�o devem ter descontos sobre a bonifica��o, indicando
		 * o m�s de referencia;
		 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite o valor do salario bruto do vendedor: R$");
		double salario = sc.nextDouble();
		
		System.out.print("Digite o valor de vendas do vendedor: R$");
		double vendas = sc.nextDouble();
		
		System.out.println("\n\n=-=-=-=-=-= Holerite =-=-=-=-=-=");
		System.out.printf("Salario bruto: \n\tR$%.2f\n", salario);
		System.out.printf("Bonifica��o:\n\t R$%.2f\n", calcularComissao(vendas));
		System.out.printf("Descontos: \n\tINSS -R$%.2f \n\tIRPF -R$%.2f\n", (salario * INSS), (salario * IRPF));
		System.out.printf("Salario final:\n\t R$%.2f", (salario + calcularComissao(vendas) - calcularImposto(salario)));
		
		if (calcularComissao(vendas) < 10000) {
			System.out.println("\n\nN�o desista, persistencia � a chave.");
		}
		
		sc.close();
		
	}
	
	static double calcularImposto(double salarioBruto) {
		return (salarioBruto * INSS) + (salarioBruto * IRPF);
	}
	
	static double calcularComissao(double vendas) {
		double bonus = 0;
		
		if (vendas > 20000) {
			bonus = vendas * .05;
		} else if (vendas > 15000) {
			bonus = vendas * .03;
		} else if (vendas > 10000) {
			bonus = vendas * .01;
		} else if (vendas < 10000) {
			bonus = 0;
		}
		
		return bonus;
	}

}
