public class ContaCorrente extends Conta{
    public ContaCorrente(Cliente dono) {
        super(dono);
    }

    @Override
    public void setLimite(double limite) {
        if(limite < -100)
            System.out.println("Limite mínimo ultrapassado");
        else{
            this.limite = limite;
        }
    }
}
