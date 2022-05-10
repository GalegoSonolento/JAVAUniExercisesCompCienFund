public class Corredor extends Atleta{
    private double peso;
    private Competicao competicao;

    public Corredor(String nome, int idade, double peso, Competicao competicao) {
        super(nome, idade);
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
                "Data: "+competicao.getDatacomp());
    }

    @override
    public void imprimeInfo(){
        System.out.println("Informações do atleta: "+"\n"+
                        "Nome: "+super.getNome()+"\n"+
                        "Idade: "+super.getIdade()+"\n"+
                        "Peso: "+peso+"\n"+
                        "Competição: "+competicao);
    }
}
