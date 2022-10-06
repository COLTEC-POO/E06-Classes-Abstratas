public class ContaCorrente extends Conta{

    public void setLimite(double limite) {
        if (limite < -100){
            System.out.println("** O limite mínimo para Conta Corrente é R$-100,00 **");
        }
        else{
            this.limite = limite;
        }
    }
}