public class Main {

    public static void main(String[] args){

        System.out.println("======== Sistema Bancario ========");
        System.out.println("\n");

        Cliente clientePF = new PessoaFisica("João", "Rua A", "532.136.925-22", 22, 'M');
        Cliente clientePJ = new PessoaJuridica("Empresa XYZ", "Rua B", "24.812.098/9861-51", 3, "Gerente");


        if(clientePF.autenticar("532.136.925-22")){
            System.out.println("O cliente Pessoa Fisica esta autenticado!");
        } else{
            System.out.println("O cliente Pessoa Fisica NAO esta autenticado!");
        }

        if(clientePJ.autenticar("24.812.098/9861-51")){
            System.out.println("O cliente Pessoa Juridica esta autenticado!");
        } else{
            System.out.println("O cliente Pessoa Juridica NAO esta autenticado!");
        }

        Conta ContaC = new ContaCorrente(1233, "hdte1", 100, clientePF, 200);

        Conta ContaP = new ContaPoupanca(1433, "hdte1", 1000, clientePF, 1000);

        Conta ContaU = new ContaUniversitaria(9433, "peien1", 1000, clientePJ, 1000);

        ContaC.setLimite();

        ContaP.setLimite();

        ContaU.setLimite();
    }
}
