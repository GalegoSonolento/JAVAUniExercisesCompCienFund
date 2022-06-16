public class GrauB extends Grau{
    private double notaAtiv, notaSem;

    public GrauB(String dataInicio, String dataFim, double notaAtiv, double notaSem) {
        super(dataInicio, dataFim);
        this.notaAtiv = notaAtiv;
        this.notaSem = notaSem;
    }

    public GrauB() {
        this.notaAtiv = 0;
        this.notaSem = 0;
    }

    public double getNotaAtiv() {
        return notaAtiv;
    }

    public void setNotaAtiv(double notaAtiv) {
        this.notaAtiv = notaAtiv;
    }

    public double getNotaSem() {
        return notaSem;
    }

    public void setNotaSem(double notaSem) {
        this.notaSem = notaSem;
    }

    @Override
    public String toString() {
        return "GrauB{" +
                "dataInicio='" + super.getDataInicio() + '\'' +
                ", dataFim='" + super.getDataFim() + '\'' +
                "notaAtiv=" + notaAtiv +
                ", notaSem=" + notaSem +
                '}';
    }

    public double calculacalculaNotaFinalGrau(){
        double notaGB = (notaAtiv * 0.3) + (notaSem * 0.7);
        return notaGB;
    }
}
