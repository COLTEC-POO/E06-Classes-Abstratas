public class ContaPoupanca extends Conta{
    private double limite;
    @Override
    public boolean setLimite(double limite) {
        if(limite < 1000 && limite < 100){
            this.limite = limite;
            return true;
        }else return false;
    }
}
