public class Carta {
    private int nome;
    private String coronga;
    private String naipe;

    public Carta(int nome, String naipe) {
        this.nome = nome;
        this.naipe = naipe;
    }
    public Carta(String coronga, String naipe){
        this.coronga = coronga;
        this.naipe = naipe;
    }

    public int getNome() {
        return nome;
    }

    public void setNome(int nome) {
        this.nome = nome;
    }

    public String getNaipe() {
        return naipe;
    }

    public void setNaipe(String naipe) {
        this.naipe = naipe;
    }
    public String getCoronga(){
        return coronga;
    }
    public void setCoronga(String coronga){
        this.coronga = coronga;
    }
}
