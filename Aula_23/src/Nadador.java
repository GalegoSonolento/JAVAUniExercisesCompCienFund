public class Nadador extends Atleta{
    private String categoria;

    public Nadador(String nome, int idade, String categoria) {
        super(nome, idade);
        this.categoria = categoria;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public void imprimeInfo(){
        System.out.println("Informações do nadador: "+"\n"+
                "Nome: "+super.getNome()+"\n"+
                "Idade: "+super.getIdade()+"\n"+
                "Categoria: "+categoria);
    }
}
