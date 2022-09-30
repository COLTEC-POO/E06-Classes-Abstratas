public class ContaCorrente extends Conta{

    public ContaCorrente(int numConta, double limiteMin, Cliente titular) {
        super(numConta, titular);
        this.setLimite(limiteMin);
    }

    public void setLimite(double limiteMin) {
        if(limiteMin < -100){
            this.limiteMin = -100;
        }
        else if (limiteMin > 0){
            this.limiteMin = 0;
        }
        else {
            this.limiteMin = limiteMin;
        }
        this.limiteMax = Double.MAX_VALUE;
    }
}
