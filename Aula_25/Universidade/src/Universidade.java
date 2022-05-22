public class Universidade {
    private String nome;
    private int quantAlunos, quantProfessores;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getQuantAlunos() {
        return quantAlunos;
    }
    public void setQuantAlunos(int quantAlunos) {
        this.quantAlunos = quantAlunos;
    }
    public int getQuantProfessores() {
        return quantProfessores;
    }
    public void setQuantProfessores(int quantProfessores) {
        this.quantProfessores = quantProfessores;
    }
    public Universidade(String nome, int quantAlunos, int quantProfessores) {
        this.nome = nome;
        this.quantAlunos = quantAlunos;
        this.quantProfessores = quantProfessores;
    }
    @Override
    public String toString(){
        return "=========="+"\n"+
                "Informações da Universidade "+nome+"\n"+
                "Quantidade de alunos: "+quantAlunos+"\n"+
                "Quantidade de professores: "+quantProfessores;
    }
}
