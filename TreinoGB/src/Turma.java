/*(1,0	pt)	Crie	uma	classe	chamada	Turma.
Esta	classe	possui	como	atributos	um	código	(tipo	String)	e	um	array
de	Aluno.
No	construtor,	receba	o	código	da	turma	e	a	quantidade	máxima de	alunos	por	parâmetro
(Inicialize
o	array	de	Aluno	com	esta	quantidade).
Ainda	na	classe	Turma,	faça	o	que	se	pede:
• (1,0	pt) crie	um	método	insereAluno,
que	recebe	um	objeto	do	tipo	Aluno por	parâmetro	e	o	insere
na	primeira	posição	livre	do	array,
retornando	verdadeiro	caso	seja	possível	inserir	e	falso	caso	contrário
• (1,0 pt) crie	 um	método	 chamado	mediaNotasTurma,	 que	 retorna
a	média	 de	 nota	 (nota	 final)	 de
todos	os	alunos	presentes	no	array	(ou	-1	caso	não	existam	alunos)*/

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
        double quantNotas = alunos.length;
        if (alunos == null) return -1;
        for (int i=0; i< alunos.length; i++)
            if (alunos[i] != null)
                soma += alunos[i].calculaNotaFinal();
        double media = soma / quantNotas;
        return media;
    }

    public Aluno[] getAlunos() {
        return alunos;
    }
}
