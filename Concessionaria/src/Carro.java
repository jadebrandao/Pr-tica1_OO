import java.util.Scanner;
    public class Carro {
        public static void main(String[] args) {
            String placa;
            String cor;
            double valor;

            Scanner ler = new Scanner(System.in);

            System.out.println("Digite a placa: ");
            placa= ler.next();

            System.out.println("Informe a cor: ");
            cor= ler.next();

            System.out.println("Informe o valor do carro: ");
            valor= ler.nextDouble();

            System.out.println("Carro informado! Parabéns");

        }
    }

