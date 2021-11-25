public class ContaCorrente extends Conta{

    public void setLimite(int limite){
        if (limite < -100) {
            throw new IllegalArgumentException("O limite não pode ser menor que -100!");
        }
    }

}
