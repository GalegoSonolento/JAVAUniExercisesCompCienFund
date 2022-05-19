import java.time.temporal.Temporal;

//Sor, eu sei que o array deveria conter um espaço vazio, mas sem fazer um objeto de churro com valores vazios o sistema não funcionava.
//Outra coisa é que eu ainda não peguei como fazer tratamento de String no Java. Não sei se a gente vai chegar nessa parte ainda, mas seria interessante.
//Ou seja, todos os sabores não podem ter espaços e tem que ser tudo minúsculo para funcionar certinho.
//Eu fiz o tamanho da array por teclado e coloquei 2 valores nulls por conta.
public class Principal {
    public static void main(String [] args){
        int quanChurros = Teclado.leInt("Quantos churros colocar? ");
        Churros[] array = new Churros[quanChurros];
        for (int i=0; i<array.length; i++)
            if (i<array.length-2)
                array[i] = new Churros(Teclado.leString("Digite o sabor do churro: "), Teclado.leDouble("Digte o preço do churro: "));
            else
                array[i] = new Churros();

        BancaDeChurros banca = new BancaDeChurros(array);

        System.out.println("Existem "+banca.estoqueChurros(Teclado.leString("Digite o sabor de churros a ser procurado no estoque: "))+" no estoque.");
        boolean inserido = banca.insereChurro(new Churros("banana", 12.3));
        if (inserido) System.out.println("Novo churro inserido");
        else System.out.println("Novo churro não inserido");
        System.out.println("O preço total dos churros na banca é: R$"+banca.valorTotal());
        banca.vendeChurros(Teclado.leString("Digite o churros para comprar: "));
        banca.imprimeChurros();
        banca.lePedidos(Teclado.leString("Digite seu nome: "), Teclado.leString("Digite o sabor desejado de churros: "), Teclado.leInt("Digite a quantidade de churros para comprar: "));
    }
}
