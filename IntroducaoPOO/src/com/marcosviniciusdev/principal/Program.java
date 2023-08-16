package com.marcosviniciusdev.principal;

import java.util.Scanner;

import com.marcosviniciusdev.entities.Carro;

public class Program {
	
	public static void main(String[] args) {		
		// Conceito de carro
		
		// caracteristicas (atributos)
		String modelo = "Onix";
		String placa = "abc-1234";
		String cor = "Vermelho";
		String ano = "2023";
		
		/* Exemplos de comportamentos: acelerar, freiar, mudarMarchar...
		/* comportamentos: metodos (funções).
		 * 
		 *
		 * Classes tem muitos recursos como:
		 * Sobrecarga (Overload) de metodos e construtores.
		 * 
		 * 4 pilares podem ser aplicados.
		 * Entidades (entities) de acordo com a modelagem de nogocio: Carro, Pessoa, endereço...
		 * Services: E-mailServices, ClienteServices...
		 * Controllers.
		 * Utilitarios: Math.
		 * Classe é um modelo do objeto.
		 */
		
		Scanner sc = new Scanner(System.in);
		
		Carro carro = new Carro();
		Carro carroPopular = new Carro();
		
		carro.modelo = "Celta";
		carro.ano = "2010";
		carro.placa = "aer-4567";
		carro.cor = "azul";
		
		carroPopular.modelo = "gol";
		carroPopular.cor = "vermelho";
		
		/*carroPopular.ano = sc.next();
		
		System.out.println(carro.ano);
		System.out.println(carroPopular.ano);*/
		
		System.out.println(carro.acelerar);
		
		carro.acelerarVeiculo();
		carro.acelerarVeiculo();
		carro.acelerarVeiculo();
		carro.acelerarVeiculo();
		
		System.out.println(carro.acelerar);
		
		
		sc.close();
		
		
	}

}