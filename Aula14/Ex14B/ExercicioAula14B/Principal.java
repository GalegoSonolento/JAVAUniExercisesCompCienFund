public class Principal{
    public static void main(String [] args){
        Prateleira prateleira1 = new Prateleira(new Produto("Amaciante", Teclado.leDouble("Digite o valor do produto 1: "), new Data(10, 4, 2014)), 
                                                new Produto("Creme Dental", Teclado.leDouble("Digite o valor do produto 2: "), new Data(5, 5, 2015)),
                                                new Produto("Leite Condensado", Teclado.leDouble("Digite o valor do produto 3: "), new Data(4, 12, 2012)));
                                                
        Prateleira prateleira2 = new Prateleira();
        prateleira2.setProduto1(new Produto("Cortina", 167.98, new Data(13, 10, 2025)));

        Mercado mercado1 = new Mercado(prateleira1, prateleira2);
        
        
        if (mercado1.getPrateleira1().getProduto1().verificaProdutoVencido(new Data(10, 10, 2014)))
            System.out.println("Produto 1 vencido");
        if (mercado1.getPrateleira1().getProduto2().verificaProdutoVencido(new Data(10, 10, 2014)))
            System.out.println(prateleira1.getProduto2().toString());
        if (mercado1.getPrateleira1().getProduto3().verificaProdutoVencido(new Data(10, 10, 2014)))
            System.out.println(prateleira1.getProduto3().toString());
        if (mercado1.getPrateleira2().getProduto1().verificaProdutoVencido(new Data(10, 10, 2014)))
            System.out.println(prateleira2.getProduto1().toString());
        if (mercado1.getPrateleira2().getProduto2() != null){
            if (mercado1.getPrateleira2().getProduto2().verificaProdutoVencido (new Data(10, 10, 2014)))
                            System.out.println(prateleira2.getProduto2().toString());
        }
        if (mercado1.getPrateleira2().getProduto3() != null){
            if (mercado1.getPrateleira2().getProduto3().verificaProdutoVencido (new Data(10, 10, 2014)))
                            System.out.println(prateleira2.getProduto3().toString());
        }
            
        Produto maisCaroPrat1 = prateleira1.produtoMaisCaro();
        Produto maisCaroPrat2 = prateleira2.produtoMaisCaro();
        if (maisCaroPrat1.getPreco() > maisCaroPrat2.getPreco())
            System.out.println("O produto mais caro do mercado é: "+"\n"+maisCaroPrat1);
        else if (maisCaroPrat1.getPreco() < maisCaroPrat2.getPreco())
            System.out.println("O produto mais cado do mercado é: "+"\n"+maisCaroPrat2);
            
        System.out.println("-=-=-=-=-=-=-=-=-");
        System.out.println("O média de preço dos produtos do mercado é: "+mercado1.mediaValorProdutos());
    }
}