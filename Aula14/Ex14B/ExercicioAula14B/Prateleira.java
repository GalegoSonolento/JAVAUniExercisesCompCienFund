public class Prateleira{
    private Produto produto1;
    private Produto produto2;
    private Produto produto3;
    
    public Prateleira(Produto produto1, Produto produto2, Produto produto3){
        this.produto1 = produto1;
        this.produto2 = produto2;
        this.produto3 = produto3;
    }
    
    public Prateleira(){
        
    }
    
    public Produto getProduto1(){
        return produto1;
    }
    
    public Produto getProduto2(){
        return produto2;
    }
    
    public Produto getProduto3(){
        return produto3;
    }
    
    public void setProduto1(Produto produto1){
        this.produto1 = produto1;
    }
    
    public void setProduto2(Produto produto2){
        this.produto2 = produto2;
    }
    
    public void setProduto3(Produto produto3){
        this.produto3 = produto3;
    }
    
    public Produto produtoMaisCaro(){
        Produto retorno = produto1;
        if (produto1 != null && produto2 == null && produto3 == null)
            retorno = produto1;
        else if (produto1 != null && produto2 != null && produto3 == null){
            if (produto1.getPreco() > produto2.getPreco())
                retorno = produto1;
            else if (produto1.getPreco() < produto2.getPreco())
                retorno = produto2;
            }
        else if (produto1 != null && produto2 != null && produto3 != null){
            if (produto1.getPreco() > produto2.getPreco() && produto1.getPreco() > produto3.getPreco())
                retorno = produto1;
            else if (produto2.getPreco() > produto1.getPreco() && produto2.getPreco() > produto3.getPreco())
                retorno = produto2;
            else if (produto2.getPreco() > produto1.getPreco() && produto2.getPreco() > produto3.getPreco())
                retorno = produto3;
        }
        return retorno;
    }
    
    public String toString(){
        return "-=-=-=-=-=-=-=-="+"\n"+"Dados produto 1: "+produto1.toString()+
        "\n"+"Dados produto 2: "+produto2.toString()+"\n"+"Dados produto 3: "+
        produto3.toString();
    }
}