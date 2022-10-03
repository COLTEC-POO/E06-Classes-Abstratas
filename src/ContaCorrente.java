public class ContaCorrente extends Conta{
  int limitemin = - 100;
  public ContaCorrente(String nome, int numConta, String cpf, boolean tipo) {
        super(nome, numConta, cpf, tipo);
    }
  public boolean setLimite(double valor){
    if(valor >= this.limitemin){
      return true;
    }
    else{
      return false;
    }
  }
}