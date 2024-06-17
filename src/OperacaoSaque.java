public class OperacaoSaque extends Operacao{
    public OperacaoSaque (double valor){
        super ('s', valor);
    }
    public String toString(){
        String op = getTipo() + "\t" + getValor() + "\t" + getData();
        return op;
    }
}