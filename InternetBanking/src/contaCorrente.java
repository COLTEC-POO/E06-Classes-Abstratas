public class contaCorrente extends Conta{

    public contaCorrente(int Num, Cliente Dono, double saldo, double limite, double MinSaldo){

        super(Num, Dono, saldo, limite);
        setLimite(limite, saldo);

    }

    void setLimite(double limite, double saldo) {

        if (saldo < -100){

            saldo = -100;

            saldo = super.getSaldo();
            limite = super.getLimite();

        }

    }

}