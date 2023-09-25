public class Main {
    public static void main(String[] args) {

        System.out.println("====Sistema Bancario====");
        Conta[] contas = Conta.regContas();

        for (Conta conta : contas) {

            System.out.println(conta.toString());

            System.out.println("==== Extrato da Conta ====");
            conta.depositar(2000);
            conta.sacar(200);

            conta.imprimirExtrato();

            if(contas.PessoaFisica.autenticar("laalalala")){
                System.out.println("Damn son, where'd you find this!");
            }

            // Espaco entre as contas
            System.out.println();

        }
    }
}