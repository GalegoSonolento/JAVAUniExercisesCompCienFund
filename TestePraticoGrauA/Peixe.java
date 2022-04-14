public class Peixe{
    private String nome;
    private Cor corPeixe;
    private String raca;
    
    public Peixe(String nome, Cor corPeixe, String raca){
        this.nome = nome;
        this.corPeixe = corPeixe;
        this.raca = raca;
    }
    
    public String getNome(){
        return nome;
    }
    public Cor getCorPeixe(){
        return corPeixe;
    }
    public String getRaca(){
        return raca;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    public void setCorPeixe(Cor corPeixe){
        this.corPeixe = corPeixe;
    }
    public void setRaca(String raca){
        this.raca = raca;
    }
    
    public String toString(){
        return "-------------"+
        "\n"+"Dados do peixe "+nome+": "+
        "\n"+"Cor do peixe: "+corPeixe.getNome()+
        "\n"+"Raça do peixe: "+raca;
    }
}