public class ContaCorrente extends Conta{
    

    
    public ContaCorrente(Cliente cliente, Boolean tipo, Double saldo_inicial, Double limite, Integer numConta){
        try{
            validaCliente(cliente);
            validaTipo(tipo);
            validaSaldo(saldo_inicial);
            validaLimite(limite);
            validaNumConta(numConta);
            validaQtdOperacoes(0);
            qtdContas++;
        }catch (Exception e) {
            System.out.println("Dados invalidos!");
        }
    }


    public void validaLimite(Double limite){
        if (limite >= -100)
            setLimite(0.0);
    }



}
