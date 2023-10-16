import Cliente.PessoaFisica;
import Conta.ContaCorrente;

public class mainConta {

        public static void main(String[] args) {

            System.out.println("====Sistema Bancario====");

            // Criando um cliente para a conta
            PessoaFisica pF = new PessoaFisica("João", "Rua A", "12345678900", 30, 'M');

            // Inicializando uma Conta.Conta Corrente
            ContaCorrente contaC = new ContaCorrente(1, "123", 20000, "João", 1000, pF);

            // Inicializando uma Conta.Conta Poupanca
//            Conta.Conta contaP = new Conta.Conta.ContaPoupanca(1, "123", 20000, "João", 1000, pF);

            //Inicializando uma Conta.Conta Universitaria
//            Conta.Conta contaU = new Conta.Conta.ContaUniversitaria(1, "123", 20000, "João", 1000, pF);

            contaC.sacar(300);
            contaC.depositar(3000);
            contaC.imprimirExtrato();
            System.out.println();

            // Imprimindo os detalhes da Conta.Conta Corrente
            System.out.println(contaC.toString());

        }
}