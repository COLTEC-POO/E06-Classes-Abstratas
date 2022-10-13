public class ContaCorrente extends Conta {

    public ContaCorrente(Cliente tipo, double limite) {
            super(tipo);
            limiteConta(limite);
    }
    public void limiteConta(double limite){
        if(limite >= -100)
        System.out.println("Seu limite era: " + this.getlimite() +
                " e agora é: " + limite);
        else
            System.out.println("Limite não alterado");

         this.setlimite(limite);
    }
    
    
}
