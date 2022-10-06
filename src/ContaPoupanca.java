public class ContaPoupanca extends Conta{
    public ContaPoupanca(Cliente dono) {
        super(dono);
    }

    @Override
    public void setLimite(double limite) {
        if(limite > 1000)
            System.out.println("Limite Máximo Ultrapassado");
        else if(limite < 100)
            System.out.println("Limite Mínimo Ultrapassado");
        else{
            this.limite = limite;
        }
    }
}
