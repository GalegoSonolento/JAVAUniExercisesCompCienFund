public class Teste2 {
    public static void main(String[] args){
        //mediaNotas();
        //exercicio2();
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

//    public static int exercicio3(int[] array){
//        if (array == null) return -999;
//
//    }
}
