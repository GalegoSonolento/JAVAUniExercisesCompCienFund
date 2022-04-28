public class PrincipalProvaA {
    public static void main(String[] args) {
        //Criação dos três produtos:
        Produto prod1 = new Produto(Teclado.leString("Digite o nome do produto: "), Teclado.leString("Digite a marca do produto: "), garantePreco(), (Teclado.leChar("O produto é importado?(S/N) ") == 'S' ? true : false));
        Produto prod2 = new Produto(Teclado.leString("Digite o nome do produto: "), Teclado.leString("Digite a marca do produto: "), garantePreco(), (Teclado.leChar("O produto é importado?(S/N) ") == 'S' ? true : false));
        Produto prod3 = new Produto(Teclado.leString("Digite o nome do produto: "), Teclado.leString("Digite a marca do produto: "), garantePreco(), (Teclado.leChar("O produto é importado?(S/N) ") == 'S' ? true : false));
        
        /*Infelizmente eu não consegui pensar em uma forma de fazer esses if e else fora do main. 
           Me pareceu muito mais simples realizar esse request aqui. 
           Eu sei que não é o ideal, eu só não consegui otimizar mesmo.*/
        System.out.println("Informações do produto mais barato: ");
        if (prod1.getPreco() < prod2.getPreco() && prod1.getPreco() < prod3.getPreco()) prod1.imprimeInfo();
        else if (prod2.getPreco() < prod1.getPreco() && prod2.getPreco() < prod3.getPreco()) prod2.imprimeInfo();
        else if (prod3.getPreco() < prod2.getPreco() && prod3.getPreco() < prod1.getPreco()) prod3.imprimeInfo();
        
        //Criação dos três ar condicionados
        ArCondicionado ar1 = criadorDeAr();
        /*Depois de criar cada ar printei a resposta para a atualização da temperatura. 
           A grande questão é, o trecho que diz que a temperatura foi alterada nunca rodará, 
           já que eu garanti que o usuário não poderá digitar uma temperatura fora do range
           pré-designado. 
           Não sei se era bem essa a proposta mas tá feito. */
        System.out.println(ar1.ajustaTemperaturaAtual(ar1.garanteTempAtual()) ? "Não foi necessário ajustar a temperatura atual" : "Foi necessário ajustar a temperatura atual");
        ArCondicionado ar2 = criadorDeAr();
        System.out.println(ar1.ajustaTemperaturaAtual(ar1.garanteTempAtual()) ? "Não foi necessário ajustar a temperatura atual" : "Foi necessário ajustar a temperatura atual");
        ArCondicionado ar3 = criadorDeAr();
        System.out.println(ar1.ajustaTemperaturaAtual(ar1.garanteTempAtual()) ? "Não foi necessário ajustar a temperatura atual" : "Foi necessário ajustar a temperatura atual");
    }
    
    //Usei esse método dentro da classe principal mesmo, era mais simples para chamar dentro do construtor. 
    public static double garantePreco() {
        double preco = 0;
        do {
            preco = Teclado.leDouble("Digite o preço do produto: ");
        }while (preco <= 0 || preco > 10000);
        return preco;
    }   
    
    /*Criei esse criador de ar a fim de atender os pedidos de garantir algumas coisas com as temperaturas 
       Por mais que já houvesse uma segurança quanto a isso, atendi ao exercício.
       Não sei se era exatamente essa a ideia, mas está feito e funcional. */
    public static ArCondicionado criadorDeAr(){
        int tempmin = 0;
        do {
            tempmin = Teclado.leInt("Digite a temperatura mínima do ar condicionado: ");
        }while (tempmin <= 1);
        
        int tempmax = 0;
        do {
            tempmax = Teclado.leInt("Digite a temperatura máxima do ar condicionado: ");
        }while (tempmax <= 1 || tempmax <= tempmin);
        
        return new ArCondicionado(tempmin, tempmax);
    }
}
