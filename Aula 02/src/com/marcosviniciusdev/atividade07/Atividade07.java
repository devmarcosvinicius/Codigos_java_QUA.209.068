package com.marcosviniciusdev.atividade07;

import java.util.Scanner;

public class Atividade07 {

    /*
    Desenvolva um programa que gera e exibe os primeiros "n" termos da sequência de Fibonacci.
    A sequência começa com 0 e 1, e os termos subsequentes são a soma dos dois termos
    anteriores.
     */


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a quantidade que deseja: ");
        double qnt = sc.nextInt();

        for (int i = 0; i < qnt; i++) {
            System.out.printf("%.0f", calcularFibonacci(i));
        }

        sc.close();

    }

    public static double calcularFibonacci(double n) {
        if (n <= 1) {
            return n;
        }

        double primeiro = 0;
        double segundo = 1;
        double resultado = 0;

        for (int i = 2; i <= n; i++) {
            resultado = primeiro + segundo;
            primeiro = segundo;
            segundo = resultado;
        }

        return resultado;
    }

}
