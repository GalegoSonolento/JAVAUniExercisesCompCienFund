public class Exercicios {
    public void exercicio1(int[] array) {
        for (int i = array.length-1; i >= 0; i--)
            System.out.println(array[i]);
    }

    public int[] exercicio2(int[] a){
        int[] invertido = new int[a.length];
        int pos = 0;
        for (int i=a.length-1; i>=0; i--){
            invertido[pos++] = a[i];
        }
        return invertido;
    }

    public int[] exercicio3(int[] a){
        int[] apenasPares;
        int cont = 0;
        for (int i=0; i<a.length; i++)
            if (a[i] % 2 == 0) cont++;
        apenasPares = new int[cont];
        int pos = 0;
        for (int i=0; i<a.length; i++)
            if (a[i] % 2 == 0)
                apenasPares[pos++] = a[i];
        return apenasPares;
    }

    public int exercicio4(String[] a, String x){
        int posArray = -1;
        for (int i=0; i<a.length; i++)
            if (a[i] != null)
                if (a[i].equalsIgnoreCase(x)){
                    posArray = i;
                    break;
                }
        return posArray;
    }

    public int[] exercicio5(boolean[] bool){
        int[] resp = new int[bool.length];
        int pos = 0;
        for (int i=0; i< bool.length; i++)
            if (bool[i])
                resp[pos++] = 1;
            else
                resp[pos++] = -1;
        return resp;
    }

    public int[] exercicio6(int[] a, int[] b){
        int[] c = new int[a.length + b.length];
        int pos = 0;
        for (int i=0; i<a.length; i++)
            c[pos++] = a[i];
        for (int i=0; i<b.length; i++)
            c[pos++] = b[i];
        return c;
    }

//    public int[] exercicio7(int[] a, int[] b){
//        int negs = 0;
//        int posiv = 0;
//        for (int i=0; i<a.length; i++)
//            if (a[i] < 0) negs++;
//            else if (a[i] >= 0) posiv++;
//        negs = 0;
//        posiv = 0;
//        int[] tdNegativos = new int[negs];
//        int[] tdPositivo = new int[posiv];
//        for (int i=0; i<a.length; i++){
//
//        }
//    }
}
