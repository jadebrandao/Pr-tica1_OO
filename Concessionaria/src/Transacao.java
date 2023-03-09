import java.util.Scanner;
public class Transacao {
    public static void main(String[] args) {
        Double valor;
        String formaDePagamento;
        String cpf;
        String nome;

        Scanner ler = new Scanner(System.in);

        System.out.println("Digite o valor do veiculo: ");
        valor = ler.nextDouble();

        System.out.println("Digite a forma de pagamento: ");
        formaDePagamento = ler.next();

        System.out.println("Informe o cpf desejado:  ");
        cpf = ler.next();

        System.out.println("Informe o nome completo do cliente:  ");
        nome = ler.next();

        System.out.println("Todos os dados informado! Parabéns");
    }
}
