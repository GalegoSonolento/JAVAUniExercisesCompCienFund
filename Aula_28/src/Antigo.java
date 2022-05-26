public class Antigo extends Livro{
    private int numeroEdicao;

    public Antigo(String titulo, String autor, int ano, double preco, int numeroEdicao) {
        super(titulo, autor, ano, preco);
        this.numeroEdicao = numeroEdicao;
    }

    public int getNumeroEdicao() {
        return numeroEdicao;
    }

    public void setNumeroEdicao(int numeroEdicao) {
        this.numeroEdicao = numeroEdicao;
    }

    @Override
    public String toString() {
        return "Antigo{" +
                "numeroEdicao=" + numeroEdicao +
                '}'+super.toString();
    }
}
