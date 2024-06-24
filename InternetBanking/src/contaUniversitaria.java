public class contaUniversitaria extends Conta{

        public contaUniversitaria (int Num, Cliente Dono, double Saldo, double limite, double saldo){

            super(Num, Dono, Saldo, limite);
            setLimite(limite, saldo);

        }

        void setLimite(double limite, double saldo) {

            if ((saldo > 500) && (limite < 0)){

                saldo = 0;
                limite = 500;

                saldo = super.getSaldo();
                limite = super.getLimite() ;

            }

        }



    }
