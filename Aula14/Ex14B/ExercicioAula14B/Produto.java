public class Produto{
    private String nome = "none";
    private double preco = 0;
    private Data validade;
    
    public Produto(String nome, double preco, Data validade){
        this.nome = nome;
        this.preco = preco;
        this.validade = validade;
    }
    
    public String toString(){
        return "-=-=-=-=-=-=-"+
                "\n"+"Nome: "+nome+"\n"+"Preço: "+preco+"\n"+"Data: "+validade+"\n"+
                "-=-=-=-=-=-=-";
    }
    
    public String getNome(){
        return nome;
    }
    
    public double getPreco(){
        return preco;
    }
    
    public Data getValidade(){
        return validade;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public void setPreco(double preco){
        this.preco = preco;
    }
    
    public void setValidade(Data validade){
        this.validade = validade;
    }
    
    public boolean verificaProdutoVencido(Data data){
        if (data == null) return false;
        if (validade.getAno() < data.getAno()) return true;
        if (validade.getAno() > data.getAno()) return false;
        if (validade.getAno() == data.getAno() && validade.getMes() < data.getDia()) return true;
        if (validade.getAno() == data.getAno() && validade.getMes() == data.getMes() && validade.getDia() < data.getDia()) return true;
        return false;
    }
}