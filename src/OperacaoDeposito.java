public class OperacaoDeposito extends Operacao{
    
    public OperacaoDeposito(){

    }

    public OperacaoDeposito(Double valor){
        setTipo('d');
        setValor(valor);
        SalvaOperacao();
    }




}
