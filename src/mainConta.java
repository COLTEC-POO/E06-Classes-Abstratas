public class mainConta {

        public static void main(String[] args) {

            System.out.println("====Sistema Bancario====");

            // Criando um cliente para a conta
            Cliente pF = new Cliente.PessoaFisica("João", "Rua A", "12345678900", 30, 'M');

            // Inicializando uma Conta Corrente
            Conta contaC = new Conta.ContaCorrente(1, "123", 20000, "João", 1000, pF);

            // Inicializando uma Conta Poupanca
//            Conta contaP = new Conta.ContaPoupanca(1, "123", 20000, "João", 1000, pF);

            //Inicializando uma Conta Universitaria
//            Conta contaU = new Conta.ContaUniversitaria(1, "123", 20000, "João", 1000, pF);

            contaC.sacar(300);
            contaC.depositar(3000);
            contaC.imprimirExtrato();
            System.out.println();

            // Imprimindo os detalhes da Conta Corrente
            System.out.println(contaC.toString());

        }
}