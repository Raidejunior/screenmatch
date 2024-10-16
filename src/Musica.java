public class Musica {
    String titulo;
    String artista;
    int anoLancamento;
    double avaliacao;
    int numAvaliacao;

    void exibeFichaTecnica() {
        System.out.println(String.format("""
                Ficha técnica:
                Título: %s,
                Artista: %s,
                Ano de lançamento: %d,
                Avaliação: %.1f,
                Número de avaliações: %d.
                """, titulo, artista, anoLancamento, avaliacao, numAvaliacao ));
    }

    public class Principal {
        public static void main(String[] args) {

            Musica musica = new Musica();
            musica.titulo = "Till I Collapse";
            musica.artista = "Eminem";
            musica.avaliacao = 8.9;
            musica.numAvaliacao = 1;
            musica.anoLancamento = 2003;
            musica.exibeFichaTecnica();
        }
    }
}
