package com.marcosviniciusdev.principal;

import com.marcosviniciusdev.entities.Funcionario;
import com.marcosviniciusdev.entities.Gerente;

public class Program {
	
	public static void main(String[] args) {
		/*
		 * Crie uma programa que fa�a o cadastro de funcion�rios, se o funcion�rio tiver um cargo de chefia ele 5% de bonifica��o sobre o salario bruto. 
		 * Mostre os dados dos funcion�rios cadastrados, salario bruto, idade, e quando houver, imprima o salario com o valor da bonifica��o descrito;
		 */
		
		Funcionario func = new Funcionario();
		Funcionario gerente = new Gerente();
		
		func.setNome("Caio");
		func.setIdade(18);
		func.setSalarioBruto(2000);
		
		func.obterDadosFuncionario();

		gerente.setNome("Marcos");
		gerente.setIdade(25);
		gerente.setSalarioBruto(5000);
		gerente.setBonus(500);
		
		gerente.obterDadosFuncionario();
		
	}

}
