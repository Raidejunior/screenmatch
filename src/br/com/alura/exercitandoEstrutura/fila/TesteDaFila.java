package br.com.alura.exercitandoEstrutura.fila;

import java.util.LinkedList;
import java.util.Queue;

public class TesteDaFila {

    public static void main(String[] args) {
        Fila fila = new Fila();

        fila.adiciona("Mauricio");
        fila.adiciona("Guilherme");

        System.out.println(fila);

        String x1 = fila.remove();
        System.out.println("Retirado: " + x1);
        System.out.println("Fila atual: " + fila);

        // Usando agora a fila do java!!
        // Para as filas, usamos add para adicionar e pool para remover!
        Queue<String> filaDoJava = new LinkedList<>();
        filaDoJava.add("Mauricio");
        filaDoJava.add("Guilherme");

        System.out.println("Com lista: " + filaDoJava);

        filaDoJava.add("Raide");
        filaDoJava.add("Maísa");

        String x2 = filaDoJava.remove();
        System.out.println("Elemento Retirado com remove(Lança erro se a lista for vazia): " + x2);
        System.out.println("Elemento Retirado com pool(Retorna null se a lista for vazia): " + x2);
        System.out.println("Fila atual com lista: " + filaDoJava);

        filaDoJava.add("Rafaela");

        System.out.println("Último elemento da fila com lista com element(Lança erro se a lista for vazia): " + filaDoJava.element());
        System.out.println("Último elemento da fila com lista com peek(Retorna null se a lista for vazia): " + filaDoJava.peek());

        System.out.println(filaDoJava);


    }
}