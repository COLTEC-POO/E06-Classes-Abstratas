public class PessoaFisica extends Cliente {
  private String cpf;
  private int idade;
  private char sexo;

  public String getCpf() {
    return cpf;
  }

  public void setCpf(String cpf) {
    this.cpf = cpf;
  }

  public int getIdade() {
    return idade;
  }

  public void setIdade(int idade) {
    this.idade = idade;
  }

  public char getSexo() {
    return sexo;
  }

  public void setSexo(char sexo) {
    this.sexo = sexo;
  }

  /* Construtor da classe*/
  public PessoaFisica(String nome,String endereco, String cpf,int idade,char sexo){
    super(nome,endereco);
    setCpf(cpf);
    setIdade(idade);
    setSexo(sexo);
  }

  public boolean equals(Object objt){
    if(objt instanceof PessoaFisica){
      PessoaFisica cliente = (PessoaFisica)objt;
      return true;
    }
    else{
      return false;
    }
  }

   public boolean autenticar(String chave){
    if(chave.equals(this.cpf)){
      return true;
    }else{
      return false;
    }
  }

 public String toString(){
    String dados = "\n#-------CLIENTE PF-------#\n" + "->nome:" + super.getNome() + "\n" +  "->endereço:" + super.getEndereco()  + "\n" + "->Cpf:" + getCpf()  + "\n" + "->idade:" + getIdade()  + "\n" + "->sexo :" +  + getSexo() + "\n" ;
    return dados;
  }
}