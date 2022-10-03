public class OperacaoDeposito extends Operacao {


    public String toSting(){
        String produtoDeposito = "Data: "+this.data+"Tipo: "+this.tipo+"Valor: "+this.valor;
        return produtoDeposito;
    }
    public void OperacaoDeposito(){
        setTipo('d');
        setValor(valor);
    }

    public OperacaoDeposito(char tipo, double valor) {
        super(tipo, valor);
    }
}
