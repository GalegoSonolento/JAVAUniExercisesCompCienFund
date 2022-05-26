public class Homem extends Pessoa{
    private Time time;
    private String corCabeloPreferida;

    public Homem(String nome, int idade, Time time, String corCabeloPreferida){
        super(nome, idade);
        this.time = time;
        this.corCabeloPreferida = corCabeloPreferida;
    }

    public Time getTime() {
        return time;
    }
    public void setTime(Time time) {
        this.time = time;
    }
    public String getCorCabeloPreferida() {
        return corCabeloPreferida;
    }
    public void setCorCabeloPreferida(String corCabeloPreferida) {
        this.corCabeloPreferida = corCabeloPreferida;
    }

    @Override
    public String toString(){
        return "=========="+"\n"+
                "Informações da pessoa: "+"\n"+
                "Nome: "+super.getNome()+"\n"+
                "Idade: "+super.getIdade()+"\n"+
                "Time: "+time.getNome()+"\n"+
                "Cor de cabelo preferida nas mulheres: "+corCabeloPreferida;
    }
}
