public class Biblioteca {
    Livro[] biblio;

    public Biblioteca(Livro[] biblio) {
        this.biblio = biblio;
    }

    public boolean verificaLivro(String titulo){
        boolean retorno = false;
        for (Livro livro : biblio) retorno = livro.getTitulo().equals(titulo);
        return retorno;
    }

    public Livro retornaLivro(String titulo){
        Livro retorno = null;
        for (int i=0; i<biblio.length; i++)
            if (biblio[i].getTitulo().equals(titulo)) retorno = biblio[i];
        return retorno;
    }
}
