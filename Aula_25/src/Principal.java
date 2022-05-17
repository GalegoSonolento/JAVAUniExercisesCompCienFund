public class Principal {
    public static void main(String[] args){
        Livro[] livros = new Livro[Teclado.leInt("Digite quantos livros você quer ter: ")];
        for (int i=0; i< livros.length; i++)
            livros[i] = new Livro(Teclado.leString("Digite o título do livro: "), Teclado.leString("Digite o nome do autor do livro: "), Teclado.leInt("Digite o ano de publicação: "));
        Biblioteca biblio = new Biblioteca(livros);
        String pesquisa = Teclado.leString("Digite um título de livro para pesquisar: ");
        if (biblio.verificaLivro(pesquisa))
            System.out.println(biblio.retornaLivro(pesquisa).toString());
        else System.out.println("Este livro não está disponível na biblioteca.");
    }
}
