package br.com.alura.screenmatch.desafioFinal;

public class Compra implements Comparable<Compra>{
    private String descricao;
    private double valor;

    public String getDescricao() {
        return descricao;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public double getValor() {
        return valor;
    }

    public Compra(String descricao) {
        this.descricao = descricao;
        this.valor = valor;
    }


    @Override
    public int compareTo(Compra outrasCompras) {
        if(this.getValor() < outrasCompras.getValor()) {
            return -1;
        } else if (this.getValor() > outrasCompras.getValor()) {
            return 1;
        }

        return 0;
    }


    @Override
    public String toString() {
        return String.format("""
                %s - %.1f
               """, this.getDescricao(), this.getValor());
    }
}
