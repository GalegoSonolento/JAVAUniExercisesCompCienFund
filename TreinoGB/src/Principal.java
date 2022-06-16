public class Principal {
    public static void main(String[] args){
        int quantAlunos = (int)(Math.random() * 50)+1;
        Turma turma1 = new Turma(Teclado.leString("Dê o código da turma: "), quantAlunos);

        int X = (int)(Math.random() * 100)+1;

        String[] nomes = {"Geraldo", "Alberto", "Anacleto", "Helga", "Geralda", "Umberto", "Bherta", "Fodixtófoclas"};
        String[] sobrenomes = {" Eizenkimmer", " Strauss", " Ackerman", " Pereira", " Silveira", " Romildson"};

        System.out.println("=-=-=-=-=- INSERÇÃO DOS ALUNOS =-=-=-=-=-");
        for (int i=0; i<X; i++){
            String nomeAl = nomes[(int)(Math.random() * nomes.length)];
            String sobrenomeAl = sobrenomes[(int)(Math.random() * sobrenomes.length)];
            Aluno aluno = new Aluno(nomeAl+sobrenomeAl);
            ((GrauA)aluno.getGa()).setNotaProva((int)(Math.random() * 100)+1);
            ((GrauA)aluno.getGa()).setNotaTrab((int)(Math.random() * 100)+1);
            ((GrauB)aluno.getGb()).setNotaSem((int)(Math.random() * 100)+1);
            ((GrauB)aluno.getGb()).setNotaAtiv((int)(Math.random() * 100)+1);
            System.out.println(turma1.insereAluno(aluno) ? "Aluno "+aluno.getNome()+" inserido com sucesso" : "Aluno "+aluno.getNome()+" não inserido");
            System.out.println(" ");
        }
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-==-=-=-=-=-");
        System.out.println(" ");
        System.out.println(" ");

        System.out.println("=-=-=-=-=- MÉDIA DAS NOTAS =-=-=-=-=-");
        System.out.println(turma1.mediaNotasTurma());
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-==-=-=-=-=-");
        System.out.println(" ");
        System.out.println(" ");

        System.out.println("=-=-=-=-=- SITUAÇÃO DOS ALUNOS =-=-=-=-=-");
        for (int i=0; i<turma1.getAlunos().length; i++)
            if (turma1.getAlunos()[i] != null)
                if (turma1.getAlunos()[i].calculaNotaFinal() >= 60.0) System.out.println("Aluno "+turma1.getAlunos()[i].getNome()+": Passou por média!");
                else System.out.println("Aluno "+turma1.getAlunos()[i].getNome()+": Ficou em  grau C.");
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-==-=-=-=-=-");
        System.out.println(" ");
        System.out.println(" ");
    }
}
