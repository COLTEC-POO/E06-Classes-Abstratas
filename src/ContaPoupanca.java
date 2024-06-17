public class ContaPoupanca extends Conta{

    public ContaPoupanca(int numero, Cliente dono, double saldo, double limite) {

        super(numero, dono, saldo, limite);

        setLimite(limite);
    }

    public void setLimite(double limite) {
        if (limite < 100)
            limite = 100;
        if (limite > 1000)
            limite = 1000;

        limite = this.limite;
    }
}
