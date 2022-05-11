public class Teste {
    public static void main(String args[]){
        Competicao comp = new Competicao("Correr cansa", new Data(19, 5, 2011));
        System.out.println(comp.toString());

        Atleta a = new Nadador("Cielo", 23, "Borboleta");
        ((Nadador)a).imprimeInfo();

        Atleta b = new Corredor("Pedro", 91, 68, comp);
        ((Corredor)b).getCompeticaoAtleta().getDatacomp().setMes(2);
        ((Corredor)b).getCompeticaoAtleta().imprimeData();

        Atleta c = new Corredor("Augosto", 100, 70, new Competicao("São Silvestre", new Data(1, 1, 2012)));
        ((Corredor)c).imprimeInfo();
    }
}
