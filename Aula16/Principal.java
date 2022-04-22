public class Principal{
    public static void main(String[] args){
        ContaCorrente conta1 = new ContaCorrente(Teclado.leString("Digite o número da nova conta: "), Teclado.leDouble("Digite o saldo da nova conta: "));
        
        do{
            System.out.println("Operações: "+"\n"+
            "1) Efetuar saque"+"\n"+
            "2) Efetuar depósto"+"\n"+
            "3) Imprimir informações da conta"+"\n"+
            "4) Sair do menu");
            int opcao = Teclado.leInt("Digite o número da opção desejada: ");
            if (opcao == 1) conta1.efetuaSaque(Teclado.leDouble("Digite o valor do saque: R$"));
            else if (opcao == 2) conta1.efetuaDeposito(Teclado.leDouble("Digite o valor do depósito: R$"));
            else if (opcao == 3) conta1.imprimeInfo();
            else {
                System.out.println("Saindo do menu.");
                break;
            }
        }while (true);
        
        System.out.println("Cria 3 casa aí pros guri");
        
        Imovel casa1 = criaImovel();
        Imovel casa2 = criaImovel();
        Imovel casa3 = criaImovel();
        
        System.out.println("Impostos das casas: ");
        System.out.println("Impostos da casa 1: R$"+casa1.calculaImposto());
        System.out.println("Impostos da casa 2: R$"+casa2.calculaImposto());
        System.out.println("Impostos da casa 3: R$"+casa3.calculaImposto());
        
        double maiorNum = 0;
        for (int i = 0; i < 50; i++){
            double num = Teclado.leDouble("Digite um valor: ");
            if (i == 0)
                maiorNum = num;
            if (maiorNum < num) maiorNum = num;
        }
        System.out.println("O maior número digitado foi: "+maiorNum);
    }
    
    public static Imovel criaImovel(){
        double venda = 0;
        double aluguel = 0;
        while (venda <= 0)
            venda = Teclado.leDouble("Digite o valor de venda: R$");
        while (aluguel <= 0) 
            aluguel = Teclado.leDouble("Digite o valor do aluguel: R$");
        return new Imovel(Teclado.leString("Digite o endereço: "), venda, aluguel, Teclado.leChar("Digite se o imóvel é novo ou não(S/N): ") == 'S');
    }
}