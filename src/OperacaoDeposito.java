public class OperacaoDeposito extends Operacao{
    public OperacaoDeposito(double valor){
        super('d', valor);
    }

    public String toString() {
        String op = getTipo() + "\t" + getValor() + "\t" + getData();
        return op;
    }
}
