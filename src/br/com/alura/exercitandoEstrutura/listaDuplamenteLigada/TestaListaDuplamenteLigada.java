package br.com.alura.exercitandoEstrutura.listaDuplamenteLigada;


public class TestaListaDuplamenteLigada {
    public static void main(String[] args) {
        ListaDuplamenteLigada ListaDuplamenteLigada = new ListaDuplamenteLigada();


        System.out.println(ListaDuplamenteLigada);
        ListaDuplamenteLigada.adicionaNoComeco("Raide");
        System.out.println(ListaDuplamenteLigada);
        ListaDuplamenteLigada.adicionaNoComeco("Rafaela");
        System.out.println(ListaDuplamenteLigada);
        ListaDuplamenteLigada.adicionaNoComeco("Maísa");
        System.out.println(ListaDuplamenteLigada);
        ListaDuplamenteLigada.adiciona("Fulano");
        System.out.println(ListaDuplamenteLigada);
        ListaDuplamenteLigada.adiciona(1, "Ciclano");
        System.out.println(ListaDuplamenteLigada);

        String maisa = ListaDuplamenteLigada.pega(0).toString();
        System.out.println(maisa);

        int tamanho = ListaDuplamenteLigada.tamanho();
        System.out.println(tamanho);

        ListaDuplamenteLigada.removeDoComeco();
        System.out.println(ListaDuplamenteLigada);

        ListaDuplamenteLigada.remove(1);
        System.out.println("Removendo indice 1: " + ListaDuplamenteLigada);

        ListaDuplamenteLigada.removeDoFim();
        System.out.println(ListaDuplamenteLigada);

        System.out.println(ListaDuplamenteLigada.contem("Raide"));
        System.out.println(ListaDuplamenteLigada.contem("Rafaela"));
    }
}
