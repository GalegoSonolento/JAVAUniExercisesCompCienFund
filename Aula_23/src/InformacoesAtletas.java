public class InformacoesAtletas {
    public void imprimeExclusivosAtleta(Atleta a){
        if (a instanceof Nadador) System.out.print("É um nadador, e sua categoria é "+((Nadador)a).getCategoria());
        else if (a instanceof Corredor) System.out.print("É um corredor, e o peso deste corredor é "+((Corredor)a).getPeso());
    }

    public void imprimeInformacoesAtleta(Atleta a){
        if (a instanceof Nadador) ((Nadador)a).imprimeInfo();
        else if (a instanceof Corredor) ((Corredor)a).imprimeInfo();
    }
}
