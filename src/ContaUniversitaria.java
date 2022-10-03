public class ContaUniversitaria extends Conta{
  int limiteMax = 500,limiteMin = 0;
public ContaUniversitaria(String nome, int numConta, String cpf, boolean tipo) {
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

