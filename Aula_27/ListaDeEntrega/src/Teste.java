public class Teste {
    public static void main(String[] args){
        Exercicios ex = new Exercicios();
        int[] teste = {1,2,3,4,5,6,7,8,9,10};
        int[] teste2 = {23, 45, 1234, 7};
        String[] strings = {"Banana", "Melão", "Melancia", "Mandioca", "Tapicoa", "Maçã", "Pêra", "Açafrão", "Beterraba"};
        boolean[] booleans = {false, true, true, false};
        ex.exercicio1(teste);
        System.out.println(" ");
        System.out.println("=====Exercício 2 =====");
        int[] retorno = ex.exercicio2(teste);
        for (int i=0; i< retorno.length; i++)
            System.out.println(retorno[i]);

        System.out.println(" ");
        System.out.println("=====Exercício 3 =====");
        int[] retorno2 = ex.exercicio3(teste);
        for (int i=0;i< retorno2.length; i++){
            System.out.println(retorno2[i]);
        }

        System.out.println(" ");
        System.out.println("=====Exercício 4 =====");
        int retorno3 = ex.exercicio4(strings, "Banana");
        System.out.println(retorno3 == -1 ? "A string não está no array" : "A string está na array");

        System.out.println(" ");
        System.out.println("=====Exercício 5 =====");
        int[] resp = ex.exercicio5(booleans);
        for (int i=0; i<resp.length; i++){
            System.out.println(resp[i]);
        }

        System.out.println(" ");
        System.out.println("=====Exercício 6 =====");
        int[] retorno4 = ex.exercicio6(teste, teste2);
        for (int i=0; i<retorno4.length; i++){
            System.out.println(retorno4[i]);
        }
    }
}
