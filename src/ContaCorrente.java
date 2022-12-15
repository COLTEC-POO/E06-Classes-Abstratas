public class ContaCorrente extends Conta {

    public ContaCorrente(int numConta, double saldo, double minLimite, Cliente nome) {
        super(numConta, nome);
        this.setLimite(minLimite);
    }

    public boolean setLimite(double minLimite){
        if(minLimite>= -100){
            return true;
        }else{
            return false;
        }
    }
    /*public void limiteConta(double limite){
        if(limite >= -100)
            System.out.println("Seu limite era: " + this.getlimite() +
                    " e agora é: " + limite);
        else
            System.out.println("Limite não alterado");

        this.setlimite(limite);
    }*/

}
