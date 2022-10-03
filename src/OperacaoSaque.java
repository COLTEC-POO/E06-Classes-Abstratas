public class OperacaoSaque extends Operacao {



    public String toSting(){
            String produtoSaque = "Data: "+this.data+"Tipo: "+this.tipo+"Valor: "+this.valor;
        return produtoSaque;
    }
    public void OperacaoSaque(){
        setTipo('s');
        setValor(valor);
    }

    public OperacaoSaque(char tipo, double valor) {
        super(tipo, valor);
    }
}
