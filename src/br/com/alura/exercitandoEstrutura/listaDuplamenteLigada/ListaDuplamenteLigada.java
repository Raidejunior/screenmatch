package br.com.alura.exercitandoEstrutura.listaDuplamenteLigada;

public class ListaDuplamenteLigada {

    private Celula primeira = null;
    private Celula ultima = null;
    private int totalDeElementos = 0;

    public void adicionaNoComeco(Object elemento) {
        if(this.totalDeElementos == 0) {
            Celula nova = new Celula(elemento);
            this.primeira = nova;
            this.ultima = nova;
        } else {
            Celula nova = new Celula(elemento, this.primeira);
            this.primeira.setAnterior(nova);
            this.primeira = nova;
        }
        System.out.println("BATEU");
        this.totalDeElementos++;
    }

    public void adiciona(Object elemento) {
        if( this.totalDeElementos == 0) {
            adicionaNoComeco(elemento);
        } else {
            Celula nova = new Celula(elemento, null);
            this.ultima.setProximo(nova);
            this.ultima = nova;
            this.totalDeElementos++;
        }
    }

    public void adiciona(int posicao, Object elemento) {

        if(this.totalDeElementos == 0) {
            this.totalDeElementos++;
        } else if (posicao == this.totalDeElementos) {
            this.adiciona(elemento);
        } else {
            Celula anterior = this.pegaCelula(posicao - 1);
            Celula nova = new Celula(elemento, anterior.getProximo());
            anterior.setProximo(nova);
            totalDeElementos++;
        }
    }

    public Object pega(int posicao) {
        return this.pegaCelula(posicao).getElemento();
    }

    public void remove(int posicao) {
        if(totalDeElementos == 0 || posicao > totalDeElementos) {
            throw new IllegalArgumentException("Não há elementos para retirar ou posição não existe na lista.");
        }

        Celula antesDaAtual = this.primeira;

        for(int i = 0; i < posicao - 1; i++) {
            antesDaAtual = antesDaAtual.getProximo();
        }

        Celula proximoElementoAoRetirado = antesDaAtual.getProximo();
        proximoElementoAoRetirado = proximoElementoAoRetirado.getProximo();
        antesDaAtual.setProximo(proximoElementoAoRetirado);

        totalDeElementos--;
    }

    public void removeDoComeco() {
        if(this.totalDeElementos == 0) {
            throw new IllegalArgumentException("Lista vazia");
        }

        this.primeira = this.primeira.getProximo();
        totalDeElementos--;

        if(this.totalDeElementos == 0) {
            this.ultima = null;
        }
    }

    public int tamanho() {
        return this.totalDeElementos;
    }

    public boolean contem(Object o) { return false;}

    private boolean posicaoOcupada(int posicao) {
        return posicao >= 0 && posicao < this.totalDeElementos;
    }

    private Celula pegaCelula(int posicao) {
        if(!posicaoOcupada(posicao)) {
            throw new IllegalArgumentException("posicao inexistente");
        }

        Celula atual = primeira;

        for(int i = 0; i < posicao; i++) {
            atual = atual.getProximo();
        }

        return atual;
    }

    @Override
    public String toString() {
        if(totalDeElementos == 0) {
            return "[]";
        }

        Celula atual = primeira;

        StringBuilder builder = new StringBuilder("[");

        for(int i = 0; i < totalDeElementos; i++) {
            builder.append(atual.getElemento());
            builder.append(", ");

            atual = atual.getProximo();
        }

        builder.append("]");

        return builder.toString();

    }

}
