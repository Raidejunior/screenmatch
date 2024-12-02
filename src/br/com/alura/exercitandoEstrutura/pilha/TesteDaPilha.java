package br.com.alura.exercitandoEstrutura.pilha;

import java.util.Stack;

public class TesteDaPilha {


    public static void main(String[] args) {
        Pilha pilha = new Pilha();


        System.out.println(pilha.vazia());

        pilha.insere("Mauricio");
        System.out.println(pilha);

        pilha.insere("Guilherme");
        System.out.println(pilha);

        System.out.println(pilha.vazia());

        String r1 = pilha.remove();
        System.out.println("R1: " + r1);

        String r2 = pilha.remove();
        System.out.println("R2: " + r2);

        System.out.println(pilha);

        // Agora usando a pilha que existe no Java!!

        Stack<String> stack = new Stack<String>();
        stack.push("Mauricio");
        stack.push("Marcelo");
        System.out.println("Stack: " + stack);

        String nome = stack.peek();
        System.out.println("Último nome que temos: " + nome);

        stack.pop();
        System.out.println("Stack tendo o último valor removido: " + stack);
    }


}
