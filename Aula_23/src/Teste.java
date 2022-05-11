import java.nio.charset.CoderResult;

public class Teste {
    public static void main(String [] args){
        Competicao comp = new Competicao("Correr cansa", new Data(19, 5, 2011));
        System.out.println(comp.toString());

        Atleta a = new Nadador("Cielo", 23, "Borboleta");
        ((Nadador)a).imprimeInfo();

        Atleta b = new Corredor("Pedro", 91, 68, comp);
        ((Corredor)b).getCompeticaoAtleta().getDatacomp().setMes(2);
        ((Corredor)b).getCompeticaoAtleta().imprimeData();

        Atleta c = new Corredor("Augosto", 100, 70, new Competicao("São Silvestre", new Data(1, 1, 2012)));
        ((Corredor)c).imprimeInfo();

        Atleta d = null;
        int opcao = Teclado.leInt("Desea criar um nadador [1] ou um corredor [2]? ");
        if (opcao == 1) d = new Nadador(Teclado.leString("Digite o nome do nadador: "), Teclado.leInt("Digite a idade deste nadador: "), Teclado.leString("Digite a categoria deste nadador: "));
        else if (opcao == 2) d = new Corredor(Teclado.leString("Digite o nome deste corredor: "), Teclado.leInt("Digite a idade deste corredor: "), Teclado.leDouble("Digite o peso deste corredor: "), new Competicao(Teclado.leString("Digite o nome da competição: "), new Data(Teclado.leInt("Digite o dia: "), Teclado.leInt("Digite o mês: "), Teclado.leInt("Digite o ano: "))));

        InformacoesAtletas info1 = new InformacoesAtletas();
        info1.imprimeExclusivosAtleta(d);
        info1.imprimeInformacoesAtleta(d);

        if (d instanceof Nadador) ((Nadador)d).setCategoria("Livre");
        else if (d instanceof Corredor) ((Corredor)d).setPeso(89);

        info1.imprimeExclusivosAtleta(d);
    }
}
