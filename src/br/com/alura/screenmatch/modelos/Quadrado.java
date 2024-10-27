package br.com.alura.screenmatch.modelos;

public class Quadrado implements Forma{

    private double lado;

    public Quadrado(double lado) {
        this.lado = lado;
    }

    public double getLado() {
        return lado;
    }

    @Override
    public double calcularArea() {
        return getLado() * 2;
    }

}
