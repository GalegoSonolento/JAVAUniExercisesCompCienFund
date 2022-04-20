public class Principal{
    public static void main(String[] args){
        Exercicios ex1 = new Exercicios();
        System.out.println("");
        while (true){
            System.out.println("Escolha entre as opções: "+"\n"+
            "1. conta até 300"+"\n"+
            "2. imprime pares"+"\n"+
            "3. verifica primo");
            
            int opcao = Teclado.leInt("Digite a opção desejada: ");
            if (opcao == 1) ex1.Contador(Teclado.leInt("Digite o número para iniciar a contagem: "));
            else if (opcao == 2) ex1.imprimePares(Teclado.leInt("Digite até qual número deseja ver os pares: "));
            else if (opcao == 3){
                boolean teste = ex1.verificaPrimo(Teclado.leInt("Digite um número para varificar se ele é primo ou não: "));
                if (teste == true) System.out.println("Seu número é primo");
                else if (teste == false) System.out.println("Seu número não é primo");
            }
            else{ 
                System.out.println("Opção inválida. Tente novamente mais tarde.");
                break;
            }
        }
    }
}