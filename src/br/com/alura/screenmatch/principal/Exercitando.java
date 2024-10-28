package br.com.alura.screenmatch.principal;

import java.util.*;

public class Exercitando {
    public static void main(String[] args) {
        Map<String, Integer> valores1 = new HashMap<String, Integer>();
        valores1.put("Raide", 1);
        valores1.put("Rafaela", 2);
        valores1.put("Maísa", 3);
        System.out.println("Valores 1: " + valores1);

        Map<String, Integer> valores2 = new HashMap<String, Integer>();
        valores2.put("André", 1);
        valores2.put("Pedro",2);
        valores2.put("Raide", 3);
        System.out.println("Valores 2: " + valores2);

        Set<String> valoresIguais = valores1.keySet();
        valoresIguais.retainAll(valores2.keySet());
        System.out.println("Valores Iguais: " + valoresIguais);

        ArrayList<String> valoresIguaisArray = new ArrayList<>();
        valoresIguaisArray.addAll(valoresIguais);
        System.out.println("Valores Iguais ARRAY: " + valoresIguais);

    }
}
