public class OperacaoSaque extends Operacao {

    public OperacaoSaque(double valor) {
        super('s', valor);
    }
    @Override
    public String toString(){
        return this.getTipo()+"\n"+this.getData()+"\n"+this.getValor();
    }
}
