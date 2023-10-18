package com.marcosviniciusdev.atividade05;

import java.util.Scanner;

public class Atividade05 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite uma nota de 0 a 100: ");
        int nota = sc.nextInt();

        if (nota >= 70) System.out.println("Aprovado");
        else if (nota >= 40) System.out.println("Recuperação");
        else System.out.println("Reprovado");

        sc.close();
    }

}
