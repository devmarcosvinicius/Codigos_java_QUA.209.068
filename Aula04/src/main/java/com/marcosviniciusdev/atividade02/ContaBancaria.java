package com.marcosviniciusdev.atividade02;

public class ContaBancaria {

    private String nomeTitular;
    private String numeroDaConta;
    private double saldo;

    public ContaBancaria(String nomeTitular, String numeroDaConta) {
        this.nomeTitular = nomeTitular;
        this.numeroDaConta = numeroDaConta;
    }

    public String getNomeTitular() {
        return nomeTitular;
    }

    public void setNomeTitular(String nomeTitular) {
        this.nomeTitular = nomeTitular;
    }

    public String getNumeroDaConta() {
        return numeroDaConta;
    }

    public void setNumeroDaConta(String numeroDaConta) {
        this.numeroDaConta = numeroDaConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void depositar(double valor) {
        this.saldo += valor;
    }

    public void sacar(double valor) {
        this.saldo -= valor;
    }

    @Override
    public String toString() {
        return "ContaBancaria: " +
                "nomeTitular= " + nomeTitular +
                ", numeroDaConta= " + numeroDaConta +
                ", saldo= R$" + saldo;
    }
}
