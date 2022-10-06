public class OperacaoDeposito extends Operacao {

    public OperacaoDeposito(double valor) {
        super('d', valor);
    }

    public String toString(){

        return "Data: " + getData() + "\t" + "Tipo: " + getTipo() + "\t" + "Valor: " + getValor();
    }
}