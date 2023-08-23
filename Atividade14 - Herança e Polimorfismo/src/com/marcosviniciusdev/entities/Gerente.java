package com.marcosviniciusdev.entities;

public class Gerente extends Funcionario {
	
	@Override
	public double getBonus() {
		return (salarioBruto * .05);
	}

}
