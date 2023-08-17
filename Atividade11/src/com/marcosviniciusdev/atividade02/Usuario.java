package com.marcosviniciusdev.atividade02;

public class Usuario {
	
	public String nome;
	public int anoDeNascimento;
	
	public int obterIdade(int anoAtual) {
		return anoAtual - anoDeNascimento; 
	}

}
