public class ContaPoupanca extends Conta{
  
  public ContaPoupanca(int numero, Cliente dono) {
    super(numero,dono);
    OP = new Operacao[1_000];
    this.num_operacao = 0;
    num_contas++;

    setLimiteMin(100);
    setLimiteMax(1_000);
  }

}