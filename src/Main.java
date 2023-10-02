
public class Main {

    public static void main (String[] args) {

    Cliente vicenteF = new PessoaFisica("Rua Física", "Vicente do Carmo", "777.777.777-69", 25, 'M');
        
    Cliente vicenteJ = new PessoaJuridica("Rua Jurídica", "Empresa do Vicente", "88.888.888/0001-88", 3, "Entretenimento");

    // Testes do método auth()

    vicenteF.auth("777.777.777-69");
    vicenteJ.auth("777.777.777-69"); // Teste para caso alguém tente autenticar uma conta jurídica com um CPF
    vicenteJ.auth("88.888.888/0001-88");


    // Testes da abstração da classe Conta


    // Tenta criar uma conta universitária dentro dos parâmatros de limite

    try { 
    Conta vicenteUni = new ContaUniversitaria(77777, vicenteF, 100, 499);
    System.out.println(vicenteUni); 
    } catch (IllegalArgumentException e){
        System.out.println("Erro: " + e.getMessage());
    }

    // Tenta criar uma conta universitária fora dos parâmatros de limite

    try { 
    Conta vicenteUniLim = new ContaUniversitaria(77777, vicenteF, 100, 501);
    System.out.println(vicenteUniLim); 
    } catch (IllegalArgumentException e){
        System.out.println("Erro: " + e.getMessage());
    }

    // Tenta criar uma conta corrente dentro dos parâmatros de limite
    
    try {
    Conta vicenteCor = new ContaCorrente(88888, vicenteF, 100, 100);
    System.out.println(vicenteCor); 
    } catch (IllegalArgumentException e){
        System.out.println("Erro: " + e.getMessage());
    }

    // Tenta criar uma conta corrente fora dos parâmatros de limite

    try { 
    Conta vicenteCorLim = new ContaCorrente(8888, vicenteF, 100, -500);
    System.out.println(vicenteCorLim); 
    } catch (IllegalArgumentException e){
        System.out.println("Erro: " + e.getMessage());
    }

    // Tenta criar uma conta poupança dentro dos parâmatros de limite 

    try {
    Conta vicentePou = new ContaPoupanca(99999, vicenteF, 100, 999);
    System.out.println(vicentePou); 
    } catch (IllegalArgumentException e){
        System.out.println("Erro: " + e.getMessage());
    }

    // Tenta criar uma conta poupança fora dos parâmatros de limite

    try { 
    Conta vicentePouLim = new ContaPoupanca(99999, vicenteF, 100, -50);
    System.out.println(vicentePouLim); 
    } catch (IllegalArgumentException e){
        System.out.println("Erro: " + e.getMessage());
    }

    System.out.println("Número de contas criadas: " +  Conta.totalContas); // Verifica se as contas inválidas não foram contabilizadas no total
  }
}