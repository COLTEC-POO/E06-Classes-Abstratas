public class Main {
    public static void main(String[] args) {
        PessoaFisica joao = new PessoaFisica(
                "João",
                "Av. Antonio Carlos. 6627",
                "324.310.130-14",
                36,
                'm'
        );

        PessoaJuridica empresa = new PessoaJuridica(
                "Empresa XYZ",
                "Av. Antonio Carlos. 6627",
                "12.345.678/0001-95",
                100,
                "Tecnologia"
        );


        if (joao != null && empresa != null) {
            Conta conta1 = new Conta(1234, joao, 0, 1500);
            Conta conta2 = new Conta(12121, empresa, 10000, 1500);

            System.out.println("Detalhes da conta do João:");
            System.out.println(conta1.toString());
            System.out.println();

            System.out.println("Detalhes da conta da Empresa XYZ:");
            System.out.println(conta2.toString());
            System.out.println();

            conta1.depositar(3000);
            conta1.depositar(2000);
            conta1.depositar(2000);
            conta1.depositar(2000);
            conta1.depositar(2000);
            conta1.depositar(2000);
            conta1.depositar(2000);
            conta1.sacar(500);

            conta2.transferir(conta1, 666);
            conta2.depositar(234);

            System.out.println("Extrato da conta do João:");
            conta1.imprimirExtrato();
            System.out.println();

            System.out.println("Extrato da conta da Empresa XYZ:");
            conta2.imprimirExtrato();
            System.out.println();
            System.out.println();

            int media = Operacao.getTotalOperacoes() / Conta.getTotalContas();
            System.out.println("Média de operações por conta aberta: " + media);
        }
    }
}
