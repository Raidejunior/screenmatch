package br.com.alura.screenmatch.desafioFinal;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Principal {
    /// Esse desafio é o conclusivo do curso Java: trabalhando com listas e coleções
    /// de dados da alura.

    public static void main(String[] args) {
        List<Compra> compras = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o limite do cartão:");
        Conta conta = new Conta(scanner.nextDouble());

        int n = 1;
        while (n != 0) {

            scanner.nextLine();

            System.out.println("Digite a descrição da compra:");
            Compra compra = new Compra(scanner.nextLine());

            System.out.println("Digite o valor da compra");
            compra.setValor(scanner.nextDouble());

            if(compra.getValor() > conta.getSaldo()) {
                System.out.println("Saldo Insuficiente!");
                System.out.println(retornaTabela(compras, conta));
                break;
            }
            else {
                compras.add(compra);
                conta.ajustaSaldo(compra.getValor());
                System.out.println("Compra realizada!");
            }

            System.out.println("Digite 0 para sair ou 1 para continuar");
            n = scanner.nextInt();
        }

    }

    public static String retornaTabela(List<Compra> compras, Conta conta) {

        Collections.sort(compras);

        return String.format("""
                **************************************************
                COMPRAS REALIZADAS:
                
                
                %s
                
                **************************************************
                
                %s
                """, compras.toString(), conta.toString());
    }
}
