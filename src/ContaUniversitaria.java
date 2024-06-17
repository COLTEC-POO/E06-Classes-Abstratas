public class ContaUniversitaria extends Conta {

    public ContaUniversitaria(int numero, Cliente dono, double saldo, double limite) {

        super(numero, dono, saldo, limite);

        setLimite(limite);
    }

    public void setLimite(double limite) {

        if (limite < 0)
            limite = 0;
        if (limite > 500)
            limite = 500;

        this.limite = limite;
    }
}
