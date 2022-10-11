public class ContaCorrente extends Conta {
    public ContaCorrente(Cliente tipo, double limite){
        super(tipo);
        definirLimite(limite);
    }

   public void definirLimite(double valor){
        double limite = valor;

        if(valor < -100) limite = -100.0;

        this.setLimite(limite);
   }
}
