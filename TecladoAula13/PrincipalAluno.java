public class PrincipalAluno {
    public static void main(String[] args){
        Aluno aluno1 = new Aluno(Teclado.leString("Digite o nome do aluno: "), 
                                 Teclado.leString("Digite o número de matrícula: "),
                                 Teclado.leDouble("Digite a nota no Grau A: "), 
                                 Teclado.leDouble("Digite a nota no Grau B: "));
        
        Aluno aluno2 = new Aluno(Teclado.leString("Digite o nome do aluno: "), 
                                 Teclado.leString("Digite o número de matrícula: "),
                                 Teclado.leDouble("Digite a nota no Grau A: "), 
                                 Teclado.leDouble("Digite a nota no Grau B: "));
        
        Aluno aluno3 = new Aluno(Teclado.leString("Digite o nome do aluno: "), 
                                 Teclado.leString("Digite o número de matrícula: "),
                                 Teclado.leDouble("Digite a nota no Grau A: "), 
                                 Teclado.leDouble("Digite a nota no Grau B: "));
        
        aluno1.imprimeInfo();
        aluno1.calculaMediaFinal();
        aluno2.imprimeInfo();
        aluno2.calculaMediaFinal();
        aluno3.imprimeInfo();
        aluno3.calculaMediaFinal();
        
        aluno2.setNotaGA(Teclado.leDouble("Digite a nova nota do grau A de "+aluno2.getNome()+": "));
        
        aluno2.calculaMediaFinal();
        
        System.out.println("O número de matrícula de "+aluno3.getNome()+" é: "+aluno3.getMatricula());
        
        aluno1.setMatricula(Teclado.leString("Digite o número de matrícula de "+aluno1.getNome()+" corretamente aqui: "));
        System.out.println(aluno1.getMatricula());
    }
    
    
    
}