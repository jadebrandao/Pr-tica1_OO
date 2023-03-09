import java.util.Scanner;
public class EmpregodaFaculdade {

    public static void main(String[] args) {

        String nomeProfessor;
        double salario;
        int horasAula;
        int horasTrabalhadas;

        Scanner ler = new Scanner(System.in);

        System.out.println("Informe o nome do Professor: ");
        nomeProfessor= ler.next();

        System.out.println("Informe a o salário: ");
        salario = ler.nextDouble();

        System.out.println("Informa quantidade de horas trabalhadas: ");
        horasAula = ler.nextInt();

        salario = (horasAula*40)+salario;

        System.out.println("O salario final do professor é: " + salario);


    }
}
