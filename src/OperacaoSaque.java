import java.util.Date;

public class OperacaoSaque extends Operacao{
    public OperacaoSaque(double valor){
        super('s', valor);
    }

    public String toString(){
        String retorno = "DATA: " + this.getData() +
                " TIPO: SAQUE" +
                " VALOR: " + this.getValor();

        return retorno;
    }
}
