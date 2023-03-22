package br.com.conta;

import javax.swing.JOptionPane;
public class Principal {
    public static void main(String[] args) {

        int numero;
        double saldo, limite,rendimento;

      int opcao = Integer.parseInt(JOptionPane.showInputDialog("Banco:\n1- Conta Corrente\n2-Conta Poupança\n3- Sair"));

      switch(opcao){
            case 1:
                numero = Integer.parseInt(JOptionPane.showInputDialog("Informe o número da conta: "));
                saldo = Double.parseDouble((JOptionPane.showInputDialog("Informe o saldo da conta:")));
                limite = Double.parseDouble((JOptionPane.showInputDialog("Informe o saldo com o Limite:")));

                ContaCorrente cc1= new ContaCorrente(numero,saldo,limite);

                JOptionPane.showInputDialog(null,"Saldo"+cc1.getSaldo()+"\nSaldo com o limite: "+cc1.consultaSaldoTotal(),"Conta corrente",JOptionPane.INFORMATION_MESSAGE);

                break;
            case 2:

                numero = Integer.parseInt(JOptionPane.showInputDialog("Informe o número da conta: "));
                saldo = Double.parseDouble((JOptionPane.showInputDialog("Informe o saldo da conta:")));
                rendimento = Double.parseDouble((JOptionPane.showInputDialog("Informe o rendimento:")));

                ContaPoupanca cc2= new ContaPoupanca(numero,saldo,rendimento);
                cc2.atualizarRendimento();

                JOptionPane.showInputDialog(null,"Saldo"+cc2.getSaldo()+"\nRendimento: "+cc2.getRendimento(),"Conta Poupança",JOptionPane.INFORMATION_MESSAGE);

                break;
            case 3:

                break;
            default:

                JOptionPane.showInputDialog(null,"Escolha invalida","Erro",JOptionPane.ERROR_MESSAGE);
        }

    }
}
