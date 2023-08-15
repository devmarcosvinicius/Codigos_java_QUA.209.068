package com.marcosviniciusdev;

public class Funcoes {
	
	public static void main(String[] args) {
		/* Fun��es representam m processamento ou processo.
		 * O que identifica s�o os parenteses.
		 * System.out.println() � um exemplo de fun��o/procedimento.
		 */
		
		mostrarMensagem();
		mostrarMensagemComParametro(25);
		
		System.out.println(calcular());
		
		int receberCalculo = calcular();
		
		System.out.println("Recebeu: " + receberCalculo);
		System.out.println("A soma �: " + somar(5, 6));
		
		int x = 10;
		int y = 100;
		
		System.out.println("Nova soma: " + somar(x, y));
		
		int a = 50;
		int b = 50;
		
		System.out.println("Nova segunda soma: " + somar(a, b));
		
	}
	
	static void mostrarMensagem() {
		System.out.println("Minha primeira fun��o!");
	}
	
	static void mostrarMensagemComParametro(int idade) {
		System.out.println("Minha idade � " + idade);
	}
	
	static int calcular() {
		int x = 10;
		int y = 5;
		
		return x + y;
	}
	
	static int somar(int x, int y) {
		return x + y;
	}

}
