package com.marcosviniciusdev.atividade03;

import java.util.Scanner;

public class Atividade03 {

    /*
    Desenvolva um programa que calcule o volume de uma esfera. Solicite ao usuário que insira o
    raio da esfera e, em seguida, calcule e exiba o volume.
     */

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o valor do raio da esfera: ");
        double raio = sc.nextDouble();

        double volume = (4.0 / 3.0) * Math.PI * Math.pow(raio, 3);

        System.out.printf("O volume da esfera de raio %.2f é igual a %.2f.", raio, volume);

        sc.close();

    }

}
