package br.com.alura.screenmatch.modelos;

public class Circulo implements Forma{

    private double raio;
    private double pi = 3.14;

    public Circulo(double raio) {
        this.raio = raio;
    }

    public double getRaio() {
        return raio;
    }

    public double getPi() {
        return pi;
    }

    @Override
    public double calcularArea() {
        return this.getPi()* this.getRaio() * this.getRaio();
    }
}
