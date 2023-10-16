package Conta;

import Cliente.Cliente;
import Operacao.Operacao;

public abstract class Conta {

    // Variaveis privadas basicas da conta
    final int numero;
    final String senha;
    private double saldo;
    final String dono;
    public double limite;

    // inicializando cliente;
    public final Cliente cliente;

    // Inicializando o array de operacoes
    final Operacao[] operacoes;

    // Numeros de Operacoes;
    public int numOp;

    // Comparando Contas
    public boolean equals(Object outro) {
        if (outro instanceof Conta) {
            Conta outraConta = (Conta) outro;

            System.out.println("As contas sao iguais");

            return this.numero == outraConta.numero;

        } else {
            System.out.println("As contas nao sao iguais");
            return false;
        }
    }

    // Construtor da Conta.Conta
    public Conta(int numero, String senha, double saldo, String dono, double limite, Cliente cliente) {
        this.numero = numero;
        this.senha = senha;
        this.saldo = saldo;
        this.dono = dono;

        this.cliente = cliente;

        this.limite = limite;

        this.operacoes = new Operacao[1000];

        this.numOp = 0;
    }

    // Metodo abstrato para forçar subClasses a implementar
    public abstract void depositar(double valor);

    // Metodo abstrato para forçar subClasses a implementar
    public abstract void sacar(double valor);

    // Metodo abstrato para forçar subClasses a implementar
    public abstract void imprimirExtrato();

    public abstract double setLimite(double valor);

    public double getSaldo() {
        return this.saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    // Imprimir dados de conta
    public String toString() {
        return "Número da Conta.Conta: " + this.numero + "\nSaldo: R$" + getSaldo() + "\nDono: " + this.dono + "\nLimite: R$" + this.limite + "\n \n=== Dados como cliente === \n" + this.cliente.toString();
    }
}



