import java.util.Scanner;
public class NotaAluno {

    public NotaAluno() {
    }

    public static void main(String[] args) {

        String nome, matricula;

        int av1, av2, avAE , nota, media, mediaAluno,notaFinal;

        String curso;

        int periodo;

        Scanner ler= new Scanner(System.in);


        System.out.println("Insira o número de matricula: ");
        matricula = ler.next();
        System.out.println("Insira o valor da nota av1: ");
        av1 = ler.nextInt();
        System.out.println("Insira o valor da nota av2: ");
        av2 = ler.nextInt();

        nota = (av1 + av2);

        System.out.println("Sua nota é: " + nota);

        if (nota >= 60) {
            System.out.println("Aluno aprovado! Parabéns :)");

        } else if (nota<60) {


            System.out.println("Aluno em recuperação. Realizer a avAE . :(");

            System.out.println("Insira a nota avAE");
            avAE= ler.nextInt();

            notaFinal=(av1+av2+avAE)/2;

            System.out.println("Sua nota final é: "+ notaFinal);

            if (notaFinal >= 60) {
                System.out.println("Aluno aprovado! Parabéns :)");

            } else if (notaFinal<60) {
                System.out.println("Você esta reprovado : (");
            }




        }

    }

}
