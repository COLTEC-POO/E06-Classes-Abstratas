public class ContaCorrente extends Conta{

    public void setLimite(int limite) {
        if (limite < -100) {
            System.out.println("Limite inferior ao limite minimo dessa modalidade de conta. Limite minimo = -100 reais.");
        } else {
            this.limite = limite;
        }
    }
}
