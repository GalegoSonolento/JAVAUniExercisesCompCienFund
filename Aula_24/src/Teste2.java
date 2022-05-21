import java.util.Arrays;

public class Teste2 {
    public static void main(String[] args){
//        Exercício 8
         mediaNotas();
        exercicio2();
        int[] teste = {1,2,5,4};
        int[] teste2 = {3,3,2,1};
        System.out.println("A soma dos valores da array é: "+exercicio3(teste));
        String[] nome = {"João", "Roberta", "Valentino"};
        System.out.println(procuraNome(nome, "Alemão"));
        System.out.println(Arrays.toString(exercicio5(teste, teste2)));
        double[] teste3 = {2, 3, 2.7, 9.23, 10.12};
        exercicio6(teste3);
        exercicio7();
    }

    public static void mediaNotas(){
        double[] notas = new double[Teclado.leInt("Digite quantas notas serão contabilizadas: ")];
        double soma = 0;
        for (int i=0; i<notas.length; i++){
            notas[i] = Teclado.leDouble("Digite a nota com ponto flutuante: ");
            soma += notas[i];
        }
        System.out.println("A média das notas apresentadas é: "+(soma/notas.length));
    }

    public static void exercicio2(){
        String[] nomes = new String[Teclado.leInt("Digite quantos nomes devem ser armazenados: ")];
        for (int i=0; i<nomes.length; i++) nomes[i] = Teclado.leString("Digite o nome aqui: ");
        System.out.print("Dados informados: ");
        for (int j=0; j< nomes.length; j++)
            if (j < nomes.length-2) System.out.print(nomes[j]+", ");
            else if (j < nomes.length-1) System.out.print(nomes[j]+" e ");
            else System.out.print(nomes[j]+".");
    }

    public static int exercicio3(int[] array){
        int soma = 0;
        if (array == null) return -999;
        else
            for (int j : array)
                if (j != 0)
                    soma += j;
        return soma;
    }

    public static boolean procuraNome(String[] array, String nome){
        boolean resp = false;
        if (array == null) return false;
        else
            for (String s : array)
                if (s != null)
                    if (s.equalsIgnoreCase(nome)) {
                        resp = true;
                        break;
                    }
        return resp;
    }

    public static int[] exercicio5(int[] a, int[] b){
        int[] resp;
        if (a == null && b == null) return null;
        else {
            assert a != null;
            if (a.length != b.length) return null;
            else {
                resp = new int[a.length];
                for (int i=0; i<a.length; i++)
                    resp[i] = a[i] + b[i];
            }
        }
        return resp;
    }

    public static void exercicio6(double[] a){
        double maior = 0, menor = 0, soma = 0, media;
        if (a != null) {
            for (int i = 0; i < a.length; i++)
                if (a[i] != 0.0){
                    if (i == 0) maior = menor = a[i];
                    else
                        if (a[i] > maior) maior = a[i];
                        else if (a[i] < menor) menor = a[i];
                    soma += a[i];
                }
            media = soma / a.length;
            System.out.println("As informações obtidas na array são: "+"\n"+
            "Maior valor: "+maior+"\n"+
            "Menor valor: "+menor+"\n"+
            "Média dos valores: "+media);
        }
    }

    public static void exercicio7(){
        int tam = (int) ((Math.random()*100)+1);
        int[] a = new int[tam];
        for (int i=0; i<a.length; i++) a[i] = (int) ((Math.random()*1000)+1);
        for (int j=0; j<a.length; j++)
            if (j == a.length-1)System.out.print(a[j]+".");
            else System.out.print(a[j]+" - ");
    }
}
