public class Main {

    public static void main(String[] args) {
        System.out.println("Bem vindo ao sistema Bancário\n");

        Cliente cliente1 = new PessoaFisica("Eduardo", "Belo Horizonte",20, "12345679-01", 'M');
        Cliente cliente2 = new PessoaJuridica("Coltec", "Av Antônio Carlos", "123465789-00", 30, "Educação");
        Conta contaTeste = new ContaCorrente(1202, -100, cliente1);
        Conta contaTeste2 = new ContaPoupanca(1204, 800, cliente2);

        contaTeste.depositar(1200);
        contaTeste.sacar(1300);
        contaTeste.imprimirSaldo();

        contaTeste2.depositar(800);
        contaTeste2.sacar(500);
        contaTeste2.imprimirSaldo();
    }
}