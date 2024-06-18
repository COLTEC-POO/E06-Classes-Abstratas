import java.util.Date;
public class OperacaoDeposito extends Operacao {
    public OperacaoDeposito(double valor) {
        super('d', valor);
        setTipo('d');
        setValor(valor);
    }

    public String toString() {
        String str = String.format(
                "---------------------------------------------------------------------------\n" +
                        "Data: %s\n" +
                        "Tipo: %c\n" +
                        "Valor: %.2f\n" +
                        "---------------------------------------------------------------------------",
                getData(), getTipo(), getValor()
        );
        return str;
    }
}