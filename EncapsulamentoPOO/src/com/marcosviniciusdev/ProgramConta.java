package com.marcosviniciusdev;

import com.marcosviniciusdev.entities.Conta;

public class ProgramConta {
	
	public static void main(String[] args) {
		Conta conta = new Conta();
		
		conta.setTitular("Marcos");
		conta.setAgencia("2561-x");
		conta.setNumeroConta(6615);
		
		conta.obterDadosBancarios();
		conta.depositar(50);
		conta.obterDadosBancarios();
		conta.sacar(500);
		conta.obterDadosBancarios();
	}

}
