package br.com.conta;

public class Conta {

    private int numero;
    private double saldo;

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public Conta(int numero, double saldo) {
        this.numero = numero;
        this.saldo = saldo;
    }
    public void sacar(double valor){

        if(valor<=saldo)

        saldo = saldo - valor;

    }

    public  void dopositar (double valor){
        saldo=saldo +valor;
    }
}
