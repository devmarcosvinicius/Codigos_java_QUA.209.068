package com.marcosviniciusdev.atividade01;

import java.util.Scanner;

public class Atividade01 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a temperatura em celsius: ");
        double celsius = sc.nextDouble();

        double fahrenheit = (celsius * 9/5) + 32;

        System.out.printf("%.0f graus Celsius é igual a %.1f graus Fahrenheit.", celsius, fahrenheit);

        sc.close();
    }

}
