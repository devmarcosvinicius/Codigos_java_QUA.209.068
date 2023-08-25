package com.macosviniciusdev.entities;

public class Funcionario extends Pessoa {

	private double salario;
	private String empresa;

	public Funcionario() {
		super();
	}

	public Funcionario(String nome, int idade, String cpf, String genero, double altura) {
		super(nome, idade, cpf, genero, altura);
	}

	public Funcionario(double salario, String empresa) {
		super();
		this.salario = salario;
		this.empresa = empresa;
	}


	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public String getEmpresa() {
		return empresa;
	}

	public void setEmpresa(String empresa) {
		this.empresa = empresa;
	}

	@Override
	public String toString() {
		return super.toString() + "\nSalario: " + this.salario + "\nEmpresa: " + this.empresa;
	}
}
