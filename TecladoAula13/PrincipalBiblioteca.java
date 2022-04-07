public class PrincipalBiblioteca {
    public static void main(String[] args){
        PrincipalBiblioteca livro1 = new PrincipalBiblioteca(Teclado.leString("Digite o nome do aluno: "), Teclado.leString("Digite o número de matrícula: "), Teclado.leDouble("Digite a nota no Grau A: "), Teclado.leDouble("Digite a nota no Grau B: "));
    }
}