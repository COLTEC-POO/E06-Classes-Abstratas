public class ContaUniversitaria extends Conta{
    public ContaUniversitaria(Cliente dono) {
        super(dono);
    }

    @Override
    public void setLimite(double limite) {
        if(limite > 500)
            System.out.println("Limite Máximo Ultrapassado");
        else if(limite < 0)
            System.out.println("Limite Mínimo Ultrapassado");
        else{
            this.limite = limite;
        }
    }
}
