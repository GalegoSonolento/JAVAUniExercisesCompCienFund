public class Corredor extends Atleta{
    private double peso;
    private Competicao competicaoAtleta;

    public Corredor(String nome, int idade, double peso, Competicao competicaoAtleta) {
        super(nome, idade);
        this.peso = peso;
        this.competicaoAtleta = competicaoAtleta;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public Competicao getCompeticaoAtleta() {
        return competicaoAtleta;
    }

    public void setCompeticaoAtleta(Competicao competicaoAtleta) {
        this.competicaoAtleta = competicaoAtleta;
    }

    public void imprimeCompeticao(){
        System.out.println("Informações da competição do atleta: "+"\n"+
                "Nome: "+competicaoAtleta.getNome()+"\n"+
                "Data: "+competicaoAtleta.getDatacomp());
    }

    @Override
    public void imprimeInfo(){
        System.out.print("Informações do atleta: "+"\n"+
                        "Nome: "+super.getNome()+"\n"+
                        "Idade: "+super.getIdade()+"\n"+
                        "Peso: "+peso+"\n"+
                        "Competição: ");
        imprimeCompeticao();
    }
}
