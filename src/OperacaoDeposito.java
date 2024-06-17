public class OperacaoDeposito extends Operacao {

    public OperacaoDeposito(double valor) {
        super('d', valor);
    }

    public String toString() {

        String operacaoDeposito = "--- Deposito ---" +
                super.toString();

        return operacaoDeposito;
    }
}
