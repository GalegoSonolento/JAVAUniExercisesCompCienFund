public class Produto {
    private String nome;
    private double valor;
    private String descricao;
    private int quantEstoque;
    
    public Produto (String nome, double valor, String descricao, int quantEstoque) {
        this.nome = nome;
        this.valor = valor;
        this.descricao = descricao;
        this.quantEstoque = quantEstoque;
    }
    
    public String getNome () {
        return nome;
    }
    
    public double getValor () {
        return valor;
    }
    
    public String getDescricao () {
        return descricao;
    }
    
    public int getQuantEstoque () {
        return quantEstoque;
    }
    
    public void setNome (String nome) {
        this.nome = nome;
    }
    
    public void setValor (double valor) {
        this.valor = valor;
    }
    
    public void setDescricao (String descricao) {
        this.descricao = descricao;
    }
    
    public void setQuantEstoque (int quantEstoque) {
        this.quantEstoque = quantEstoque;
    }
}