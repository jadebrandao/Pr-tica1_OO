import java.util.Scanner;
public class NotaAluno {

    String nome, matricula;

    double av1, av2, avAE, nota, media;

    String curso;

    int periodo;

    Scanner ler = new Scanner(System.in);

    NotaAluno(String nome, String matricula, double av1, double av2, double avAE, double nota, String curso, int periodo) {
        this.nome = nome;
        this.matricula = matricula;
        this.av1 = av1;
        this.av2 = av2;
        this.avAE = avAE;
        this.nota = nota;
        this.curso = curso;
        this.periodo = periodo;

        System.out.println("Insira o valor da nota av1: ");
        av1 = ler.nextDouble();
        System.out.println("Insira o valor da nota an2: ");
        av2 = ler.nextDouble();

        media = (av1 + av2) / 2;

        System.out.println("Sua media é: " + media);


        if (media >= 60) {
            System.out.println("Aluno aprovado! Parabéns :)");

        } else {
            System.out.println("Aluno em recuperação . :(");


        }

        System.out.println("Reprovado");
        media = ler.nextDouble();

        media = (media + avAE) / 2;

        if (media >= 60) {
            System.out.println("Aluno aprovado! Parabéns :)");
        } else {
            System.out.println("Aluno Reprovado. :(");

        }
    }
}

