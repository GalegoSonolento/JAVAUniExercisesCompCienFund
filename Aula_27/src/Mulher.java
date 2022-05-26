public class Mulher extends Pessoa{
    private String corDoCabelo;

    public Mulher(String nome, int idade, String corDoCabelo){
        super(nome, idade);
        this.corDoCabelo = corDoCabelo;
    }

    public String getCorDoCabelo() {
        return corDoCabelo;
    }
    public void setCorDoCabelo(String corDoCabelo) {
        this.corDoCabelo = corDoCabelo;
    }

    @Override
    public String toString(){
        return "=========="+"\n"+
                "Informações da pessoa: "+"\n"+
                "Nome: "+super.getNome()+"\n"+
                "Idade: "+super.getIdade()+"\n"+
                "Cor do cabelo: "+corDoCabelo;
    }
}
