import java.util.Objects;

public class PessoaFisica extends Cliente {
    private String cpf;
    private int idade;
    private char sexo;

    public PessoaFisica(String nome, String endereco, String cpf, int idade, char sexo) {
        super(nome, endereco);
        this.cpf = cpf;
        this.idade = idade;
        this.sexo = sexo;
    }

    public String toString() {
        return String.format("Nome: %s\nEndereço: %s\nCPF: %s\nIdade: %d\nSexo: %c", nome, endereco, cpf, idade, sexo);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        PessoaFisica that = (PessoaFisica) obj;
        return Objects.equals(cpf, that.cpf);
    }


    @Override
    public boolean autenticar(String chave) {
        return Objects.equals(cpf, chave);
    }

}