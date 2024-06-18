public class OperacaoSaque extends Operacao {
    public OperacaoSaque(double valor) {
        super('s', valor);
        setTipo('s');
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