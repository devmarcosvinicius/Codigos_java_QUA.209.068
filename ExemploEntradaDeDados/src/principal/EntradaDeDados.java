package principal;

import java.util.Scanner;

public class EntradaDeDados {
	
	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		String nome;
		int idade;
		double altura;
		char sexo;
		
		System.out.println("Digite seu nome: ");
		
		// Leitura de dados tipo String (Conjunto de caracteres).
		nome = leia.nextLine();

		System.out.println("Digite sua idade: ");
		
		// Leitura de dados tipo int (Conjunto de caracteres).
		idade = leia.nextInt();

		System.out.println("Digite sua altura: ");
		
		// Leitura de dados tipo double (Conjunto de caracteres).
		altura = leia.nextDouble();
		
		System.out.println("Qual o sexo? (m/f): ") ;
		
		// Leitura de dados tipo char.		
		sexo = leia.next().charAt(0);
		
		System.out.println("O nome digitado foi: " + nome);
		System.out.println("A idade digitado foi: " + idade);
		System.out.println("A altura digitado foi: " + altura);
		System.out.println("O sexo digitado foi: " + sexo);
		
		leia.close();
		
	}

}
