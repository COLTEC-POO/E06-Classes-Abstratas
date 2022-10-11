
public class Main {
    public static void main(String[] args) {
        boolean saoIguais;

        Conta contaEmp = new ContaCorrente(new PessoaJuridica(),100_000);
        System.out.println(contaEmp.toString());
        contaEmp.depositar(100_000);

        Conta contaUm = new ContaPoupanca(new PessoaFisica(), 850);
        System.out.println(contaUm.toString());
        Conta contaDois = new ContaUniversitaria(new PessoaFisica(), 350);
        System.out.println(contaDois.toString());

        contaEmp.tranferencia(contaUm, 12000);
        contaEmp.tranferencia(contaDois, 300);

        contaUm.sacar(5000);

        contaUm.tranferencia(contaDois,750);

        contaUm.imprimirExtratoDetalhado();
        contaDois.imprimirExtratoDetalhado();
    }
}
