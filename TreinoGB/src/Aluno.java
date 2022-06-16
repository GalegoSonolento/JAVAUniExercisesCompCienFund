public class Aluno {
    private String nome;
    private Grau ga, gb;

    public Aluno(String nome) {
        this.nome = nome;
        ga = new GrauA();
        gb = new GrauB();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Grau getGa() {
        return ga;
    }

    public void setGa(Grau ga) {
        this.ga = ga;
    }

    public Grau getGb() {
        return gb;
    }

    public void setGb(Grau gb) {
        this.gb = gb;
    }

    @Override
    public String toString() {
        return "Aluno{" +
                "nome='" + nome + '\'' +
                ", ga=" + ga +
                ", gb=" + gb +
                '}';
    }

    public void alteraNotasGrauA(double notaTrab, double notaProva){
        ((GrauA)ga).setNotaTrab(notaTrab);
        ((GrauA)ga).setNotaProva(notaProva);
    }

    public void alteraNotasGrauB(double notaAtiv, double notaSem){
        ((GrauB)gb).setNotaAtiv(notaAtiv);
        ((GrauB)gb).setNotaSem(notaSem);
    }

    public double calculaNotaFinal(){
        double notaA = ((GrauA)ga).calculacalculaNotaFinalGrau() * 0.33;
        double notaB = ((GrauB)gb).calculacalculaNotaFinalGrau() * 0.67;
        return notaA + notaB;
    }
}
