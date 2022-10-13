public class OperacaoDeposito extends Operacao{

    public OperacaoDeposito(){

    }
    
    public OperacaoDeposito (Double valor){
        settipo('s');
        setvalor(valor);

    }

    public String toString() {
        String dadosOperacao = "Data da Operação: " + this.data + "\n" +
                            "Tipo de Operação: " + this.tipo + "\n" +
                            "Valor: " + this.valor;
                             
            return dadosOperacao;
        }
}
