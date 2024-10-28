package br.com.alura.screenmatch.exercicios;

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

        List<Integer> listaInteiros = new ArrayList<>();
        listaInteiros.add(2);
        listaInteiros.add(6);
        listaInteiros.add(1);
        listaInteiros.add(9);
        listaInteiros.add(7);
        listaInteiros.add(4);
        Collections.sort(listaInteiros);
        System.out.println("Lista ordenada: " + listaInteiros);

        List<Titulo> titulos = new ArrayList<Titulo>();
        Titulo titulo1 = new Titulo("Raide");
        Titulo titulo2 = new Titulo("Maísa");
        Titulo titulo3 = new Titulo("Rafaela");
        Titulo titulo4 = new Titulo("André");
        titulos.add(titulo1);
        titulos.add(titulo2);
        titulos.add(titulo3);
        titulos.add(titulo4);
        Collections.sort(titulos);
        System.out.println("Títulos ordenados: " + titulos);

        List<Integer> listaPolimorfica;
        listaPolimorfica = new ArrayList<>();
        listaPolimorfica.add(2);
        listaPolimorfica.add(6);
        listaPolimorfica.add(1);
        System.out.println("ArrayList: " + listaPolimorfica);

        listaPolimorfica = new LinkedList<>();
        listaPolimorfica.add(2);
        listaPolimorfica.add(6);
        listaPolimorfica.add(1);
        System.out.println("LinkedList: " + listaPolimorfica);
    }
}
