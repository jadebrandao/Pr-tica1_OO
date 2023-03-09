import java.util.Scanner;
public class Cliente {
    public static void main(String[] args) {
        String nome;
        String cpf;
        String endereco;

        Scanner ler = new Scanner(System.in);

        System.out.println("Digite o nome desejado: ");
        nome = ler.next();

        System.out.println("Informe o cpf desejado: ");
        cpf = ler.next();

        System.out.println("Informe o endereço desejado: ");
        endereco = ler.next();

        System.out.println("Todos os dados informado! Parabéns");


    }
}
