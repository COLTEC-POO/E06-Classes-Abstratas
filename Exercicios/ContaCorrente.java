public class ContaCorrente extends Conta {

    public ContaCorrente(int numero, String senha, double saldo, Cliente dono, double limite) {

        super(numero, senha, saldo, dono, limite);

    }

    public void setLimite(){

        if(this.limite >= -100){
            this.limite = limite;
            System.out.println("Limite da Conta Corrente permitido!");

        } else {
            System.out.println("Erro, limite da Conta Corrente inferior ao permitido.");
        }
    }
}
