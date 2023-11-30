package Operacao;

import java.util.Date;

// Classe principal de Operacao.Operacao
public abstract class Operacao {
    double valor;

    Date data;

    char tipo;

    static int qtdOperacao = 0;

    public Operacao(char tipo, double valor) {
        this.tipo = tipo;
        this.valor = valor;

        data = new Date();
    }

    public abstract String getTipoOperacao();
    public abstract String getDetalhesOperacao();

    public String toString() {
        return this.data + " " + this.tipo + " " + this.valor;
    }

    public String extrato() {
        return getTipoOperacao() + getDetalhesOperacao();
    }
}

