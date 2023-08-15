package com.marcosviniciusdev;

import java.util.Scanner;

public class Atividade02 {

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
		System.out.println("Salario bruto: \n\t" + salario);
		System.out.println("Bonifica��o:\n\t R$" + calcularComissao(vendas));
		System.out.printf("Descontos: \n\tINSS -R$%.2f \n\tIRPF -R$%.2f\n", (salario * .05), (salario * .11));
		System.out.printf("Salario final:\n\t R$%.2f", (salario + calcularComissao(vendas) - calcularImposto(vendas, salario)));
		
		sc.close();
		
	}
	
	static double calcularImposto(double vendas, double salarioBruto) {
		double inss = (salarioBruto + calcularComissao(vendas)) * .5;
		double irpf = (salarioBruto + calcularComissao(vendas)) * .11;
		
		return inss + irpf;
	}
	
	static double calcularComissao(double vendas) {
		double bonus = 0;
		
		if (vendas > 20.000) {
			bonus = vendas * .05;
		} else if (vendas > 15 && vendas < 20) {
			bonus = vendas * .03;
		} else if (vendas > 10 && vendas < 15) {
			bonus = vendas * .01;
		} else if (vendas < 10.000) {
			bonus = 0;
		}
		
		return bonus;
	}

}
