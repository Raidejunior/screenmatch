package br.com.alura.screenmatch.exercicios;

import br.com.alura.screenmatch.modelos.TituloOmdb;
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

    public Titulo(TituloOmdb meuTituloOMDB) {
        this.nome = meuTituloOMDB.title();
        this.anoDeLancamento = Integer.valueOf(meuTituloOMDB.year());
        this.duracaoEmMinutos = Integer.valueOf(meuTituloOMDB.runtime().substring(0, 3));
    }

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

    public int getDuracaoEmMinutos() {
        return duracaoEmMinutos;
    }

    @Override
    public String toString() {
        return String.format("""
                Nome do Titulo: %s,
                Ano de lançamento: %d,
                Duração: %d
                """, this.getNome(), this.getAnoDeLancamento(), this.getDuracaoEmMinutos());
    }
}
