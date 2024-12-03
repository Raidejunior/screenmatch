package br.com.alura.screenmatch.exercicios;

import com.google.gson.annotations.SerializedName;

import java.io.Serial;

public class Titulo implements Comparable<Titulo> {
    @SerializedName("Title")
    private String nome;
    @SerializedName("Year")
    private int anoDeLancamento;
    private boolean incluidoNoPlano;
    private double somaDasAvaliacoes;
    private int totalDeAvaliacoes;
    private int duracaoEmMinutos;

    public int getAnoDeLancamento() {
        return anoDeLancamento;
    }

    public Titulo(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }


    @Override
    public int compareTo(Titulo outroTitulo) {
        return this.getNome().compareTo(outroTitulo.getNome());
    }

    @Override
    public String toString() {
        return String.format("""
                Nome do Titulo: %s,
                Ano de lançamento: %d
                """, this.getNome(), this.getAnoDeLancamento());
    }
}
