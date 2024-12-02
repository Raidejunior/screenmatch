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

        LinkedList<String> filaComLista = new LinkedList<>();
        filaComLista.push("Mauricio");
        filaComLista.push("Guilherme");

        System.out.println("Com lista: " + filaComLista);

        filaComLista.push("Raide");
        filaComLista.push("Maísa");

        String x2 = filaComLista.remove();
        System.out.println("Retirado com remove(Lança erro se a lista for vazia): " + x2);
        System.out.println("Retirado com pool(Retorna null se a lista for vazia): " + x2);
        System.out.println("Fila atual com lista: " + filaComLista);

        filaComLista.push("Rafaela");

        System.out.println("Último elemento da fila com lista com element(Lança erro se a lista for vazia): " + filaComLista.element());
        System.out.println("Último elemento da fila com lista com peek(Retorna null se a lista for vazia): " + filaComLista.peek());

    }
}