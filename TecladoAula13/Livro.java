public class Livro {
    private String titulo;
    private int anoPublicacao;
    private double valor;
    private int quantPaginas;
    
    public Livro(String titulo, int anoPublicacao, double valor, int quantPaginas){
        this.titulo = titulo;
        this.anoPublicacao = anoPublicacao;
        this.valor = valor;
        this.quantPaginas = quantPaginas;
    }
    
    public void calcularPrecoPorPagina(){
        double precoPagina = valor/quantPaginas;
        System.out.println("O valor da página deste livro é: "+precoPagina);
    }
    
    public void imprimeInfo(){
        System.out.println("As informações sobre esse livro são as seguintes: ");
        System.out.println("Título: "+titulo);
        System.out.println("Ano de publicação: "+anoPublicacao);
        System.out.println("Valor de mercado: "+valor);
        System.out.println("Quantidade de páginas: "+quantPaginas);
    }
}