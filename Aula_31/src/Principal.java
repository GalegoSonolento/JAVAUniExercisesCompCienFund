public class Principal {
    public static void main(String[] args){
        int quantContas = Teclado.leInt("Digite a quantidade de contas no Facebook: ");
        Facebook face1 = new Facebook(quantContas);
        String[] URLs = {"https://facebook.com/sus", "https://facebook.com/amongus"};
        String[] nomes = {"Roberto", "Claudio", "Louiza", "Estanislau", "Vasily"};
        String[] senhas = {"2134", "987", "3456", "sus"};

        for (int i=0; i<quantContas+3; i++){
            String URL = URLs[(int)(Math.random() * URLs.length)];
            String nome = nomes[(int)(Math.random() * nomes.length)];
            String senha = senhas[(int)(Math.random() * senhas.length)];
            if (Math.random() > 0.5)
                System.out.println(face1.insereConta(new ContaFacebook(URL, nome, senha)));
        }
    }
}
