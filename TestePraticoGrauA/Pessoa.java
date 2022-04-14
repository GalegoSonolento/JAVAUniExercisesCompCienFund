public class Pessoa{
    private String nome;
    private Aquario aquarioPes;
    
    public Pessoa (String nome, Aquario aquarioPes){
        this.nome = nome;
        this.aquarioPes = aquarioPes;
    }
    
    public String getNome(){
        return nome;
    }
    public Aquario getAquarioPes(){
        return aquarioPes;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    public void setAquarioPes(Aquario aquarioPes){
        this.aquarioPes = aquarioPes;
    }
    
    public String toString(){
        return "----------"+
        "\n"+"A pessoa "+nome+" tem um aquário com as seguintes informações: "+
        "\n"+aquarioPes.toString();
    }
}