import java.util.Scanner;

public class Conta {

    // Variaveis privadas basicas da conta
    final int numero;
    final String senha;
    private double saldo;
    final String dono;
    private double limite;

    // inicializando cliente;
    private final Cliente cliente;

    // Inicializando o array de operacoes
    final Operacao[] operacoes;

    // Numeros de Operacoes;
    private int numOp;

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
    };


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

    // Metodo para verificar o valor depositado e salvar a operacao
    public void depositar(double valor) {

        if (valor >= 0) {
            this.saldo += valor;

            this.operacoes[numOp] = new Operacao.OperacaoDeposito(valor);
            numOp++;
        } else {
            System.out.println("Depositado R$: " + valor);
        }
    }

    // Metodo para verificar o valor a ser sacado e salvar a operacao
    public void sacar(double valor) {
        if (valor >= 0 && valor <= this.saldo) {
            this.saldo -= valor;
            this.operacoes[numOp] = new Operacao.OperacaoSaque(valor);
            numOp++;
        } else {
            System.out.println("Dinheiro indisponivel, valor disponivel: R$: " + valor);
        }
    }

    // Confere se o numero esta sendo usado
    public static boolean numeroUsado(Conta[] contas, int numero) {
        for(Conta conta : contas) {
            if(conta != null && conta.numero == numero) {
                System.out.println("Numero ja em uso, selecione outro!");
                return true;
            }
        }
        return false;
    }

    // Confere se o cpf esta sendo usado
    // Confere se o cpf está sendo usado
    public static boolean cpfUsado(Conta[] contas, String cpf) {
        for (Conta conta : contas) {
            if (conta != null && conta.getCliente() instanceof Cliente.PessoaFisica) {
                Cliente.PessoaFisica pessoaFisica = (Cliente.PessoaFisica) conta.getCliente();
                if (pessoaFisica.equals(new Cliente.PessoaFisica("", "", cpf, 0, ' '))) {
                    System.out.println("CPF ja em uso, selecione outro!");
                    return true;
                }
            }
        }
        return false;
    }

    // Confere se o cnpj está sendo usado
    public static boolean cnpjUsado(Conta[] contas, String cnpj) {
        for (Conta conta : contas) {
            if (conta != null && conta.getCliente() instanceof Cliente.PessoaJuridica) {
                Cliente.PessoaJuridica pessoaJuridica = (Cliente.PessoaJuridica) conta.getCliente();
                if (pessoaJuridica.equals(new Cliente.PessoaJuridica("", "", "", cnpj, 0))) {
                    System.out.println("CNPJ ja em uso, selecione outro!");
                    return true;
                }
            }
        }
        return false;
    }

    // Metodo para registrar contas no array
    public static Conta[] regContas() {
        Scanner linhaDeComando = new Scanner(System.in);

        int tamanho = 2;

        Conta[] contas = new Conta[tamanho];

        for (int i = 0; i < contas.length; i++) {
            System.out.println("Digite o nome do dono:");
            String dono = linhaDeComando.nextLine();

            System.out.println("Digite o endereco do dono:");
            String endereco = linhaDeComando.nextLine();

            int numero;
            boolean numeroEmUso;
//            Salvando numero somente se nao estiver presente no array
//            Do-While para garantir que vai se repetir ate o usuario escrever outro numero
            do {
                System.out.println("Digite o numero da conta:");
                numero = linhaDeComando.nextInt();

                numeroEmUso = numeroUsado(contas, numero);
            } while (numeroEmUso);
            linhaDeComando.nextLine();

            System.out.println("Digite a senha da conta:");
            String senha = linhaDeComando.nextLine();

            System.out.println("Digite o saldo da conta:");
            double saldo = linhaDeComando.nextDouble();
            linhaDeComando.nextLine();
            // Limpando o Buffer :/

            System.out.println("Digite o limite da conta:");
            double limite = linhaDeComando.nextDouble();
            linhaDeComando.nextLine();
            // Limpando o Buffer :/

            System.out.println("Digite 'P' para Pessoa Fisica ou 'J' para Pessoa Juridica:");
            char tipoCliente = linhaDeComando.nextLine().charAt(0);

            Cliente cliente;

            if(tipoCliente == 'P' || tipoCliente == 'p') {

                String cpf;
                boolean cpfEmUso;
//                Salvando cpf somente se nao estiver presente no array
//                Do-While para garantir que vai se repetir ate o usuario escrever outro cpf
                do {
                    System.out.println("Digite o CPF:");
                    cpf = linhaDeComando.nextLine();

                    cpfEmUso = cpfUsado(contas, cpf);

                } while (cpfEmUso);

                System.out.println("Digite a idade:");
                int idade = linhaDeComando.nextInt();
                linhaDeComando.nextLine();

                System.out.println("Digite o Sexo: ");
                char sexo = linhaDeComando.nextLine().charAt(0);

                cliente = new Cliente.PessoaFisica(dono, endereco, cpf, idade, sexo);
            } else if (tipoCliente == 'J' || tipoCliente == 'j') {
                String cnpj;
                boolean cnpjEmUso;

//                Salvando cpf somente se nao estiver presente no array
//                Do-While para garantir que vai se repetir ate o usuario escrever outro cpf
                do {
                    System.out.println("Digite o CNPJ:");
                    cnpj = linhaDeComando.nextLine();

                    cnpjEmUso = cnpjUsado(contas, cnpj);
                } while (cnpjEmUso);

                System.out.println("Digite a idade:");
                int numFunc = linhaDeComando.nextInt();
                linhaDeComando.nextLine();

                System.out.println("Digite o setor:");
                String setor = linhaDeComando.nextLine();

                cliente = new Cliente.PessoaJuridica(dono, endereco, setor, cnpj, numFunc);
            } else {
                System.out.println("Tipo de cliente inválido. A conta não será criada.");
                continue;
            }

            contas[i] = new Conta(numero, senha, saldo, dono, limite, cliente);
        }

        for (Conta contaAtual : contas) {System.out.print("Cadastradas: " + contaAtual.getDono());
            System.out.println();}
        return contas;
    }

    public void imprimirExtrato() {
        System.out.println("Extrato da conta de " + this.getDono());
        for (int i = 0; i < numOp; i++) {
            System.out.println(operacoes[i].toString());
        }
    }

    // Imprimir dados de conta
    public String toString() {
        return "Número da Conta: " + this.numero + "\nSaldo: R$" + this.saldo + "\nDono: " + getDono() + "\nLimite: R$" + this.limite + "\n \n=== Dados como cliente === \n" + getCliente().toString();
    }

    public String getDono() { return dono; }

    public Cliente getCliente() {
        return cliente;
    }
}