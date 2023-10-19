package com.marcosviniciusdev.atividade02;

public class Atividade02 {

    public static void main(String[] args) {

        ContaBancaria conta = new ContaBancaria("Marcos Vinicius", "555555-5");
        conta.depositar(521.00);
        conta.depositar(1200.00);
        conta.sacar(355.00);
        System.out.println(conta.toString());

    }

}
