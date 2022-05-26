public class Novo extends Livro{
    private double valorDesconto;

    public Novo(String titulo, String autor, int ano, double preco, double valorDesconto) {
        super(titulo, autor, ano, preco);
        this.valorDesconto = valorDesconto;
    }

    public double getValorDesconto() {
        return valorDesconto;
    }

    public void setValorDesconto(double valorDesconto) {
        this.valorDesconto = valorDesconto;
    }

    @Override
    public String toString() {
        return "Novo{" +
                "valorDesconto=" + valorDesconto +
                '}'+super.toString();
    }
}
