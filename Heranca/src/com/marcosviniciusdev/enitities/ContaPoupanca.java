package com.marcosviniciusdev.enitities;

public class ContaPoupanca extends Conta {
	
	@Override
	public void sacar(double saque) {
		saldo -= saque + 2.75;
	}

}
