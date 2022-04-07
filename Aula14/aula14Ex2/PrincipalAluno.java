public class PrincipalAluno{
    public static void main(String[] args){
        Aluno al1 = new Aluno("Petrônio", "0058487", 1.6, 7.1);
        Aluno al2 = new Aluno("Javonilda", "1254870", 9.5, 9.3);
        Aluno al3 = new Aluno("Josepha", "4487512", 7.7, 2.3);
        
        al1.imprimeInfo();
        al1.precisaGrauC();
        al2.imprimeInfo();
        al2.precisaGrauC();
        al3.imprimeInfo();
        al3.precisaGrauC();
    }
}