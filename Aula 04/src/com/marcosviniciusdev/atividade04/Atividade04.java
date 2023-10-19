package com.marcosviniciusdev.atividade04;

import java.util.Scanner;

public class Atividade04 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Calculadora calculadora = new Calculadora();

        System.out.println("Digite o primeiro numero: ");
        calculadora.setNumero1(sc.nextDouble());

        System.out.println("Digite o segundo numero: ");
        calculadora.setNumero2(sc.nextDouble());



        sc.close();

    }

}
