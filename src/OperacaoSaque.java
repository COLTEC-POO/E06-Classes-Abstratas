public class OperacaoSaque extends Operacao{

    public OperacaoSaque(){

    }

    public OperacaoSaque(Double valor){
        setTipo('s');
        setValor(valor);
        SalvaOperacao();
    }




}