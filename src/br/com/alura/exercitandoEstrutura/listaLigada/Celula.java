package br.com.alura.exercitandoEstrutura.listaLigada;

public class Celula {
    Object elemento;
    Celula proximo;

    public Celula(Object elemento, Celula proximo) {
        this.elemento = elemento;
        this.proximo = proximo;
    }

    public Celula getProximo() {
        return proximo;
    }

    public void setProximo(Celula proximo) {
        this.proximo = proximo;
    }

    public Object getElemento() {
        return elemento;
    }

    @Override
    public String toString() {
        return this.getElemento().toString();
    }
}
