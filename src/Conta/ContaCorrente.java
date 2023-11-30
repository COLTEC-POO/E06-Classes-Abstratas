package Conta;

import Cliente.Cliente;
import Operacao.OperacaoDeposito;
import Operacao.OperacaoSaque;

public class ContaCorrente extends Conta {

    public ContaCorrente(int numero, String senha, double saldo, String dono, double limite, Cliente cliente) {
        super(numero, senha, saldo, dono, limite, cliente);
        setLimite(limite);
    }

    @Override
    public void sacar(double valor) {
        double saldoAtual = getSaldo();

        if (valor >= 0 && valor <= saldoAtual) {
            this.setSaldo(saldoAtual - valor);

            this.operacoes[numOp] = new OperacaoSaque(valor);
            numOp++;
        } else {
            System.out.println("Dinheiro indisponivel, valor disponivel: R$: " + saldoAtual);
        }
    }

    @Override
    public void depositar(double valor) {
        double saldoAtual = getSaldo();

        if (valor >= 0) {
            this.setSaldo(saldoAtual + valor);

            this.operacoes[numOp] = new OperacaoDeposito(valor);
            numOp++;
        }
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("Extrato da conta de " + this.dono);
        for (int i = 0; i < numOp; i++) {
            System.out.println(operacoes[i].toString());
        }
    }

    @Override
    public double setLimite(double valor) {
        if (valor >= -100) {
            return this.limite = valor;
        } else {
            System.out.println("Limite mínimo de -100 reais");
        }
        return 0;
    }
}