public class PrincipalAluno {
    public static void main(String[] args){
        Aluno aluno1 = new Aluno(Teclado.leString("Digite o nome do aluno: "), 
                                 Teclado.leString("Digite o número de matrícula: "),
                                 Teclado.leDouble("Digite a nota no Grau A: "), 
                                 Teclado.leDouble("Digite a nota no Grau B: "));
        
        /*Aluno aluno2 = new Aluno(Teclado.leString("Digite o nome do aluno: "), 
                                 Teclado.leString("Digite o número de matrícula: "),
                                 Teclado.leDouble("Digite a nota no Grau A: "), 
                                 Teclado.leDouble("Digite a nota no Grau B: "));
        
        Aluno aluno3 = new Aluno(Teclado.leString("Digite o nome do aluno: "), 
                                 Teclado.leString("Digite o número de matrícula: "),
                                 Teclado.leDouble("Digite a nota no Grau A: "), 
                                 Teclado.leDouble("Digite a nota no Grau B: "));*/
        
        aluno1.imprimeInfo();
        aluno1.calculaMediaFinal();
        aluno2.imprimeInfo();
        aluno2.calculaMediaFinal();
        aluno3.imprimeInfo();
        aluno3.calculaMediaFinal();
    }
    
    
    
}