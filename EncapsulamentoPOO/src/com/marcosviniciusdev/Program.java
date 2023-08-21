package com.marcosviniciusdev;

import com.marcosviniciusdev.entities.Pessoa;

public class Program {
	
	public static void main(String[] args) {
		Pessoa pessoa = new Pessoa();
		
		pessoa.setNome("Marcos Vinicius");
		pessoa.setAno(1998);
		
		pessoa.imprimeDados();
	}

}
