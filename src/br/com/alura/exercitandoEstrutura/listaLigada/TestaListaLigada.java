package br.com.alura.exercitandoEstrutura.listaLigada;

public class TestaListaLigada {
    public static void main(String[] args) {
        ListaLigada listaLigada = new ListaLigada();


        System.out.println(listaLigada);
        listaLigada.adicionaNoComeco("Raide");
        System.out.println(listaLigada);
        listaLigada.adicionaNoComeco("Rafaela");
        System.out.println(listaLigada);
        listaLigada.adicionaNoComeco("Maísa");
        System.out.println(listaLigada);
        listaLigada.adiciona("Fulano");
        System.out.println(listaLigada);
        listaLigada.adiciona(1, "Ciclano");
        System.out.println(listaLigada);

        String maisa = listaLigada.pega(0).toString();
        System.out.println(maisa);

        int tamanho = listaLigada.tamanho();
        System.out.println(tamanho);

        listaLigada.removeDoComeco();
        System.out.println(listaLigada);

        listaLigada.remove(1);
        System.out.println(listaLigada);

    }
}
