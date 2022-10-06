public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        System.out.println("Sistema Bancario.");

        PessoaJuridica erick = new PessoaJuridica();
        erick.setCnpj("14479890661");

        PessoaJuridica clone = new PessoaJuridica();
        clone.setCnpj("14479870661");

        Conta contaErick = new ContaCorrente(erick);
        Conta contaClone = new ContaUniversitaria(clone);

        contaErick.setNumConta(333);
        contaClone.setNumConta(333);

        if(erick.autenticar("14479890660")){
            System.out.println("Tudo limpo");
        }else{
            System.out.println("Barrado");
        }



//        PessoaJuridica jCliente = new PessoaJuridica();
//        Conta jConta = new Conta(jCliente);



    }
}