public class OperacaoSaque extends Operacao {

    public OperacaoSaque(double valor) {
        super('s', valor);
    }

    public String toString(){

        return "Data: " + getData() + "\t" + "Tipo: " + getTipo() + "\t" + "Valor: " + getValor();
    }
}