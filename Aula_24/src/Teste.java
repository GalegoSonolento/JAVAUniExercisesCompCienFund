public class Teste {
    public static void main(String[] args){

        // Exercício 1
        //a)
        int[] a;
        a = new int[10];
        int j = 0;
        for (int i=10; i > 0; i--){
            a[j] = i;
            j ++;
        }
        //b)
        j = 0;
        int baixa = 0;
        int alta = 0;
        int[] b;
        b = new int[11];
        b[j] = 0;
        j ++;
        for (int c=0; c<101; c++){
            if (c == 0){
                baixa = 1;
                alta = 4;
            }
            if (c == baixa){
                b[j] = baixa;
                j ++;
                baixa *= alta;
            }
            else if (c == alta){
                b[j] = alta;
                j ++;
                alta *= baixa;
            }
        }
        for (int k=0; k<10; k++) {
            System.out.println(a[k]);
        }
    }
}
