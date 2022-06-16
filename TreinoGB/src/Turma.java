public class Turma {
    private String codigo;
    private Aluno[] alunos;

    public Turma(String codigo, int quantAlunos) {
        this.codigo = codigo;
        alunos = new Aluno[quantAlunos];
    }

    public boolean insereAluno(Aluno al){
        boolean inserido = false;
        for (int i=0; i< alunos.length; i++)
            if (alunos[i] == null){
                alunos[i] = al;
                inserido = true;
                break;
            }
        return inserido;
    }

    public double mediaNotasTurma(){
        double soma = 0;
        double quantNotas = 0;
        if (alunos == null) return -1;
        for (int i=0; i< alunos.length; i++)
            if (alunos[i] != null){
                soma += alunos[i].calculaNotaFinal();
                quantNotas ++;
            }
        if (quantNotas == 0) return -1;
        double media = soma / quantNotas;
        return media;
    }

    public Aluno[] getAlunos() {
        return alunos;
    }
}

