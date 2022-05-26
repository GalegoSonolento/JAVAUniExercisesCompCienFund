public class Time {
    private String nome;
    private int anoCriacao, quantSocios;

    public Time(String nome, int anoCriacao, int quantSocios) {
        this.nome = nome;
        this.anoCriacao = anoCriacao;
        this.quantSocios = quantSocios;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getAnoCriacao() {
        return anoCriacao;
    }
    public void setAnoCriacao(int anoCriacao) {
        this.anoCriacao = anoCriacao;
    }
    public int getQuantSocios() {
        return quantSocios;
    }
    public void setQuantSocios(int quantSocios) {
        this.quantSocios = quantSocios;
    }

    @Override
    public String toString(){
        return "=========="+"\n"+
                "Informações do time "+nome+"\n"+
                "Ano de criação: "+anoCriacao+"\n"+
                "Quantidade de sócios: "+quantSocios;
    }
}
