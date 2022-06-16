public class GrauA extends Grau{
    private double notaTrab, notaProva;

    public GrauA(String dataInicio, String dataFim, double notaTrab, double notaProva) {
        super(dataInicio, dataFim);
        this.notaTrab = notaTrab;
        this.notaProva = notaProva;
    }

    public GrauA() {
        this.notaTrab = 0;
        this.notaProva = 0;
    }

    public double getNotaTrab() {
        return notaTrab;
    }

    public void setNotaTrab(double notaTrab) {
        this.notaTrab = notaTrab;
    }

    public double getNotaProva() {
        return notaProva;
    }

    public void setNotaProva(double notaProva) {
        this.notaProva = notaProva;
    }

    @Override
    public String toString() {
        return "GrauA{" +
                "dataInicio='" + super.getDataInicio() + '\'' +
                ", dataFim='" + super.getDataFim() + '\'' +
                "notaTrab=" + notaTrab +
                ", notaProva=" + notaProva +
                '}';
    }

    public double calculacalculaNotaFinalGrau(){
        double notaGA = (notaTrab * 0.3) + (notaProva * 0.7);
        return notaGA;
    }
}
