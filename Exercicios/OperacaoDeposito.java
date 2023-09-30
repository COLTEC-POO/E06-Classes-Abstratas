public class OperacaoDeposito extends Operacao{

    public OperacaoDeposito(double valor) {
        super('d', valor);
    }

    public String toString(){

        String OperacaoStr =
                "===== Operacao  =====" +"\n" +
                        "Data: " + this.getData() + "\n" +
                        "Tipo: " + this.getTipo() + "\n" +
                        "Valor: " + this.getValor() + "\n" +
                        "==========================" + "\n";

        return OperacaoStr;
    }
}

