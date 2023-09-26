
public abstract class Conta {
    private Cliente cliente;
    private String Dono;
    private String numeroConta;
    private double saldoConta;
    protected double limiteConta;
    private Operacao[] operacoes;
    public static int totalContas = 0;
    private int qtdOperacoes;


    public Conta(String dono, String numeroConta, double saldoConta, double limiteConta) {
        this.Dono = dono;
        this.numeroConta = numeroConta;
        this.saldoConta = saldoConta;
        this.limiteConta = limiteConta;

        this.operacoes = new Operacao[1000];
        this.qtdOperacoes=0;
        totalContas++;
    }

    // Getters e Setters
    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public String getDono() {
        return Dono;
    }

    public void setDono(String dono) {
        Dono = dono;
    }

    public String getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(String numeroConta) {
        this.numeroConta = numeroConta;
    }

    public double getSaldoConta() {
        return saldoConta;
    }

    public void setSaldoConta(double saldoConta) {
        this.saldoConta = saldoConta;
    }

    public double getLimiteConta() {
        return limiteConta;
    }



    public Operacao[] getOperacoes() {
        return operacoes;
    }

    public void setOperacoes(Operacao[] operacoes) {
        this.operacoes = operacoes;
    }

    public static int getTotalContas() {
        return totalContas;
    }

    public static void setTotalContas(int totalContas) {
        Conta.totalContas = totalContas;
    }

    public int getQtdOperacoes() {
        return qtdOperacoes;
    }

    public void setQtdOperacoes(int qtdOperacoes) {
        this.qtdOperacoes = qtdOperacoes;
    }

    // Método para Depositar
    public boolean depositar(double valor) {
        if (valor >= 0) {
            this.saldoConta += valor;
            this.operacoes[qtdOperacoes++] = new OperacaoDeposito(valor);
            return true;
        }
        else {
            return false;
        }
    }

    // Método para Sacar
    public boolean sacar(double valor) {
        if (valor>=0 && valor <= this.saldoConta && valor <= this.limiteConta) {
            this.saldoConta -= valor;
            this.operacoes[qtdOperacoes++] = new OperacaoSaque(valor);
            return true;
        }
        else {
            return false;
        }
    }

    public String toString(){
        String imprimir =
                "Dono da conta: " + this.getDono() +
                "\nNumero da Conta: " + this.getNumeroConta() +
                        "\nSaldo atual: " + this.getSaldoConta() +
                        "\nLimite: " + this.getLimiteConta() ;

        return imprimir;
    }


    public boolean equals(Object outroNumConta) {
        if(outroNumConta instanceof Conta) {
            Conta outraConta = (Conta) outroNumConta;
            return this.getNumeroConta().equals(outraConta.getNumeroConta());
        } else {
            return false;
        }
    }

    public abstract void setLimite (double limiteMax, double limiteMin);


}