package com.marcosviniciusdev.atividade06;

import java.util.Scanner;

public class Atividade06 {

    /*
    Crie um programa que verifica se uma palavra inserida pelo usuário é um palíndromo, ou seja,
    se ela é a mesma quando lida de trás para frente (ignorando espaços e maiúsculas/minúsculas).
     */

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a palavra para verificar se é palindromo: ");
        String palavra = sc.nextLine();

        String palindromo = isPalindromo(palavra) ? palavra + " é uma palavra palindromo": palavra + " não é uma palavra palindromo.";

        System.out.println(palindromo);

        sc.close();

    }

    public static boolean isPalindromo(String palavra) {
        int inicio = 0;
        int fim = palavra.length() - 1;
        palavra = palavra.toLowerCase();

        while (inicio < fim) {
            if (palavra.charAt(inicio) != palavra.charAt(fim)) return false;
            inicio++;
            fim--;
        }

        return true;

    }

}
