public class Teste {
    public static void main(String[] args){

//        // Exercício 1
//        //a)
//        int[] a;
//        a = new int[10];
//        int j = 0;
//        for (int i=10; i > 0; i--){
//            a[j] = i;
//            j ++;
//        }
//        //b)
//        j = 0;
//        int baixa = 0;
//        int alta = 0;
//        int[] b;
//        b = new int[11];
//        b[j] = 0;
//        j ++;
//        for (int c=0; c<101; c++){
//            if (c == 0){
//                baixa = 1;
//                alta = 4;
//            }
//            if (c == baixa){
//                b[j] = baixa;
//                j ++;
//                baixa *= alta;
//            }
//            else if (c == alta){
//                b[j] = alta;
//                j ++;
//                alta *= baixa-1;
//            }
//        }
//
//        //c) 1 2 3 4 5 10 20 30 40 50
//        int[] c;
//        c = new int[10];
//        int cont = 0;
//        for (int l=1; l<51; l++){
//            if (l <= 5){
//                c[cont] = l;
//                cont ++;
//            }
//            else{
//                if (l == 10) {
//                    c[cont] = l;
//                    cont++;
//                }
//                else if (l == 20) {
//                    c[cont] = l;
//                    cont++;
//                }
//                else if (l == 30) {
//                    c[cont] = l;
//                    cont++;
//                }
//                else if (l == 40) {
//                    c[cont] = l;
//                    cont++;
//                }
//                else if (l == 50) {
//                    c[cont] = l;
//                    cont++;
//                }
//            }
//        }
//        for (int k=0; k<10; k++) {
//            //System.out.println(a[k]);
//            //System.out.println(b[k]);
//            //System.out.println(c[k]);
//        }


//        //Exercício 2
//        double[] a;
//        a = new double[5];
//        for (int i=0;i<5;i++) a[i] = i;
//        for (int j=0;j<5;j++) System.out.print(a[j]+"-");

//        //Exercício 3
//        double[] d = new double[10];
//        for (int i=0; i<10; i++) d[i] = Math.random();
//        for (int j=0;j<10;j++) System.out.println(d[j]);

//        //Exercício 4
//        int[] d = new int[5];
//        int p = -2;
//        int cont = 0;
//        for (int i=0; i<5; i++) {
//            d[i] = p;
//            p++;
//        }
//        for (int k=0; k<5; k++){
//            if (d[k] < 0) cont ++;
//        }
//        System.out.println(cont);

//        //Exercício 5
//        int[] a = {1, 2, 5, 5, 5, 7};
//        System.out.println(exercicio5(a, 5));

//        //Exericio 6
//        int[] a = {-2, 2, -5, 6};
//        exercicio6(a);

//        //Exercício 7
//        int[] a = {1,3,7,9,4,9,3};
//        System.out.println(exercicio7(a));

//        //Exercício 8
//        exercicio8();

//        // Exercício 9
//        int[] a = {1,5,8,9,10};
//        exercicio9(a);
//        for (int j=0; j<a.length; j++) System.out.println(a[j]);
    }
    public void exercicio1A(){
        int[] array = new int[10];
        int cont = 10;
        for (int i=0; i<array.length; i++) array[i] = cont--;
    }
    public void exercicio1B(){
        int[] b = new int[11];
        for (int i=0; i<b.length; i++)
            b[i] = i*i;
    }
    public void exercicio1C() {
        int[] array = new int[10];
        int cont = 10;
        for (int i = 0; i < array.length; i++) {
            if (i < 5) array[i] = i + 1;
            else {
                array[i] = cont;
                cont += 10;
            }
        }
    }
    public void exercicio1D(){
        int[] b = new int[10];
        for (int i=0; i<b.length; i++)
            b[i] = (i*i)+3;
    }

    public void exercicio3(){
        double[] array = new double[10];
        for (int i=0; i<array.length; i++)
            array[i] = Teclado.leDouble("Digite um valor para a posição "+i+" do array: ");
    }

    public int exercicio4(int[] array){
        if (array == null) // lançar uma exceção
            return -1;
        int quantNegativos = 0;
        for (int i=0; i<array.length; i++)
            if (array[i] < 0) quantNegativos ++;
        return quantNegativos;
    }

//    public static int exercicio5(int[] a, int x){
//        if (a == null) return -1;
//        int repete = 0;
//        for (int i=0; i<a.length; i++) if (a[i] == x) repete++;
//        return repete;
//    }
//    public static boolean[] exercicio6(int[] a){
//        if (array == null) return null;
//        boolean[] b;
//        b = new boolean[a.length];
//        for (int i=0; i<a.length; i++){
//            if (a[i] <= 0) b[i] = false;
//            else if (a[i] > 0) b[i] = true;
//            ou ainda:
//            b[i] = a[i] > 0;
//        }
//        for (int j=0; j< b.length; j++) System.out.println(b[j]);
//        return b;
//    }

    public int exercicio7(double[] array){
        if (array == null) return -1;
        int posMaiorValor = 0;
        for (int i=0; i<array.length; i++)
            if (array[i] > array[posMaiorValor]) posMaiorValor = i;
        return posMaiorValor;
    }
//    public static int exercicio7(int[] a){
//        if (array == null) return -1;
//        int maior = 0;
//        int pos = 0;
//        int cont = 0;
//        for (int i=0; i<a.length; i++){
//            if (i == 0) {
//                maior = a[i];
//                pos = i;
//            }
//            else if (a[i] > maior || cont == 0){
//                maior = a[i];
//                pos = i;
//                cont ++;
//            }
//        }
//        return pos;
//    }
//    public static double[] exercicio8(){
//        double[] a = new double[Teclado.leInt("Digite quantos elementos essa array terá: ")];
//        for (int i=0; i<a.length; i++) a[i] = Teclado.leDouble("Digite um valor com ponto flutuante para a array: ");
//        return a;
//    }

    public void exercicio9(int[] array){
        if (array != null) // ou if(array == null) return;
            for (int i=0; i<array.length; i++)
                array[i] = array[i] % 2 == 0 ? 1 : -1;
                /*if(array[i] % 2 == 0) array[i] = 1;
                else array[i] = -1;*/
    }
//    public static int[] exercicio9(int[] a){
//        for (int i=0; i<a.length; i++){
//            if (a[i] % 2 == 0) a[i] = 1;
//            else if (a[i] % 2 != 0) a[i] = -1;
//        }
//        return a;
//    }
}
