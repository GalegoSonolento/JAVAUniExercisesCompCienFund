import java.util.Arrays;

public class Biblioteca {
    private Livro[] livros;

    public Biblioteca(int quantLivros) {
        this.livros = new Livro[quantLivros];
    }

    public Livro[] getLivros() {
        return livros;
    }

    public void setLivros(Livro[] livros) {
        this.livros = livros;
    }

    @Override
    public String toString(){
        String retorno = "";
        for (int i=0; i<livros.length; i++)
            if (livros[i] != null)
                retorno += livros[i];
        return retorno;
    }

    public Livro procuraLivroPorTitulo(String s){
        for (int i=0; i< livros.length; i++)
            if (livros[i] != null && livros[i].getTitulo().equalsIgnoreCase(s))
                return livros[i];
        return null;
    }

    public boolean insereLivro(Livro p){
        for (int i=0; i<livros.length; i++)
            if (livros[i] == null){
                livros[i] = p;
                return true;
            }
        return false;
    }

    public double verificaDesconto(String titulo){
        for (int i=0; i< livros.length;i++)
            if (livros[i] != null && livros[i] instanceof Novo)
                if (livros[i].getTitulo().equalsIgnoreCase(titulo))
                    return ((Novo)livros[i]).getValorDesconto();
        return -1;
    }

    public void imprimeEdicoes(){
        for (int i=0; i< livros.length; i++)
            if (livros[i] != null && livros[i] instanceof Antigo)
                System.out.println(((Antigo)livros[i]).getNumeroEdicao());
    }

    public void imprimeLivroPorAno(){
        Livro[] novo = new Livro[livros.length];
        for (int i=0; i< livros.length; i++)
            for (int j=0; j< novo.length; j++)
                if (novo[j] == null){
                    novo[j] = livros[i];
                    break;
                }

        for (int i=0; i<novo.length; i++){
            int posMaior = -1;

            for (int k=0; k< novo.length; k++)
                if (novo[k] != null){
                    posMaior = k;
                    break;
                }

            if (posMaior == -1)
                break;

            for (int j=posMaior+1; j< novo.length; j++)
                if (novo[j] != null){
                    if (j == 0)
                        posMaior = j;
                    else if (novo[posMaior].getAno() < novo[j].getAno())
                        posMaior = j;
                }
            System.out.println(novo[posMaior]);
            novo[posMaior] = null;
        }
    }

    public double calculaMediaPreco(){
        double soma = 0;
        int quant = 0;
        for (int i=0; i< livros.length; i++)
            if (livros[i] != null){
                soma += livros[i].getPreco();
                quant++;
            }
        return quant == 0 ? -1 : soma/quant;
    }

    public Livro livroComMaiorTitulo(){
        for (int j=0; j< livros.length; j++){
            int posMaiorTit = -1;
            for (int i=0; i<livros.length; i++)
                if (livros[i] != null){
                    posMaiorTit = i;
                    break;
                }

            if (posMaiorTit == -1)
                return null;

            for (int i=0; i<livros.length; i++)
                if (livros[i] != null)
                    if (livros[posMaiorTit].getTitulo().length() < livros[i].getTitulo().length())
                        posMaiorTit = i;
            return livros[posMaiorTit];
        }
        return null;
    }
}
