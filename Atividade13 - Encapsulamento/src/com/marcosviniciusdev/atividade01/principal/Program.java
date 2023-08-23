package com.marcosviniciusdev.atividade01.principal;

import java.util.Scanner;

import com.marcosviniciusdev.atividade01.entities.Carro;

public class Program {
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Carro carro = new Carro();
		
		System.out.println("Qual o modelo do carro? ");
		carro.setModelo(sc.next());
		
		System.out.println("Qual o ano do carro? ");
		carro.setAno(sc.nextInt());
		
		System.out.println("Qual a cor do carro? ");
		carro.setCor(sc.next());
		
		System.out.println("Qual a potencia do carro? ");
		carro.setMotor(sc.nextInt());
		
		System.out.println("Qual o cambio do carro? ");
		carro.setCambio(sc.next());
		
		System.out.println("Qual a velocidade atual do carro? ");
		carro.setVelocidade(sc.nextInt());
		
		carro.aumentarVelocidade();
		carro.diminuirVelocidade();
		
		sc.close();
		
	}

}
