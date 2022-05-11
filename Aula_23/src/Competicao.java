public class Competicao {
    private String nome;
    private Data datacomp;

    public Competicao(String nome, Data datacomp) {
        this.nome = nome;
        this.datacomp = datacomp;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Data getDatacomp() {
        return datacomp;
    }

    public void setDatacomp(Data datacomp) {
        this.datacomp = datacomp;
    }

    public String imprimeData(){
        return datacomp.imprimeData();
    }

    @Override
    public String toString() {
        return "Competicao{" +
                "nome='" + nome + '\'' +
                ", data da competição =" + datacomp.imprimeData() +
                '}';
    }
}
