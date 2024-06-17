public class OperacaoSaque extends Operacao {

    public OperacaoSaque(double valor) {
        super('s', valor);
    }

    public String toString() {

        String operacaoDeposito = "--- Saque ---" +
                super.toString();

        return operacaoDeposito;
    }
}
