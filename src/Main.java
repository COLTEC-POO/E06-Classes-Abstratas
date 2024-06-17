import java.util.Date;

public class Main {
    public static void main(String[] args) {

        Cliente joao = new PessoaFisica("João", "Av. Antonio Carlos, 6627",
                new Date(), "111.111.111-11", 36, 'm');

        ContaUniversitaria ContaJ = new ContaUniversitaria(150, joao, 1000, 1000);

        System.out.println(ContaJ.getLimite());

        Cliente pedro = new PessoaFisica("João", "Av. Antonio Carlos, 6627",
                new Date(), "111.111.111-11", 36, 'm');


        System.out.println(pedro.autentificar("111.110.111-11"));

    }
}
