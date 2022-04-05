public class Principal {
    public static void main(String[] args) {
        double num = 12.45;
        char l = 'G';
        int num2 = 64;
        
        Produto prod = new Produto("batata"); /*Precisa ter uam referência pra posição de memória*/
        /* Assim eu pego a classe, uso ela como um tipo, declaro uma variável
           para que ela aponte o objeto que eu quero ler*/
        Produto prod2 = prod;
        Produto prod3 = new Produto("banana");
        prod2 = prod3;
        System.out.println("Nome do produto referenciado por prod2"+prod2.getNome());
        prod2.setNome("ameixa");
        System.out.println("Nome referenciado por prod3"+prod3.getNome());
        
        //CRIAR UM PRODUTO COM INFORMAÇÕES VINDAS PELO USUÁRIO, VIA TECLADO
        /*String nome = Teclado.leString("Digite o nome do produto: ");
        double valor = Teclado.leDouble("Digite o valor do produto: ");
        String descricao = Teclado.leString("Digite a descrição do produto: ");
        int quantEstoque = Teclado.leInt("Digite a quantidade de produtos no estoque: ");
        Produto prod4 = new Produto(nome, valor, descricao, quantEstoque);*/
        
        Produto prod5 = new Produto(Teclado.leString("Digite o nome do produto: "), 
                                    Teclado.leDouble("Digite o valor do produto: "), 
                                    Teclado.leString("Digite a descrição do produto: "), 
                                    Teclado.leInt("Digite a quantidade de produtos no estoque: "));
                                    
        prod5.printInfo();
        System.out.println(prod5);
    }
}