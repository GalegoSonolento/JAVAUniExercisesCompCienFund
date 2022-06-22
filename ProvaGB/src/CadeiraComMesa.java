public class CadeiraComMesa extends Cadeira{
    private double largura, profundidade;

    public CadeiraComMesa(Cor corCad, double largura, double profundidade) {
        super(corCad);
        this.largura = largura;
        this.profundidade = profundidade;
    }

    public double getLargura() {
        return largura;
    }

    public void setLargura(double largura) {
        this.largura = largura;
    }

    public double getProfundidade() {
        return profundidade;
    }

    public void setProfundidade(double profundidade) {
        this.profundidade = profundidade;
    }

    @Override
    public String toString() {
        return "CadeiraComMesa{" +
                "corCad=" + super.getCorCad() +
                ", alunoCad=" + super.getAlunoCad() +
                ", largura=" + largura +
                ", profundidade=" + profundidade +
                '}';
    }
}
