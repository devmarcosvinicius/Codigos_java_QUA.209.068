package principal;

public class Operadores {
	
	public static void main(String[] args) {
		/*
		 * Operadores Aritmeticos:
		 *  "+" Soma
		 *  "-" Subtra��o
		 *  "*" Multiplica��o
		 *  "/" Divis�o
		 *  "%" Modulo (Resto da divis�o)
		 */
		
		int numero1 = 4;
		int numero2 = 10;
		int soma = numero1 + numero2;
		int subtracao = numero1 - numero2;
		int divisao = numero1 / numero2;
		int multiplicacao = numero1 * numero2;
		int resto = numero1 % numero2;
		int calculo = 10 + 10 * 10 / 10;
		
		System.out.println("Resultado da soma: " + soma);
		System.out.println("Somando dois numeros: " + (numero1 + numero2));
		System.out.println("Subtra��o dois numeros: " + divisao);
		System.out.println("divis�o dois numeros: " + subtracao);
		System.out.println("Multiplica��o dois numeros: " + multiplicacao);
		System.out.println("resto dois numeros: " + resto);
		System.out.println("Calculo: " + calculo);
		
	}

}
