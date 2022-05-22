public class MEC {
    public void imprimeuniversidades(Universidade[] array){
        if (array == null) System.out.println("Não existem universidades para analizar.");
        else {
            for (int i = 0; i < array.length; i++)
                if (array[i] != null)
                    if (array[i] instanceof Publica)
                        System.out.println("[Pública]"+((Publica)array[i]).toString());
                    else
                        System.out.println("[Privada]"+((Particular)array[i]).toString());
        }
    }

    public void maisCara(Universidade[] array) {
        if (array == null) System.out.println("Não existem universidades para analizar.");
        if (array != null) {
            int posMaisCara = -1;
            for (int i = 0; i < array.length; i++)
                if (array[i] != null)
                    if (array[i] instanceof Particular) {
                        posMaisCara = i;
                        break;
                    }
            if (posMaisCara == -1)
                System.out.println("Não existem universidades privadas no array");
            else {
                for (int i = posMaisCara + 1; i < array.length; i++)
                    if (array[i] != null)
                        if (array[i] instanceof Particular)
                            if (((Particular) array[i]).getMensalidade() > ((Particular) array[posMaisCara]).getMensalidade())
                                posMaisCara = i;
                System.out.println(((Particular) array[posMaisCara]).toString());
            }
        }
    }

    public void universidadesDoSul(Universidade[] array){
        if (array == null) System.out.println("Não existem universidades para análise.");
        else
            for (int i=0; i<array.length; i++)
                if (array[i] != null)
                    if (array[i] instanceof Publica)
                        if (((Publica) array[i]).getEstado().equalsIgnoreCase("RS") || ((Publica) array[i]).getEstado().equalsIgnoreCase("SC") || ((Publica) array[i]).getEstado().equalsIgnoreCase("PR"))
                            System.out.println(array[i].toString());
    }
}
