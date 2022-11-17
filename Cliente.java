import java.util.Date;

abstract class Cliente {
  private String nome;
  private Date data;
  private String endereco;

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public Date getData() {
    return data;
  }

  public void setData(Date data) {
    this.data = data;
  }

  public String getEndereco() {
    return endereco;
  }

  public void setEndereco(String endereco) {
    this.endereco = endereco;
  }
/* construtor da classe */
  public Cliente(String nome,String endereco){
    setNome(nome);
    setEndereco(endereco);
    this.data = new Date();
  }

  void imprimirDados() {
    System.out.println("\n#-------CLIENTE-------#");
    System.out.println("\n-> CLIENTE INVALIDO");
  }

  public abstract boolean autenticar(String chave);
}