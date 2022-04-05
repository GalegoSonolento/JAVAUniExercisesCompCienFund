public class Produto {
    private String nome, descricao;
    private double valor;
    private int quantEstoque;
    
    public Produto (String nome, double valor, String descricao, int quantEstoque) {
        this.nome = nome;
        this.valor = valor;
        this.descricao = descricao;
        this.quantEstoque = quantEstoque;
    }
    
    public Produto (String nome, double valor, int quantEstoque) {
        this.nome = nome;
        this.valor = valor;
        this.quantEstoque = quantEstoque;
    }
    
    public Produto (String nome) {
        this.nome = nome;
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
    
    

    
    
    
    
    
    //Visibilidade - tipo de retorno - nome(parâmetros)
    public void printInfo(){
        System.out.println("Nome: "+nome);
        System.out.println("Descrição: "+descricao);
        System.out.println("Valor: R$"+valor);
        System.out.println("Quantidade no estoque: "+quantEstoque);
    }
    
    public String toString(){
        return "Nome: "+nome+" |Descrição: "+descricao+" |Valor: R$"+valor+" |Quantidade no estoque: "+quantEstoque;
        //É só pra representar o objeto como uma String única
    }
}