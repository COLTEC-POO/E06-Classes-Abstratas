import java.util.Date;
public abstract class Operacao {
    private double valor;
    private Date data;
    private char tipo;
    private static int totalOperacoes = 0;

    public Operacao(char tipo, double valor) {
        this.tipo = tipo;
        this.valor = valor;
        data = new Date();
        totalOperacoes++;
    }

    public double getValor() {
        return valor;
    }


    public Date getData() {
        return data;
    }


    public static double getTotalOperacoes() {
        return Operacao.totalOperacoes;
    }

    public char getTipo(){
        return this.tipo;
    }


    public String toString(){
        return this.getData() + "  \t " + this.getTipo() + "  \t " + this.getValor();
    }

}
