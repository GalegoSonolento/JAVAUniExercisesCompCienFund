public class Imovel{
    private String adress;
    private double vaVenda, aluguel;
    private boolean novo;
    
    public Imovel(String adress, double vaVenda, double aluguel, boolean novo){
        this.adress = adress;
        this.vaVenda = vaVenda;
        this.aluguel = aluguel;
        this.novo = novo;
    }
    
    public String getAdress(){
        return adress;
    }
    public double getVaVenda(){
        return vaVenda;
    }
    public double getAluguel(){
        return aluguel;
    }
    public boolean isNovo(){
        return novo;
    }
    
    public void setAdress(String Adress){
        this.adress = adress;
    }
    public void setVaVenda(double vaVenda){
        this.vaVenda = vaVenda;
    }
    public void setAluguel(double aluguel){
        this.aluguel = aluguel;
    }
    public void setNovo(boolean novo){
        this.novo = novo;
    }
    
    public void impInfo(){
        System.out.println("==========="+"\n"+"AS INFORMAÇÕES DO IMÓVEL SÃO: "+
        "\n"+"Endereço: "+adress+"\n"+
        "Valor de venda: "+vaVenda+"\n"+
        "Valor do aluguel: "+aluguel+"\n"+
        "Novo? "+novo);
    }
    
    public double calculaImposto(){
        return novo ? vaVenda*0.15 : aluguel*0.10;
    }
}
















