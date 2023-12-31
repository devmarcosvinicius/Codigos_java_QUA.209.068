package principal;

public class Variaveis {

	public static void main(String[] args) {
		// numero inteiro
		int numero = 10;
		// numero = 10;

		// numero decimal - ponto flutuante
		double decimal = 10.50;

		// O casting faz o arredondamento nesse caso.
		int testeNumero = (int) 55.55;
		// Ele transformar o int em double implicitamente
		double testeNovoNumero = 10;

		// Aspas duplas para strings.
		String nome = "Marcos Vinicius";
		// O char � criado com aspas simples.
		char sexo = 'M';

		// booleans s�o valores verdadeiros ou falso.
		boolean verdadeiro = true;
		boolean falso = false;

		// Impress�o das variaveis na tela.
		System.out.println(numero);
		System.out.println(decimal);
		System.out.println(testeNumero);
		System.out.println(testeNovoNumero);
		System.out.println(nome);
		System.out.println(sexo);
		System.out.println(verdadeiro);
		System.out.println(falso);

		// println quebra linha ao final da impress�o.
		System.out.print("Meu nome: ");
		// print n�o quebra linha ao final da impress�o.
		System.out.println("Marcos Vinicius.");
		
		System.out.println("=-=-=-=-=-=-=-=-==-=-=-=-=-=-=-=-=");
		// Concatena��o
		double peso = 79.00;
		int idade = 25;
		
		System.out.print("Meu nome �: " + nome + ", sou do sexo: " + sexo + ". Tenho " + idade + " anos de idade e peso " + peso + " kg.");

	}

}
