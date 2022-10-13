public class Main {
    public static void main(String[] args){

        boolean comparaConta;

        Conta contacoltec = new Conta(new PessoaJuridica());
        contacoltec.depositar(100000);
        contacoltec.sacar(5000);
        System.out.println(contacoltec.toString());

        Conta minhaConta = new Conta(new PessoaFisica());
        minhaConta.depositar(1000);
        minhaConta.sacar(500);
        System.out.println(minhaConta.toString());


        comparaConta = minhaConta.equals(contacoltec);
        if(comparaConta){
            System.out.println("As contas são iguais");
        }else{
            System.out.println("As contas são diferentes");
        }

    }
}
n