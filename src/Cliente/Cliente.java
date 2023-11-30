package Cliente;

import java.util.Date;

// Classe Cliente.Cliente que representa um cliente genérico
public abstract class Cliente {
    String endereco;
    String nome;
    Date data;

    // Construtor do Cliente.Cliente
    protected Cliente(String nome, String endereco) {
        this.nome = nome;
        this.endereco = endereco;
        this.data = new Date();
    }

    // Método abstrato de autenticação
    public abstract boolean autenticar(String chave);

    // Métodos abstratos para forçar subclasses a criar instâncias
    public abstract String getTipo();
}