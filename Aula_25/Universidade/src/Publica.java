public class Publica extends Universidade{
    private String estado, cidade;

    public Publica(String nome, int quantAlunos, int quantProfessores, String estado, String cidade) {
        super(nome, quantAlunos, quantProfessores);
        this.estado = estado;
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    @Override
    public String toString(){
        return "=========="+"\n"+
                "Informações da Universidade pública "+super.getNome()+":"+"\n"+
                "Quantidade de alunos: "+super.getQuantAlunos()+"\n"+
                "Quantidade de professores: "+super.getQuantProfessores()+"\n"+
                "Localização: "+cidade+", "+estado;
    }
}
