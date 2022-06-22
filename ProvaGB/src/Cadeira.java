public class Cadeira {
    private Cor corCad;
    private Aluno alunoCad;

    public Cadeira(Cor corCad) {
        this.corCad = corCad;
    }

    public Cor getCorCad() {
        return corCad;
    }

    public void setCorCad(Cor corCad) {
        this.corCad = corCad;
    }

    public Aluno getAlunoCad() {
        return alunoCad;
    }

    public void setAlunoCad(Aluno alunoCad) {
        this.alunoCad = alunoCad;
    }

    @Override
    public String toString() {
        return "Cadeira{" +
                "corCad=" + corCad +
                ", alunoCad=" + alunoCad +
                '}';
    }
}
