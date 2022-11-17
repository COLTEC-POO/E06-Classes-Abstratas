class Main {
  public static void main(String[] args) {
    PessoaFisica cliente1;
    cliente1 = new PessoaFisica("Joao Victor", "Rua Bobo,numero 0", "12345678911", 19, 'H');

    ContaUniversitaria conta1;
    conta1 = new ContaUniversitaria(1, cliente1);

    conta1.setSaldo(500);
    conta1.sacar(500);
    conta1.depositar(250);

    System.out.println(conta1.toString());
    System.out.println(cliente1.toString());

    conta1.imprimirExtrato();
    /** ------------------- **/

    PessoaFisica cliente3;
    cliente3 = new PessoaFisica("Rafael", "Rua Bobo,numero 0", "999999999999", 19, 'H');

    ContaUniversitaria conta3;
    conta3 = new ContaUniversitaria(1, cliente3);

    PessoaJuridica cliente2;
    cliente2 = new PessoaJuridica("Tecidos S&A", "Rua babaloo, numero 876", "123456789012", 145, "Manufatura");

    ContaCorrente conta2;
    conta2 = new ContaCorrente(2, cliente2);

    conta2.setSaldo(3_300);

    System.out.println(cliente2.toString());
    System.out.println(conta2.toString());

    conta2.sacar(225);
    conta2.sacar(250);
    conta2.depositar(50);
    conta2.depositar(100);

    System.out.println(conta2.toString());

    conta2.imprimirExtrato();

    if(conta1.equals(conta3)) {
      System.out.println("CONTA JÁ REGISTRADA");
    } else {
      System.out.println(cliente3.toString());
      System.out.println(conta3.toString());
      conta3.setSaldo(500);
      conta3.sacar(100);
      conta3.depositar(250);

      System.out.println(conta3.toString());
      conta3.imprimirExtrato();
      /** ------------------- **/
    }
     
  }
}