package com.marcosviniciusdev.principal;

import com.marcosviniciusdev.enitities.Conta;
import com.marcosviniciusdev.enitities.ContaCorrente;
import com.marcosviniciusdev.enitities.ContaPoupanca;

public class Program {
	
	public static void main(String[] args) {
		Conta conta = new Conta();
		ContaCorrente cc = new ContaCorrente();
		ContaPoupanca cp1 = new ContaPoupanca();
		Conta cp2 = new ContaPoupanca();
		
		conta.setTitular("Luan");
		conta.setAgencia(123456);
		conta.setNumeroConta(5522);
		conta.depositar(150.25);
		conta.sacar(50.00);
		conta.obterDadosBancarios();
		
		System.out.println("\\n\\nConta Corrente: ");
		
		cc.setTitular("Luan");
		cc.setAgencia(123456);
		cc.setNumeroConta(5522);
		cc.depositar(550.95);
		cc.sacar(250.00);
		cc.obterDadosBancarios();
		
		System.out.println("\\n\\nConta Poupanca sem Polimofismo: ");
		
		cp1.setTitular("Luan");
		cp1.setAgencia(123456);
		cp1.setNumeroConta(5522);
		cp1.depositar(550.95);
		cp1.sacar(250.00);
		cp1.obterDadosBancarios();
		
		System.out.println("\n\nConta Poupanca com Polimofismo: ");
		
		cp2.setTitular("Luan");
		cp2.setAgencia(123456);
		cp2.setNumeroConta(5522);
		cp2.depositar(550.95);
		cp2.sacar(250.00);
		cp2.obterDadosBancarios();
		
		
	}

}
