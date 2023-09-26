public abstract class ContaCorrente extends Conta {

    public ContaCorrente(String dono, String numeroConta, double saldoConta, double limiteConta) {
        super(dono, numeroConta, saldoConta, limiteConta);
    }

    public void setLimite(double limiteConta) {
        if(limiteConta < -100){
            System.out.println("Erro! Limite mínimo: R$-100,00");
        }
        else{
            this.limiteConta = limiteConta;
        }
    }

}
