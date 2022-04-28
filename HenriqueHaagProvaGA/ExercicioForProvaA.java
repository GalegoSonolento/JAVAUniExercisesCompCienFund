public class ExercicioForProvaA {
    /* public static void main(String[] args){
        imprimeNum(Teclado.leInt("Digite um número inteiro: "));
    } */
    
    public static void imprimeNum(int x) {
    	if (x <= 0) System.out.println("ERRO! Valor inválido para x");
    	else 
    		for (int i=x; i>=0; i--) System.out.println(i);
    }
}
//Parece que essa classe era solta aqui. Pelo menos foi isso que eu entendi quando li a ordem desse 
//exercício lá no final da prova 2. Eu até testei ele com o método main, mas vou deixar comentado. 