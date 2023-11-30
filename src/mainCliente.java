import Cliente.PessoaFisica;
import Cliente.PessoaJuridica;


public class mainCliente {
    public static void main(String[] args) {

        System.out.println("====Sistema Bancario====");

        PessoaFisica pF = new Cliente.PessoaFisica("João", "Rua A", "12345678900", 30, 'M');

        PessoaJuridica pJ = new Cliente.PessoaJuridica("JMontadon", "Avenida A", "Ensino e Tecnologia", "12345678911", 1);

        System.out.println(pF);
        System.out.println(pJ);

        // Inicializando chaves para comparacao
        String cpfX = "12345678900";
        String cnpjX = "12345678911";

        // Comparando chaves
        if(pF.autenticar(cpfX) && pJ.autenticar(cnpjX)) {
            System.out.println("Tudo de acordo, prosseguindo com o app! 🚀🚀 ");
        } else {
            System.out.println("Quem é você?? 😡 Sai do meu app man");
        }
    }
}