package br.com.alura.screenmatch.desafioFinal;

import java.util.Collections;
import java.util.List;

public class Conta {
    private double saldo;

    public Conta(double saldo) {
        this.saldo = saldo;
    }

    public double getSaldo() {
        return saldo;
    }

    public void ajustaSaldo(double valor) {
        this.saldo -= valor;
    }

    @Override
    public String toString() {
        return String.format("""
                Saldo do cartão: %.1f
                """, this.getSaldo());
    }
}
