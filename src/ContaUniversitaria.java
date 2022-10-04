public class ContaUniversitaria extends Conta{


    //Metodos
    public double setLimite(double limite) {

        if(limite <= 500 && limite >= 0)
            System.out.println("Limite alterado de " + this.getLimite() +
                    " para " + limite);
        else
            System.out.println("Não foi possivel alterar o limite");

        return this.getLimite();
    }
}
