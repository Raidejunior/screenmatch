package br.com.alura.exercitandoEstrutura.vetor;

import java.util.Arrays;

public class Vetor {
    private Aluno[] alunos = new Aluno[100];
    int totalDeAlunos = 0;

    public void adiciona(Aluno aluno) {
        alunos[totalDeAlunos] = aluno;
        totalDeAlunos++;
    }

    public void adiciona(int posicao, Aluno aluno) {
        if(!estaDentro(posicao)) {
            throw new IllegalArgumentException("Posição inválida!");
        }
        for( int i = totalDeAlunos - 1; i >= posicao; i--) {
            this.alunos[i+1] = this.alunos[i];
        }

        this.alunos[posicao] = aluno;

        totalDeAlunos++;
    }

    private boolean estaDentro(int posicao) {
        return posicao >= 0 && posicao < this.totalDeAlunos;
    }

    public Aluno pega(int posicao) {
        if(!estaDentro(posicao)) {
            throw new IllegalArgumentException("Posição inválida!");
        }

        return this.alunos[posicao];
    }

    public void remove(int posicao) {
        for(int i = posicao; i < this.totalDeAlunos; i++ ) {
            this.alunos[i] = this.alunos[i+1];
        }
        totalDeAlunos--;
    }

    public boolean contem(Aluno aluno) {

        for(int i=0;i<this.totalDeAlunos;i++){
            if(aluno.equals(this.alunos[i])) {
                return true;
            }
        }

        return false;
    }

    public int tamanho() {
        return this.totalDeAlunos;
    }

    @Override
    public String toString() {
        // facilitará na impressão
        return Arrays.toString(alunos);
    }
}
