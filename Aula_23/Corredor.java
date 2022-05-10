public class Corredor extends Atleta{
    private double peso;
    private Competicao competicao;

    public Corredor(double peso, Competicao competicao) {
        this.peso = peso;
        this.competicao = competicao;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public Competicao getCompeticao() {
        return competicao;
    }

    public void setCompeticao(Competicao competicao) {
        this.competicao = competicao;
    }

    public void imprimeCompeticao(){
        System.out.println("Informações da competição do atleta: "+"\n"+
                "Nome: "+competicao.getNome()+"\n"+
                "Data: "+competicao.getData());
    }

    @override
    public void imprimeInfo(){
        System.out.println("Informações do atleta: "+"\n"+
                "Nome: "+nome+"\n"+
                "Idade: "+idade+"\n"+
                "Peso: "+peso+"\n"
                "Competição: "+competicao.);
    }
}
