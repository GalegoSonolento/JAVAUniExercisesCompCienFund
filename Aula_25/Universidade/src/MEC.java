public class MEC {
    public void imprimeuniversidades(Universidade[] array){
        if (array == null) System.out.println("Não existem universidades para analizar.");
        for (int i=0; i<array.length; i++)
            System.out.println(array[i].toString());
    }

    public void maisCara(Universidade[] array){
        if (array == null) System.out.println("Não existem universidades para analizar.");
        int maisCara = -1;
        for (int i=0; i< array.length; i++)
            if (i<1) maisCara = i;
            else
                if (((Particular)array[i]).getMensalidade() > ((Particular)array[maisCara]).getMensalidade())
                    maisCara = i;
        System.out.println(((Particular)array[maisCara]).toString());
    }
}
