public class Churros {
    private String sabor;
    private double preco;

    public String getSabor() {
        return sabor;
    }

    public void setSabor(String sabor) {
        this.sabor = sabor;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public Churros() {
    }

    public Churros(double preco) {
        this.preco = preco;
    }

    public Churros(String sabor, double preco) {
        this.sabor = sabor;
        this.preco = preco;
    }

    @Override
    public String toString(){
        return "Informações do churro: "+"\n"+
                "Sabor: "+sabor+"\n"+
                "Preoço: "+preco+"\n";
    }
}
