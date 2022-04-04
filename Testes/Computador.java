public class Computador {
    private String marca;
    private double velocidade;
    private int anoDeFabricacao;
    private boolean novo;
    
    public Computador (String marca, double velocidade, int anoDeFabricacao, 
    boolean novo) {
        this.marca = marca;
        this. velocidade = velocidade;
        this.anoDeFabricacao = anoDeFabricacao;
        this.novo = novo;
    }
    
    public String getMarca () {
        return marca;
    }
    
    public double getVelocidade () {
        return velocidade;
    }
    
    public int anoDeFabricacao () {
        return anoDeFabricacao;
    }
    
    public boolean getNovo () {
        return novo;
    }
    
    public void setMarca (String marca) {
        this.marca = marca;
    }
    
    public void setVelocidade (double velocidade) {
        this.velocidade = velocidade;
    }
    
    public void setAnoDeFabricacao (int anoDeFabricacao) {
        this.anoDeFabricacao = anoDeFabricacao;
    }
    
    public void setNovo(boolean novo) {
        this.novo = novo;
    }
}