public class ContaCorrente extends Conta{
    private double limite;
    @Override
    public boolean setLimite(double limite) {
        if(limite > -100){
            this.limite = limite;
            return true;
        }else return false;
    }
}
