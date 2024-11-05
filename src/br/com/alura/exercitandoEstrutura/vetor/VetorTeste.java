package br.com.alura.exercitandoEstrutura.vetor;

public class VetorTeste {

    public static void main(String[] args) {
        Aluno aluno1 = new Aluno("Raide");
        Aluno aluno2 = new Aluno("Rafaela");
        Aluno aluno3 = new Aluno("Maísa");
        Aluno aluno4 = new Aluno("Fulano");

        Vetor vetorAluno = new Vetor();
        vetorAluno.adiciona(aluno1);
        vetorAluno.adiciona(aluno2);
        vetorAluno.adiciona(aluno3);

        System.out.println(vetorAluno);

        vetorAluno.adiciona(1, aluno4);

        System.out.println(vetorAluno);

        System.out.println("Pegando primeiro aluno de nome: " + vetorAluno.pega(0));

        System.out.println("Removendo aluno Fulano.");

        vetorAluno.remove(1);

        System.out.println("Vetor de alunos agora sem o fulano: " + vetorAluno);

        System.out.println("Contem aluno Rafaela? " + vetorAluno.contem(aluno2));

        System.out.println("Contem aluno Fulano? " + vetorAluno.contem(aluno4));

        System.out.println("Quantidade de alunos: " + vetorAluno.tamanho());

    }

}
