public class Cor{
    private String nome;
    private int r;
    private int g;
    private int b;
    
    public Cor(String nome, int r, int g, int b){
        this.nome = nome;
        this.r = r;
        this.g = g;
        this.b = b;
    }
    
    public String getNome(){
        return nome;
    }
    public int getR(){
        return r;
    }
    public int getG(){
        return g;
    }
    public int getB(){
        return b;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    public void setR(int r){
        this.r = r;
    }
    public void setG(int g){
        this.g = g;
    }
    public void setB(int b){
        this.b = b;
    }
    
    public String toString(){
        return nome+" "+"("+r+", "+g+", "+b+")";
    }
}