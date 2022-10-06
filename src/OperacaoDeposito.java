public class OperacaoDeposito extends Operacao{

    public OperacaoDeposito(double valor){
        super(valor);
        this.setTipo('d');
    }

    @Override
    public String toString() {
        return "Valor: "+ this.getValor() + "Tipo: " + this.getTipo() + "Data: " + this.getData();
    }
}