public class OperationDeposit extends Operation {
    public OperationDeposit(float amount){
        super('d', amount);
    }

    public String toString(){
        String dopStr;

        dopStr = "Data : " + getDate() + "Tipo : " + getType() + "Valor : " + getAmount();

        return dopStr;
    }

}