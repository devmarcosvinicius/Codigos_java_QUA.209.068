package com.marcosviniciusdev.enitities;

public class ContaCorrente extends Conta {
	
	@Override
	public void sacar(double saque) {
		saldo -= saque + 2;
	}

}
