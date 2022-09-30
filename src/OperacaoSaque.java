public class OperacaoSaque extends Operacao{

    public OperacaoSaque(double valor) {
        super('s', valor);
    }

    public String toString(){
        String operacaoSStr = "Tipo.: " + this.getTipo() + "\nValor: " + this.getValor() + "\nData.: " + this.getData();

        return operacaoSStr;
    }
}
