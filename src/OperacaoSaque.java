public class OperacaoSaque extends Operacao {

    public OperacaoSaque(){
        
    }


    public OperacaoSaque(Double valor){
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
