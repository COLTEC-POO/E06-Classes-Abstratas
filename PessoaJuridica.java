import java.util.Objects;

public class PessoaJuridica extends Cliente {
    private String cnpj;
    private int numFuncionarios;
    private String setor;

    public PessoaJuridica(String nome, String endereco, String cnpj, int numFuncionarios, String setor) {
        super(nome, endereco);
        this.cnpj = cnpj;
        this.numFuncionarios = numFuncionarios;
        this.setor = setor;
    }

    @Override
    public String toString() {
        return String.format("Nome: %s\nEndereço: %s\nCNPJ: %s\nNúmero de Funcionários: %d\nSetor: %s", nome, endereco, cnpj, numFuncionarios, setor);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        PessoaJuridica that = (PessoaJuridica) obj;
        return Objects.equals(cnpj, that.cnpj);
    }


    @Override
    public boolean autenticar(String chave) {
        return Objects.equals(cnpj, chave);
    }
}
