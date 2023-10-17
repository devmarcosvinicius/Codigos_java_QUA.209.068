package com.marcosviniciusdev.atividade04;

import java.util.Scanner;

public class Atividade04 {

    /*
    Crie um programa que verifica se um ano inserido pelo usuário é bissexto. Um ano bissexto é
    aquele que é divisível por 4, exceto quando também é divisível por 100, a menos que seja
    divisível por 400.
     */

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o ano: ");
        int ano = sc.nextInt();

        String bissexto = (ano % 4 == 0 && ano % 100 != 0) || ano % 400 == 0 ? ano + " é um ano bissexto" : ano + " não é uma nao bissexto.";

        System.out.println(bissexto);

        sc.close();

    }

}
