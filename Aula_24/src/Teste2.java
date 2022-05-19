public class Teste2 {
    public static void main(String[] args){
        //mediaNotas();
        //exercicio2();
        int[] teste = {1,2,5,4};
        System.out.println("A soma dos valores da array é: "+exercicio3(teste));
        String[] nome = {"João", "Roberta", "Valentino"};
        System.out.println(procuraNome(nome, "Alemão"));
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
            for (int i=0; i<array.length; i++)
                if (array[i] != 0)
                    soma += array[i];
        return soma;
    }

    public static boolean procuraNome(String[] array, String nome){
        boolean resp = false;
        if (array == null) return false;
        else
            for (int i=0; i< array.length; i++)
                if (array[i] != null)
                    if (array[i].equalsIgnoreCase(nome)){
                        resp = true;
                        break;
                    }
        return resp;
    }
}
