import java.util.Date;
public abstract class Operacao {

    private Date data;

    private char tipo;

    private double valor;

    private static int totalOperacoes = 0;

    protected Operacao(char tipo, double valor) {
        this.tipo = tipo;
        this.valor = valor;
        data = new Date();

        Operacao.totalOperacoes++;
    }

    public String toString() {
        String str = String.format("Data: %s, Tipo: %c, Valor: %.2f", getData(), getTipo(), getValor());
        return str;
    }

    public Date getData() {
        return data;
    }

    public char getTipo() {
        return tipo;
    }

    public double getValor() {
        return valor;
    }

    public static int getTotalOperacoes() {
        return Operacao.totalOperacoes;
    }

    public void setTipo(char tipo) {
        if(tipo == 'd' || tipo == 's')
            this.tipo = tipo;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
}
