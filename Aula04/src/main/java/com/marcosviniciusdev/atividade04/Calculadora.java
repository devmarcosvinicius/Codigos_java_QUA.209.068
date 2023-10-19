package com.marcosviniciusdev.atividade04;

public class Calculadora {

    private double numero1;
    private double numero2;

    public Calculadora() {
    }

    public Calculadora(double numero1, double numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }

    public double getNumero1() {
        return numero1;
    }

    public void setNumero1(double numero1) {
        this.numero1 = numero1;
    }

    public double getNumero2() {
        return numero2;
    }

    public void setNumero2(double numero2) {
        this.numero2 = numero2;
    }

    public double somar() {
        return numero1 + numero2;
    }

    public double subtracao() {
        return numero1 - numero2;
    }

    public double mutipliacao() {
        return numero1 + numero2;
    }

    public double divisao() {
        return numero1 / numero2;
    }

}
