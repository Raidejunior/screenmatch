package br.com.alura.screenmatch.principal;

import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;
import br.com.alura.screenmatch.modelos.Titulo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class PrincipalComListas {
    public static void main(String[] args) {
        Filme meuFilme = new Filme("O poderoso chefão", 1970);
        meuFilme.avalia(9);
        Filme outroFilme = new Filme("Avatar", 2023);
        meuFilme.avalia(6);
        var filmeDoPaulo = new Filme("Dogville", 2003);
        meuFilme.avalia(7);
        Serie lost = new Serie("Lost", 2000);

        ArrayList<Titulo> lista = new ArrayList<>();
        lista.add(filmeDoPaulo);
        lista.add(meuFilme);
        lista.add(outroFilme);
        lista.add(lost);
        for (Titulo item: lista) {
            System.out.println(item.getNome());
            if( item instanceof Filme filme) {
                System.out.println("Classificação " + filme.getClassificacao());
            }
        }
        lista.forEach(item -> System.out.println(item));

        ArrayList<String> buscaPorArtistas = new ArrayList<>();
        buscaPorArtistas.add("Adam Sandler");
        buscaPorArtistas.add("Raide");
        buscaPorArtistas.add("Maísa");
        System.out.println(buscaPorArtistas);

        Collections.sort(buscaPorArtistas);
        System.out.println("Artistas ordenados: ");
        System.out.println(buscaPorArtistas);
        Collections.sort(lista);
        System.out.println("Lista ordenada por nome: ");
        System.out.println(lista);
        lista.sort(Comparator.comparing(Titulo::getAnoDeLancamento));
        System.out.println("Lista ordenada por ano");
        System.out.println(lista);

    }
}
