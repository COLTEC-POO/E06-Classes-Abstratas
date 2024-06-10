public class ContaUniversitaria extends Conta{
    private double limite;
    @Override
    public boolean setLimite(double limite) {
        if(limite > 0 && limite < 500){
            this.limite = limite;
            return true;
        }else return false;
    }
}
