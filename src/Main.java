public class Main {
    public static void main(String[] args) {


        Cliente clienteJose, clienteMaria;

        clienteJose = new PessoaFisica("Jose", "Rua das Gracas",
                "123.456.789-12", 23, 'm');
        clienteMaria = new PessoaJuridica("Coltec", "Rua dos Anjos",
                "55555555.55555555/55555", 55, "educacao");

        if(clienteJose.autentica("123.456.789-12")){
            System.out.println("Acesso permitido");
            System.out.println(clienteJose);
        } else {
            System.out.println("Acesso negado");
        }

        System.out.println("");

        if(clienteMaria.autentica("55555555.55555555/55555")){
            System.out.println("Acesso permitido");
            System.out.println(clienteMaria);
        } else {
            System.out.println("Acesso negado");
        }

        Conta c1 = new ContaCorrente();
        Conta c2 = new ContaPoupanca();
        Conta c3 = new ContaUniversitaria();

        System.out.println("");
        c1.setLimite(100);
        System.out.println("");
        c2.setLimite(1000);
        System.out.println("");
        c3.setLimite(459);

    }
}