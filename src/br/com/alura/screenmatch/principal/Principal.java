package br.com.alura.screenmatch.principal;

import br.com.alura.screenmatch.calculos.CalculadoraTempo;
import br.com.alura.screenmatch.calculos.FiltroRecomendacao;
import br.com.alura.screenmatch.modelos.*;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        Filme meuFilme = new Filme("O poderoso chefão", 1970);
        meuFilme.setDuracaoEmMinutos(180);

        meuFilme.exibeFichaTecnica();
        meuFilme.avalia(8);
        meuFilme.avalia(5);
        meuFilme.avalia(10);
        System.out.println("Total de Avaliações: " + meuFilme.getTotalDeAvaliacoes());
        System.out.println(meuFilme.pegaMedia());

        Serie lost = new Serie("Lost", 2000);
        lost.exibeFichaTecnica();
        lost.setTemporadas(10);
        lost.setEpisodiosPorTemporada(10);
        lost.setMinutosPorEpisodio(50);
        System.out.println("Duração do filme: " + lost.getDuracaoEmMinutos());

        Filme outroFilme = new Filme("Avatar", 2023);
        outroFilme.setDuracaoEmMinutos(200);

        CalculadoraTempo calculadora = new CalculadoraTempo();
        calculadora.inclui(meuFilme);
        calculadora.inclui(outroFilme);
        calculadora.inclui(lost);
        System.out.println(calculadora.getTempoTotal());

        FiltroRecomendacao filtro = new FiltroRecomendacao();
        filtro.filtra(meuFilme);

        Episodio episodio = new Episodio();
        episodio.setNumero(1);
        episodio.setSerie(lost);
        episodio.setTotalVisualizacoes(300);
        filtro.filtra(episodio);

        var filmeDoPaulo = new Filme("Dogville", 2003);
        filmeDoPaulo.setDuracaoEmMinutos(200);
        filmeDoPaulo.avalia(10);

        ArrayList<Filme> listaDeFilmes = new ArrayList<>();
        listaDeFilmes.add(filmeDoPaulo);
        listaDeFilmes.add(meuFilme);
        listaDeFilmes.add(outroFilme);
        System.out.println("Tamanho da lista " + listaDeFilmes.size());
        System.out.println(listaDeFilmes);
        System.out.println("Primeiro filme " + listaDeFilmes.get(0).toString());

        Cachorro cachorro = new Cachorro();
        if( cachorro instanceof Animal) {
            Animal animal = (Animal) cachorro;
        }

        ArrayList<Produto> produto = new ArrayList<>();
        Produto produto1 = new Produto("Leite", 8.90);
        Produto produto2 = new Produto("Arroz", 15.90);
        Produto produto3 = new Produto("Farinha", 7.20);

        produto.add(produto1);
        produto.add(produto2);
        produto.add(produto3);

        double precoTotal = 0;

        for(Produto item: produto) {
            precoTotal += item.getPreco();
        }

        System.out.println("Preço médio dos produtos: " + precoTotal / produto.size());

        ArrayList<Forma> formaList = new ArrayList<>();

        Quadrado quadrado1 = new Quadrado(4);
        Quadrado quadrado2 = new Quadrado(6);

        Circulo circulo1 = new Circulo(2);
        Circulo circulo2 = new Circulo(5);

        formaList.add(quadrado1);
        formaList.add(quadrado2);
        formaList.add(circulo1);
        formaList.add(circulo2);

        for(Forma forma: formaList) {
            System.out.println("Área: " + forma.calcularArea());
        }

        ArrayList<ContaBancaria> contaBancariaList = new ArrayList<>();

        ContaBancaria conta1 = new ContaBancaria(1, 13000);
        ContaBancaria conta2 = new ContaBancaria(2, 1000);
        ContaBancaria conta3 = new ContaBancaria(3, 50000);

        contaBancariaList.add(conta1);
        contaBancariaList.add(conta2);
        contaBancariaList.add(conta3);

        ContaBancaria contaMaiorSaldo = contaBancariaList.get(0);

        for( ContaBancaria conta: contaBancariaList) {
            if(contaMaiorSaldo.getSaldo() < conta.getSaldo()) {
                contaMaiorSaldo = conta;
            }
        }

        System.out.println("Numero da conta com mais saldo: " + contaMaiorSaldo.getNumero() + " Saldo : " + contaMaiorSaldo.getSaldo());

    }
}