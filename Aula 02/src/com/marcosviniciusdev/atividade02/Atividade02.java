package com.marcosviniciusdev.atividade02;

import java.util.Scanner;

public class Atividade02 {

    /*
    Crie um programa que calcule os juros simples. Solicite ao usuário que insira o valor principal, a
    taxa de juros e o tempo (em anos) e, em seguida, calcule e exiba o valor dos juros.
     */

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o valor: ");
        double valor = sc.nextDouble();

        System.out.println("Digite a taxa de juros em porcentagem: ");
        double juros = sc.nextDouble();

        juros = juros / 100;

        System.out.println("Digite o tempo: ");
        double tempo = sc.nextDouble();

        double jurosSimples = valor * juros * tempo;

        System.out.println("O valor do juros simples é: R$" + jurosSimples);

        sc.close();

    }

}
