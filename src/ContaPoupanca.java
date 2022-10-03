public class ContaPoupanca extends Conta{
  int limiteMax = 1000,limiteMin = 100;
public ContaPoupanca(String nome, int numConta, String cpf, boolean tipo) {
        super(nome, numConta, cpf, tipo);
    }

  public boolean setLimite(double valor){
    if(valor >= this.limiteMin && valor <= this.limiteMax){
      return true;
    }
    else{
      return false;
    }
  }
}

