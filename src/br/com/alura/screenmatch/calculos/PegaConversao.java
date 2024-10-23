package br.com.alura.screenmatch.calculos;

public class PegaConversao {
    private double convertido;
    public void pegaConversaoMoeda(ConversaoFinanceira conversaoFinanceira) {
        this.convertido = conversaoFinanceira.converterDolarParaReal(2300);
    }
}
