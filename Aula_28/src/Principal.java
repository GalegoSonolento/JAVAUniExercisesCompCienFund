public class Principal {
    public static void main(String[] args){
        Biblioteca biblioteca = new Biblioteca((int) (Math.random() * 20 + 1));

        System.out.println("*** Quantidade máxima de livros da biblioteca: "+biblioteca.getLivros().length);


        int quant = (int)(Math.random() * 30+1);
        System.out.println("===== Quantidade de livros a serem inseridos: "+quant);
        System.out.println(" ");

        for (int i=0; i<quant; i++){
            String titulo = "Titulo"+i;
            String autor = "Autor"+i;
            double preco = i*120;
            int ano = (int)(Math.random() * 2000 + 1);
            if ((int)(Math.random() * 2 + 1) == 1){
                double desconto = i*53;
                Novo n = new Novo(titulo, autor, ano, preco, desconto);
                if(biblioteca.insereLivro(n)){
                    System.out.println(" - Livro ["+n.getTitulo()+"] inserido com sucesso");
                }
                else
                    System.out.println(" - Livro ["+n.getTitulo()+"] não inserido");
            }
            else {
                int numEdicao = i*3;
                Antigo a = new Antigo(titulo, autor, ano, preco, numEdicao);
                if (biblioteca.insereLivro(a))
                    System.out.println(" - Livro ["+a.getTitulo()+"] inserido com sucesso");
                else
                    System.out.println(" - Livro ["+a.getTitulo()+"] não inserido");
            }
        }

        Livro livroAux = biblioteca.procuraLivroPorTitulo(Teclado.leString("Digite o livro procurado: "));
        System.out.println(livroAux == null ? "ERRO: Livro não encontrado" : livroAux);
        System.out.println(" ");

        System.out.println("===== IMPRIME DESCONTO =====");
        double desconto = biblioteca.verificaDesconto(Teclado.leString("Digite o título do livro para procurar o desconto: "));
        System.out.println(desconto == -1 ? "Livro não encontrado" : "Desconto do livro procurado: "+desconto);
        System.out.println(" ");

        System.out.println("===== EDIÇÃO DOS LIVROS ANTIGOS =====");
        biblioteca.imprimeEdicoes();
        System.out.println(" ");

        System.out.println("===== LIVROS EM ORDEM CRESCENTE DE LANÇAMENTO =====");
        biblioteca.imprimeLivroPorAno();
        System.out.println(" ");

        System.out.println("===== MÉDIA DE PREÇO DOS LIVROS =====");
        double media = biblioteca.calculaMediaPreco();
        System.out.println(media == -1 ? "ERRO: Não existem livros na biblioteca" : "\t- Média: R$"+media);
        System.out.println(" ");

        System.out.println("===== LIVRO COM MAIOR TÍTULO =====");
        livroAux = biblioteca.livroComMaiorTitulo();
        System.out.println(livroAux == null ? "ERRO: não existem livros na biblioteca" : "\t- "+livroAux);
        System.out.println(" ");
    }
}
