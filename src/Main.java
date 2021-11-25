public class Main {
    public static void main (String[]args){

        //cadastro pessoas juridica

        PessoaJuridica Sorvebao=new PessoaJuridica();
        Sorvebao.setNome("Sorvebao");
        Sorvebao.setEndereco("Rua da Prata,111 - Itabirito");
        Sorvebao.setCnpj("11.101.102/0001-99");
        Sorvebao.setNumFuncionarios(50);
        Sorvebao.setSetor("Alimenticio");

        PessoaJuridica Poneiloja=new PessoaJuridica();
        Sorvebao.setNome("Poneiloja");
        Sorvebao.setEndereco("Rua da Prata,20 - Itabirito");
        Sorvebao.setCnpj("11.101.102/0001-99");
        Sorvebao.setNumFuncionarios(12);
        Sorvebao.setSetor("Alimenticio");

       /* //impressão cadastros pessoas juridicas
        System.out.println("***Dados Clientes-Pessoa Juridica:");
        Sorvebao.imprimirClientePJ(Sorvebao);*/


        //cadastro pessoas fisicas
        //Jonas
        PessoaFisica Jonas=new PessoaFisica();
        Jonas.setNome("Jonas");
        Jonas.setEndereco("Rua C,20-Horto");
        Jonas.setcpf("001.002.003-55");
        Jonas.setidade(18);
        Jonas.setGenero('m');

        //Samuel
        PessoaFisica Samuel=new PessoaFisica();
        Samuel.setNome("Samuel");
        Samuel.setEndereco("Rua D,25-Horto");
        Samuel.setcpf("001.002.003-55");
        Samuel.setidade(37);
        Samuel.setGenero('m');

        //Camila
        PessoaFisica Camila=new PessoaFisica();
        Camila.setNome("Camila");
        Camila.setEndereco("Rua E,30-Pampulha");
        Camila.setcpf("001.002.003-18");
        Camila.setidade(29);
        Camila.setGenero('f');

        /*//impressão cadastros pessoas fisicas
        System.out.println("***Dados Clientes-Pessoa Física:");
        Jonas.imprimirClientePF(Jonas);
        Samuel.imprimirClientePF(Samuel);
        Camila.imprimirClientePF(Camila);*/


        //inicialização das Contas
        Conta jonas= new Conta(Jonas,01);
        jonas.setLimite(200);
        jonas.setNumero("1");
        Conta samuel= new Conta(Samuel,02);
        samuel.setLimite(500);
        samuel.setNumero("1");
        Conta camila= new Conta(Camila,03);
        camila.setLimite(800);
        Conta sorvebao=new Conta(Sorvebao,55);
        sorvebao.setLimite(25000);

        /*//imprimindo os dados das contas
        System.out.println("***Dados Contas-Pessoa Física:");
        jonas.imprimir(jonas);
        samuel.imprimir(samuel);
        camila.imprimir(camila);
        System.out.println("***Dados Contas-Pessoa Juridica:");
        sorvebao.imprimir(sorvebao);*/

        //depositando dinheiro na conta
        jonas.depositar(800);
        samuel.depositar(1500);
        camila.depositar(2500);
        sorvebao.depositar(30000);

        //imprimindo os saldos atualizados das contas com os novos valores de deposito
        System.out.println("___Valor atualizado do saldo após depósito:___");
        System.out.println("Novo Saldo "+jonas.getDono()+":"+jonas.getSaldo());
        System.out.println("Novo Saldo "+samuel.getDono()+":"+samuel.getSaldo());
        System.out.println("Novo Saldo "+camila.getDono()+":"+camila.getSaldo());
        System.out.println("Novo Saldo "+sorvebao.getDono()+":"+sorvebao.getSaldo());

        //sacando dinheiro na conta
        jonas.sacar(500);
        samuel.sacar(100);
        camila.sacar(150);
        sorvebao.sacar(1230);


        //imprimindo os saldos atualizados das contas com os novos valores de saque
        System.out.println("___Valor atualizado do saldo após saque:___");
        System.out.println("Novo Saldo "+jonas.getDono()+":"+jonas.getSaldo());
        System.out.println("Novo Saldo "+samuel.getDono()+":"+samuel.getSaldo());
        System.out.println("Novo Saldo "+camila.getDono()+":"+camila.getSaldo());
        System.out.println("Novo Saldo "+sorvebao.getDono()+":"+sorvebao.getSaldo());

        //depositando dinheiro na conta
        jonas.depositar(50);
        samuel.depositar(35);
        camila.depositar(269);
        sorvebao.depositar(550);

        //tirando os extrantos das contas
        Operacao.extrato(jonas);
        Operacao.extrato(samuel);
        Operacao.extrato(camila);
        Operacao.extrato(sorvebao);

        //logs do sistema
        System.out.println("Total de contas:"+Conta.totalContas);
        float numOpTotal=camila.numeroOp+ samuel.numeroOp;
        System.out.println("Total de operações:"+ numOpTotal);
        float media=numOpTotal/Conta.totalContas;
        System.out.println("Média de operações:"+media);

        //testando toString
        //testando toString para pessoa fisica
        System.out.println("Resultado da chamada toString para pessoa fisica:");
        System.out.println(Jonas.toString());
        //testando toString para pessoa juridica
        System.out.println("Resultado da chamada toString para pessoa juridica:");
        System.out.println(Sorvebao.toString());
        //testando toString para pessoa Conta
        System.out.println("Resultado da chamada toString para conta de pessoa fisica:");
        System.out.println(jonas.toString());
        System.out.println("Resultado da chamada toString para conta de pessoa juridica:");
        System.out.println(sorvebao.toString());

        //testando equals
        //testando equals Pessoa Juridica -Não está funcionando
        if(Sorvebao.equals(Poneiloja)){
            System.out.println("São iguais.");
        }
        else{
            System.out.println("São diferentes!");
        }
        //testando equals Pessoa Fisica
        if(Jonas.equals(Samuel)){
            System.out.println("São iguais.");
        }
        else{
            System.out.println("São diferentes!");
        }
        //testando equals para conta
        if(jonas.equals(samuel)){
            System.out.println("São iguais.");
        }
        else{
            System.out.println("São diferentes!");
        }

    }

}
