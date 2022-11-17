/**
 * this é usado para acessar e referir ao valor presente no tipo
 **/

abstract class Conta {
  private int numero;
  private Cliente dono;
  private double saldo;
  private double limite_max;
  private double limite_min;

  public static int num_contas;
   /* Numero de operações*/
  public static int num_operacao;

  Operacao OP[];

  /**
   * Construtor da classe conta
   * -> Ao criar o construtor dessa classe,o mesmo já inicializa acessando algumas
   * das variaveis da classe
   **/
  public Conta(int numero, Cliente dono) {
    this.numero = numero;
    this.dono = dono;
    OP = new Operacao[1_000];
    this.num_operacao = 0;
    num_contas++;
  }

  // geter - serve apenas para leitura de variaveis privadas
  // seter - serve para a escrita de variaveis privadas
  public int getNumero() {
    return this.numero;
  }

  public void setNumero(int numero) {
    this.numero = numero;
  }

  public Cliente getDono() {
    return this.dono;
  }

  public void setDono(Cliente dono) {
    this.dono = dono;
  }

  public double getSaldo() {
    return this.saldo;
  }

  public void setSaldo(double saldo) {
    this.saldo = saldo;
  }

  public double getLimiteMax() {
    return this.limite_max;
  }

  public void setLimiteMax(double limiteMax) {
    this.limite_max = limiteMax;
  }

  public double getLimiteMin() {
    return this.limite_min;
  }

  public void setLimiteMin(double limiteMin) {
    this.limite_min = limiteMin;
  }
   public void sacar(double valor) {
    Operacao op = new OperacaoSaque(valor);
    if (valor <= this.saldo) {
      this.saldo -= valor;
      double novoSaldo = this.saldo - valor;
      this.saldo = novoSaldo;
    } else {
      System.out.println("ERRO AO SACAR: SALDO INSUFICIENTE \n");
    }
    this.OP[num_operacao] = op;
    num_operacao++;
 
  }

  public void depositar(double valor) {
    Operacao op = new OperacaoDeposito(valor);
    this.saldo += valor;
    this.OP[num_operacao] = op;
    num_operacao++;
  }

   public boolean equals(Object objt){
     Conta conta = (Conta) objt;
     if(this.numero == (conta.numero)){
      return true;
    }
     else{
      return false;
    }
  }
  
  public void imprimirExtrato() {
      System.out.println("#-------EXTRATO-------#");
      for (int i = 0; i < num_operacao; i++) {
        System.out.println("->" + OP[i].data + " " + OP[i].valor + " " + OP[i].tipo + " ");
      }
    }

  public String toString() {
    String dadosConta = "#-------CONTA-------# \n" +
      "->numero:" + this.numero + "\n" + "->limite maximo:" + this.limite_max + "\n" + "->limite minimo:" + this.limite_min + "\n" +"->saldo:" + this.saldo + "\n";
      return dadosConta;
  }
}