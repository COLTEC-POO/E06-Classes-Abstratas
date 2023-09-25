import java.util.Date;

// Classe principal de Operacao
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

    public static class OperacaoSaque extends Operacao {
        public OperacaoSaque(double valor) {
            super('s', valor);
            qtdOperacao++;
        }

        @Override
        public String getTipoOperacao() {
            return "s";
        }

        @Override
        public String getDetalhesOperacao() {
            return this.data + " s " + this.valor;
        }

        public String toString() {
            return " " + this.data + " s " + " " + this.valor;
        }
    }

    public static class OperacaoDeposito extends Operacao {
        public OperacaoDeposito(double valor) {
            super('d', valor);
            qtdOperacao++;
        }

        @Override
        public String getTipoOperacao() {
            return "d";
        }

        @Override
        public String getDetalhesOperacao() {
            return this.data + " d " + this.valor;
        }

        @Override
        public String toString() {
            return " " + this.data + " d " + " " + this.valor;
        }
    }
}

