import java.util.Date;

public class Main {
    public static void main(String[] args) {

        Cliente joao = new PessoaFisica("João", "Av. Antonio Carlos, 6627",
                                        new Date(), "111.111.111-11", 36, 'm');
        Cliente lojinha = new PessoaJuridica("Loja R$1,99", "Av. Afonso Pena, 3000",
                                        new Date(), "000.00000.0000/0001", 25, "Comércio");


        Conta conta1 = new ContaCorrente(1234, joao, 0, -990);
        // conta1.depositar(100);
        // Conta conta2 = new Conta(12345, lojinha, 10000, 1500);
        System.out.println(conta1.getLimite());

        // System.out.println(conta1.equals(conta2));
    }
}