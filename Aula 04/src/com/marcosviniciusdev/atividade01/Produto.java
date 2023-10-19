package com.marcosviniciusdev.atividade01;

public class Produto {

    private String nome;
    private double preco;
    private int quantidade;

    public Produto(String nome, double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public void adicionar(int quantidade) {
        this.quantidade += quantidade;
    }

    public void remover(int quantidade) {
        this.quantidade -= quantidade;
    }

    public double getValorTotal() {
        return this.getPreco() * this.getQuantidade();
    }

    @Override
    public String toString() {
        return String.format("Nome: %s\nQuantidade: %d\nValor Total do Estoque: R$%.2f\n", this.getNome(), this.getQuantidade(), this.getValorTotal());
    }
}
