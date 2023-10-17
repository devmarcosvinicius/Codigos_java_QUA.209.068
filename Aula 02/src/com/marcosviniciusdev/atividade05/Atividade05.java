package com.marcosviniciusdev.atividade05;

import java.util.Scanner;

public class Atividade05 {

    /*
    Desenvolva um programa que calcula o fatorial de um número inteiro inserido pelo usuário. O
    fatorial de um número é o produto de todos os inteiros positivos de 1 até o número em questão.
     */

    public static int fatorial(int numero) {
        if (numero == 0) return 1;
        return numero * fatorial(numero - 1);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o numero desejado para obter o fatorial: ");
        int numero = sc.nextInt();

        System.out.printf("O fatorial de %d é igual a %d", numero, fatorial(numero));

        sc.close();

    }

}
