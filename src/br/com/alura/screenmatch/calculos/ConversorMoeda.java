package br.com.alura.screenmatch.calculos;

public class ConversorMoeda implements ConversaoFinanceira {

    @Override
    public double converterDolarParaReal(double dolar) {
        return dolar / 5.5;
    }
}
