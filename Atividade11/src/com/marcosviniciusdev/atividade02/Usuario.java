package com.marcosviniciusdev.atividade02;

public class Usuario {
	
	public String nome;
	public int anoDeNascimento;
	public int anoAtual;
	
	public int obterIdade() {
		return anoAtual - anoDeNascimento; 
	}

}
