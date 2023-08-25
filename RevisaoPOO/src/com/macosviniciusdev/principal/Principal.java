package com.macosviniciusdev.principal;

import com.macosviniciusdev.entities.Funcionario;
import com.macosviniciusdev.entities.Pessoa;

public class Principal {

	public static void main(String[] args) {
		
		Pessoa pessoa = new Pessoa();
		Pessoa func = new Funcionario();
		
		pessoa.setNome("Marcos");
		pessoa.setAltura(1.80);
		pessoa.setCpf("123.456.987-00");
		pessoa.setGenero("Masculino");
		pessoa.setIdade(25);
		
		System.out.println(pessoa);
				
		func.setNome("Marcos");
		func.setAltura(1.80);
		func.setCpf("123.456.987-00");
		func.setGenero("Masculino");
		func.setIdade(25);
		((Funcionario) func).setSalario(5552.55);
		((Funcionario) func).setEmpresa("Coca");
		
		System.out.println(func);
		
		int[] numeros = new int[5];
		
		int cont = 10;
		
		for (int i = 0; i < 5; i++) {
			numeros[i] = cont++;
		}
		
		for (int n: numeros) {
			System.out.println(n);
		}

	}

}
