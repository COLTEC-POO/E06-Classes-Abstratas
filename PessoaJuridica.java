public class PessoaJuridica extends Cliente {
  private String cnpj;
  private int num_funcionarios;
  private String setor;

/*getters e setters da classe*/  
  public String getCnpj() {
    return cnpj;
  }

  public void setCnpj(String cnpj) {
    this.cnpj = cnpj;
  }

  public int getNum_funcionarios() {
    return num_funcionarios;
  }

  public void setNum_funcionarios(int num_funcionarios) {
    this.num_funcionarios = num_funcionarios;
  }

  public String getSetor() {
    return setor;
  }

  public void setSetor(String setor) {
    this.setor = setor;
  }
 /* Construtor da classe*/
  public PessoaJuridica(String nome,String endereco, String cnpj,int num_funcionarios, String setor){
    super(nome,endereco);
    setCnpj(cnpj);
    setNum_funcionarios(num_funcionarios);
    setSetor(setor);
  }

  public boolean equals(Object objt){
    if(objt instanceof PessoaJuridica){
      PessoaJuridica conta = (PessoaJuridica) objt;
      return true;
    }
    else{
      return false;
    }
  }

  public boolean autenticar(String chave){
    if(chave.equals(this.cnpj)){
      return true;
    }else{
      return false;
    }
  }

  public String toString(){
   String dadosPJ = "\n#-------CLIENTE PJ-------# \n" + "->nome:" + super.getNome() + "\n" + "->endereço:" + super.getEndereco() + "\n" + "->Cnpj:" + getCnpj() + "\n" + "->numero de funcionarios:" + getNum_funcionarios() + "\n" + "->setor:" +  getSetor() + "\n" ;
   return dadosPJ;
  }
}