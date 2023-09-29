public abstract class Conta {

    // Variaveis privadas basicas da conta
    final int numero;
    final String senha;
    private double saldo;
    final String dono;
    public double limite;

    // inicializando cliente;
    public final Cliente cliente;

    // Inicializando o array de operacoes
    final Operacao[] operacoes;

    // Numeros de Operacoes;
    private static int numOp;

    // Comparando Contas
    public boolean equals(Object outro) {
        if (outro instanceof Conta) {
            Conta outraConta = (Conta) outro;

            System.out.println("As contas sao iguais");

            return this.numero == outraConta.numero;

        } else {
            System.out.println("As contas nao sao iguais");
            return false;
        }
    }

    // Construtor da Conta
    public Conta(int numero, String senha, double saldo, String dono, double limite, Cliente cliente) {
        this.numero = numero;
        this.senha = senha;
        this.saldo = saldo;
        this.dono = dono;

        this.cliente = cliente;

        this.limite = limite;

        this.operacoes = new Operacao[1000];

        this.numOp = 0;
    }

    // Metodo abstrato para forçar subClasses a implementar
    public abstract void depositar(double valor);

    // Metodo abstrato para forçar subClasses a implementar
    public abstract void sacar(double valor);

    // Metodo abstrato para forçar subClasses a implementar
    public abstract void imprimirExtrato();

    public abstract double setLimite(double valor);

    public double getSaldo() {
        return this.saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    // Imprimir dados de conta
    public String toString() {
        return "Número da Conta: " + this.numero + "\nSaldo: R$" + getSaldo() + "\nDono: " + this.dono + "\nLimite: R$" + this.limite + "\n \n=== Dados como cliente === \n" + this.cliente.toString();
    }

    public static class ContaCorrente extends Conta {

        public ContaCorrente(int numero, String senha, double saldo, String dono, double limite, Cliente cliente) {
            super(numero, senha, saldo, dono, limite, cliente);
            setLimite(limite);
        }

        @Override
        public void sacar(double valor) {
            double saldoAtual = getSaldo();

            if (valor >= 0 && valor <= saldoAtual) {
                this.setSaldo(saldoAtual - valor);

                this.operacoes[numOp] = new Operacao.OperacaoSaque(valor);
                numOp++;
            } else {
                System.out.println("Dinheiro indisponivel, valor disponivel: R$: " + saldoAtual);
            }
        }

        @Override
        public void depositar(double valor) {
            double saldoAtual = getSaldo();

            if (valor >= 0) {
                this.setSaldo(saldoAtual + valor);

                this.operacoes[numOp] = new Operacao.OperacaoSaque(valor);
                numOp++;
            }
        }

        @Override
        public void imprimirExtrato() {
            System.out.println("Extrato da conta de " + this.dono);
            for (int i = 0; i < numOp; i++) {
                System.out.println(operacoes[i].toString());
            }
        }

        @Override
        public double setLimite(double valor) {
            if (valor >= -100) {
                return this.limite = valor;
            } else {
                System.out.println("Limite mínimo de -100 reais");
            }
            return 0;
        }
    }

    public static class ContaPoupanca extends Conta {

        public ContaPoupanca(int numero, String senha, double saldo, String dono, double limite, Cliente cliente) {
            super(numero, senha, saldo, dono, limite, cliente);
            setLimite(limite);
        }

        @Override
        public void sacar(double valor) {
            double saldoAtual = getSaldo();

            if (valor >= 0 && valor <= saldoAtual) {
                this.setSaldo(saldoAtual - valor);

                this.operacoes[numOp] = new Operacao.OperacaoSaque(valor);
                numOp++;
            } else {
                System.out.println("Dinheiro indisponivel, valor disponivel: R$: " + saldoAtual);
            }
        }

        @Override
        public void depositar(double valor) {
            double saldoAtual = getSaldo();

            if (valor >= 0) {
                this.setSaldo(saldoAtual + valor);

                this.operacoes[numOp] = new Operacao.OperacaoSaque(valor);
                numOp++;
            }
        }

        @Override
        public void imprimirExtrato() {
            System.out.println("Extrato da conta de " + this.dono);
            for (int i = 0; i < numOp; i++) {
                System.out.println(operacoes[i].toString());
            }
        }

        @Override
        public double setLimite(double valor) {
//            Limite máximo de 1000 reais, e limite mínimo de 100 reais.
            if (valor >= 100 && valor <= 1000) {
                return this.limite = valor;
            } else {
                System.out.println("Limite mínimo de 100 reais e máximo de 1000");
            }
            return 0;
        }
    }

    public static class ContaUniversitaria extends Conta {

        public ContaUniversitaria(int numero, String senha, double saldo, String dono, double limite, Cliente cliente) {
            super(numero, senha, saldo, dono, limite, cliente);
            setLimite(limite);

        }

        @Override
        public void sacar(double valor) {
            double saldoAtual = getSaldo();

            if (valor >= 0 && valor <= saldoAtual) {
                this.setSaldo(saldoAtual - valor);

                this.operacoes[numOp] = new Operacao.OperacaoSaque(valor);
                numOp++;
            } else {
                System.out.println("Dinheiro indisponivel, valor disponivel: R$: " + saldoAtual);
            }
        }

        @Override
        public void depositar(double valor) {
            double saldoAtual = getSaldo();

            if (valor >= 0) {
                this.setSaldo(saldoAtual + valor);

                this.operacoes[numOp] = new Operacao.OperacaoSaque(valor);
                numOp++;
            }
        }

        @Override
        public void imprimirExtrato() {
            System.out.println("Extrato da conta de " + this.dono);
            for (int i = 0; i < numOp; i++) {
                System.out.println(operacoes[i].toString());
            }
        }

        @Override
        public double setLimite(double valor) {
//            Limite máximo de 1000 reais, e limite mínimo de 100 reais.
            if (valor >= 0 && valor <= 500) {
                return this.limite = valor;

            } else {
                System.out.println("Limite máximo de 1000 reais e mínimo de 100 reais");
            }
            return 0;
        }
    }
}



