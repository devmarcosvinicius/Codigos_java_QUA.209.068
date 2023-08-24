package com.marcosviniciusdev.principal;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import com.marcosviniciusdev.entities.Pessoa;

public class ProgramPessoa {
	
	public static void main(String[] args) {
		Pessoa pessoa1 = new Pessoa("Marcos", 25);
		Pessoa pessoa2 = new Pessoa("Vinicius", 25);
		Pessoa pessoa3 = new Pessoa("Luisa", 22);
		
		ArrayList<Pessoa> pessoas = new ArrayList<>();
		
		pessoas.add(pessoa1);
		pessoas.add(pessoa2);
		pessoas.add(pessoa3);
		
		pessoas.forEach(pessoa -> System.out.println(pessoa.getNome()));
		
		pessoas.stream().forEach(System.out::println);
		
		// Collections.sort(pessoas);
		Collections.sort(pessoas, Comparator.comparing(Pessoa::getIdade));
		
		pessoas.stream().forEach(System.out::println);
		
	}

}
