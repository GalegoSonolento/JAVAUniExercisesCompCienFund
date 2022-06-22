public class CadeiraComRodinhas extends Cadeira{
    private Data ultimaManutencao;

    public CadeiraComRodinhas(Cor corCad, Data ultimaManutencao) {
        super(corCad);
        this.ultimaManutencao = ultimaManutencao;
    }

    public Data getUltimaManutencao() {
        return ultimaManutencao;
    }

    public void setUltimaManutencao(Data ultimaManutencao) {
        this.ultimaManutencao = ultimaManutencao;
    }

    @Override
    public String toString() {
        return "CadeiraComRodinhas{" +
                "corCad=" + super.getCorCad() +
                ", alunoCad=" + super.getAlunoCad() +
                ", ultimaManutencao=" + ultimaManutencao +
                '}';
    }
}
