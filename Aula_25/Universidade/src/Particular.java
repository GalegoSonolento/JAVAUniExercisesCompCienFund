public class Particular extends Universidade{
    private double mensalidade;

    public Particular(String nome, int quantAlunos, int quantProfessores, double mensalidade){
        super(nome, quantAlunos, quantProfessores);
        this.mensalidade = mensalidade;
    }
    public double getMensalidade() {
        return mensalidade;
    }
    public void setMensalidade(double mensalidade) {
        this.mensalidade = mensalidade;
    }
    @Override
    public String toString(){
        return "=========="+"\n"+
                "Informações da Universidade privada "+super.getNome()+":"+"\n"+
                "Quantidade de alunos: "+super.getQuantAlunos()+"\n"+
                "Quantidade de professores: "+super.getQuantProfessores()+"\n"+
                "Mensalidade: "+mensalidade;
    }
}
