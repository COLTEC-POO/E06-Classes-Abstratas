import java.util.Date;

public abstract class Cliente {
    protected String endereco;
    protected String nome;
    protected Date data;

    public Cliente(String nome, String endereco) {
        this.nome = nome;
        this.endereco = endereco;
        this.data = new Date();
    }

    public void imprimir() {
        System.out.println("Cliente inválido");
    }

    public abstract boolean autenticar(String chave);
}