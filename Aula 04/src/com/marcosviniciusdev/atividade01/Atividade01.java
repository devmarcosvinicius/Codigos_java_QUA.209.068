package com.marcosviniciusdev.atividade01;

public class Atividade01 {

    public static void main(String[] args) {

        Produto produto = new Produto("Tenis Nike Air Force", 699.99, 1500);

        System.out.println(produto.toString());
        produto.adicionar(122);
        produto.remover(10);
        System.out.println(produto.toString());

    }

}
