package com.marcosviniciusdev.atividade05;

public class Atividade05 {
	
	public static void main(String[] args) {
		
		Banco banco = new Banco("Marcos Vinicius", 3652);
		
		System.out.println(banco.depositar(1200));
		System.out.println(banco.depositar(300));
		System.out.println(banco.sacar(150));
		System.out.println(banco.sacar(30));
		
		System.out.println("Saldo em conta: R$" + banco.getSaldo());
	}

}
