public class Nadador extends Atleta{
    private String categoria;

    public Nadador(String nome, int idade, String categoria) {
        super(nome, idade);
        this.categoria = categoria;
    }

    public void imprimeInfo(){
        System.out.println("Informações do nadador: "+"\n"+
                "Nome: "+nome+"\n"+
                "Idade: "+idade+"\n"+
                "Categoria: "+categoria);
    }
}
