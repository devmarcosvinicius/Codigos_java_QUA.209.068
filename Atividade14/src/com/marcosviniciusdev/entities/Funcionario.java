package com.marcosviniciusdev.entities;

public class Funcionario {

	private String nome;
	protected double salarioBruto;
	private int idade;
	protected double bonus;

	public double getBonus() {
		return bonus;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setSalarioBruto(double salarioBruto) {
		this.salarioBruto = salarioBruto;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public double getSalarioBruto() {
		return salarioBruto;
	}

	public void obterDadosFuncionario() {
		System.out.println("\n\n=-=-=-=-==-=-=-=-=-=-=-=-=-=-=-=-=-=");
		System.out.println("Nome: " + getNome());
		System.out.println("Idade: " + getIdade());
		System.out.println("Salario Bruto: " + getSalarioBruto());
		System.out.println("Bonificação: " + getBonus());
		System.out.println("Salario com bonificação: " + (getBonus() + getSalarioBruto()));
	}

}
