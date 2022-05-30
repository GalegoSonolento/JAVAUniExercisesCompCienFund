public class Teste {
    public static void main(String[] args){
        Exercicios ex = new Exercicios();
        int[] teste = {1,2,3,4,5,6,7,8,9,10};
        int[] teste2 = {23, 45, 1234, 7};
        int[] teste3 = {-123, 23, -23, -9};
        char[] teste4 = {'I', 'N', 'T', 'E', 'R'};
        String[] strings = {"Banana", "Melão", "Melancia", "Mandioca", "Tapicoa", "Maçã", "Pêra", "Açafrão", "Beterraba"};
        boolean[] booleans = {false, true, true, false};
        double[] teste5 = {-4.123, 23, 4, 34.3};
        double[] teste6 = {0.234, 34.2, 34.9};
        int[] teste7 = {23, 45, 1234, 6};
        char[] teste8 = {'G', 'R', 'E', 'M', 'I', 'S', 'T', 'A'};
        String[] teste9 = {"Eu ", "não ", "gosto ", "de ", "laranja."};

        System.out.println(" ");
        System.out.println("=====Exercício 1 =====");

        ex.exercicio1(teste);
        System.out.println(" ");
        System.out.println("=====Exercício 2 =====");
        int[] retorno = ex.exercicio2(teste);
        for (int i=0; i< retorno.length; i++)
            System.out.println(retorno[i]);

        System.out.println(" ");
        System.out.println("=====Exercício 3 =====");
        int[] retorno2 = ex.exercicio3(teste);
        for (int i=0;i< retorno2.length; i++)
            System.out.println(retorno2[i]);

        System.out.println(" ");
        System.out.println("=====Exercício 4 =====");
        int retorno3 = ex.exercicio4(strings, "Banana");
        System.out.println(retorno3 == -1 ? "A string não está no array" : "A string está na array");

        System.out.println(" ");
        System.out.println("=====Exercício 5 =====");
        int[] resp = ex.exercicio5(booleans);
        for (int i=0; i<resp.length; i++)
            System.out.println(resp[i]);

        System.out.println(" ");
        System.out.println("=====Exercício 6 =====");
        int[] retorno4 = ex.exercicio6(teste, teste2);
        for (int i=0; i<retorno4.length; i++)
            System.out.println(retorno4[i]);

        System.out.println(" ");
        System.out.println("=====Exercício 7 =====");
        int[] retorno5 = ex.exercicio7(teste, teste3);
        for (int i=0; i<retorno5.length; i++)
            System.out.println(retorno5[i]);

        System.out.println(" ");
        System.out.println("=====Exercício 8 =====");
        ex.exercicio8(teste4);

        System.out.println(" ");
        System.out.println(" ");
        System.out.println("=====Exercício 9 =====");
        double resp6 = ex.exercicio9(teste);
        System.out.println(resp6);

        System.out.println(" ");
        System.out.println("=====Exercício 10 =====");
        System.out.println(ex.exercicio10(teste));

        System.out.println(" ");
        System.out.println(" ");
        System.out.println("=====Exercício 11 =====");
        System.out.println(ex.exercicio11(teste, 5));

        System.out.println(" ");
        System.out.println("=====Exercício 12 =====");
        System.out.println(ex.exercicio12(teste5));
        System.out.println(ex.exercicio12(teste6));

        System.out.println(" ");
        System.out.println("=====Exercício 13 =====");
        System.out.println("O maior elemento do array de teste é: "+ex.exercicio13(teste2));

        System.out.println(" ");
        System.out.println("=====Exercício 14 =====");
        System.out.println("A posição do maior número inteiro da array de teste é: "+ex.exercicio14(teste2));

        System.out.println(" ");
        System.out.println("=====Exercício 15 =====");
        System.out.println("O menor elemento da array de teste é: "+ex.exercicio15(teste3));

        System.out.println(" ");
        System.out.println("=====Exercício 16 =====");
        System.out.println("A menor posição do menor número inteiro da array de teste é: "+ex.exercicio16(teste2));

        System.out.println(" ");
        System.out.println("=====Exercício 17 =====");
        System.out.println(ex.exercicio17(teste7, teste2) ? "Os arrays são iguais" : "Os arrays são diferentes");

        System.out.println(" ");
        System.out.println("=====Exercício 18 =====");
        System.out.println(ex.exercicio18(teste8));

        System.out.println(" ");
        System.out.println("=====Exercício 19 =====");
        String[] resp7 = ex.exercicio19(Teclado.leInt("Digite quantas Strings quer no array de String: "));
        for (int i=0; i<resp7.length; i++)
            System.out.print(resp7[i]+" ");

        System.out.println(" ");
        System.out.println(" ");
        System.out.println("=====Exercício 20 =====");
        String[] resp8 = ex.exercicio20(teste9, 1);
        for (int i=0; i<resp8.length; i++)
            if (resp8[i] != null)
                System.out.print(resp8[i]);

        System.out.println(" ");
        System.out.println(" ");
        System.out.println("=====Exercício 21 =====");
        ex.exercicio21(teste5);
    }
}
