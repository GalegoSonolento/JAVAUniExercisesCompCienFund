public class BancaDeChurros {
    private Churros[] churros;

    public BancaDeChurros(Churros[] churros) {
        this.churros = churros;
    }

    public int estoqueChurros(String sabor){
        int quantEstoque = 0;
        if (churros == null) return -1;
        else
            for (int i = 0; i <churros.length; i++)
                if (churros[i].getSabor() != null){
                    if(churros[i].getSabor().equals(sabor))
                        quantEstoque ++;
                }
        return quantEstoque;
    }

    public boolean insereChurro(Churros churro){
        boolean inseriu = false;
        if (churros != null)
            for (int i=0; i<churros.length; i++)
                if (churros[i].getPreco() == 0.0){
                    churros[i] = churro;
                    inseriu = true;
                    break;
                }
        return inseriu;
    }

    public double valorTotal(){
        int soma = 0;
        if (churros != null)
            for (int i=0; i<churros.length; i++)
                if (churros[i] != null)
                    soma += churros[i].getPreco();
        return soma;
    }

    public boolean vendeChurros(String sabor){
        boolean vendeu = false;
        double vendido = 0.0;
        if (churros != null)
            for (int i=0; i<churros.length; i++)
                if (churros[i].getSabor() != null)
                    if (churros[i].getSabor().equals(sabor)){
                        vendeu = true;
                        vendido = churros[i].getPreco();
                        churros[i].setSabor(null);
                        churros[i].setPreco(0.0);
                        break;
                    }
        if (vendeu){
            System.out.println("A compra do churro foi de "+vendido);
        }
        else System.out.println("A venda não foi realizada");
        return vendeu;
    }

    public void imprimeChurros() {
        if (churros != null)
            for (int i = 0; i < churros.length; i++)
                if (churros[i] != null)
                    System.out.println(churros[i].toString());
    }

    public void lePedidos(String nome, String sabor, int quantidade){
        if (churros != null)
            for (int i=0; i<quantidade; i++)
                if (vendeChurros(sabor))
                    System.out.println("Sucesso");
                else
                    System.out.println("Falha");
    }
}
