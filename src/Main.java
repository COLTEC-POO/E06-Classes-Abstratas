public class Main {
    public static void main(String[] args) {

        // inicialização Cliente

        PessoaFisica jessica = new PessoaFisica();
        jessica.setNome("Jéssica Alves");
        jessica.setCpf("123.455.789-11");
        jessica.setEndereco("Rua Laranjeiras");
        jessica.setIdade(21);
        jessica.setSexo('f');

        PessoaFisica mateus = new PessoaFisica();
        mateus.setCpf("121.555.999-10");

        PessoaJuridica empresa = new PessoaJuridica();
        empresa.setNome("Banco X");
        empresa.setCnpj("10.510.789/0001-12");
        empresa.setEndereco("Avenida Raja Gabaglia, 822");
        empresa.setSetor("Financeiro");
        empresa.setNumFuncionarios(52);

        PessoaJuridica empresa2 = new PessoaJuridica();
        empresa2.setCnpj("10.510.789/0001-12");

        // inicialização Conta

        Conta minhaConta = new ContaPoupanca();
        Conta suaConta = new ContaUniversitaria();
        Conta suaEmpresa = new ContaCorrente();

        minhaConta.setDono(jessica);
        minhaConta.setNumConta(1013);
        minhaConta.setSaldo(1500);

        suaConta.setNumConta(1111);

        suaEmpresa.setDono(empresa);
        suaEmpresa.setNumConta(1212);
        suaEmpresa.setSaldo(7000);

        // inicialização Operações

        Operacao deposito = new OperacaoDeposito(8000);
        Operacao saque = new OperacaoSaque(200);

        // impressão dados da conta

        System.out.println("--------------------- Dados Pessoa Física ----------------------");

        System.out.println(jessica.toString());

        System.out.println("--------------------- Dados Conta ----------------------");

        minhaConta.setLimite(80);
        System.out.println(minhaConta.toString());

        System.out.println("--------------------- Dados Pessoa Jurídica ----------------------");

        System.out.println(empresa.toString());

        System.out.println("--------------------- Dados Conta ----------------------");

        suaEmpresa.setLimite(3000);
        System.out.println(suaEmpresa.toString());

        // operações

        System.out.println("--------------------- Operações ----------------------");

        System.out.println(deposito.toString());
        System.out.println(saque.toString());
        System.out.print("\n");

        // verifica se os CPF's são iguais

        System.out.println("--------------------- Comparações ----------------------");

        // compara número da conta

        if (minhaConta.equals(suaConta)) {
            System.out.println("O número da conta é IGUAL");
        } else {
            System.out.println("O número da conta é DIFERENTE");
        }

        // compara cpf

        if (jessica.equals(mateus)) {
            System.out.println("Os CPF's são IGUAIS");
        } else {
            System.out.println("Os CPF's são DIFERENTES");
        }

        // compara cnpj

        if (empresa.equals(empresa2)) {
            System.out.println("Os CNPJ's são IGUAIS");
        } else {
            System.out.println("Os CNPJ's são DIFERENTES");
        }

        System.out.println("--------------------- Autenticação ----------------------");

        if(mateus.autenticar("121.555.999-10")){
            System.out.println("- Cliente (" + mateus.cpf + ") autenticado!");
        }
        else{
            System.out.println("- Cliente não autenticado");
        }

        if(empresa2.autenticar("10.510.789/0001-10")){
            System.out.println("- Cliente (" + empresa2.cnpj + ") autenticado!");
        }
        else{
            System.out.println("- Cliente não autenticado");
        }
    }
}