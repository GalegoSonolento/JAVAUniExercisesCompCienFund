public class Mercado{
    private Prateleira prateleira1;
    private Prateleira prateleira2;
    
    public Mercado(Prateleira prateleira1, Prateleira prateleira2){
        this.prateleira1 = prateleira1;
        this.prateleira2 = prateleira2;
    }
    
    public Prateleira getPrateleira1(){
        return prateleira1;
    }
    
    public Prateleira getPrateleira2(){
        return prateleira2;
    }
    
    public void setPrateleira1(Prateleira prateleira1){
        this.prateleira1 = prateleira1;
    }
    public void setPrateleira2(Prateleira prateleira2){
        this.prateleira2 = prateleira2;
    }
    
    public double mediaValorProdutos(){
        double media1 = 0;
        double media2 = 0;
        double mediaFinal;
        if (prateleira1.getProduto1() != null && prateleira1.getProduto2() == null && prateleira1.getProduto3() != null)
            media1 = prateleira1.getProduto1().getPreco();
        else if (prateleira1.getProduto1() != null && prateleira1.getProduto2() != null && prateleira1.getProduto3() == null)
            media1 = (prateleira1.getProduto1().getPreco()+prateleira1.getProduto2().getPreco())/2;
        else if (prateleira1.getProduto1() != null && prateleira1.getProduto2() != null && prateleira1.getProduto3() != null)
            media1 = (prateleira1.getProduto1().getPreco()+prateleira1.getProduto2().getPreco()+prateleira1.getProduto1().getPreco())/3;
        
        if (prateleira2.getProduto1() != null && prateleira2.getProduto2() == null && prateleira2.getProduto3() != null)
            media2 = prateleira2.getProduto1().getPreco();
        else if (prateleira2.getProduto1() != null && prateleira2.getProduto2() != null && prateleira2.getProduto3() == null)
            media2 = (prateleira2.getProduto1().getPreco()+prateleira2.getProduto2().getPreco())/2;
        else if (prateleira2.getProduto1() != null && prateleira2.getProduto2() != null && prateleira2.getProduto3() != null)
            media2 = (prateleira2.getProduto1().getPreco()+prateleira2.getProduto2().getPreco()+prateleira2.getProduto3().getPreco())/3;
        
        mediaFinal = (media1 + media2)/2;
        return mediaFinal;
    }
}