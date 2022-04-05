public class Aluno {
    private String nome;
    private String matricula;
    private double notaGA;
    private double notaGB;
    
    public Aluno (String nome, String matricula, double notaGA, double notaGB) {
        this.nome = nome;
        this.matricula = matricula;
        this.notaGA = notaGA;
        this.notaGB = notaGB;
    }
    
    public String getNome() {
        return nome;
    }
    
    public String getMatricula(){
        return matricula;
    }
    
    public double getNotaGA(){
        return notaGA;
    }
    
    public double getNotaGB(){
        return notaGB;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public void setMatricula(String matricula){
        this.matricula = matricula;
    }
    
    public void setNotaGA(double notaGA){
        this.notaGA = notaGA;
    }
    
    public void setNotaGB(double notaGB){
        this.notaGB = notaGB;
    }
    
    public void calculaMediaFinal(){
         double media = (notaGA*0.33)+(notaGB*0.67);
         System.out.println("Média final do aluno é: "+media);
    }
    
    public void imprimeInfo(){
        System.out.println("As informações contidas sobre o aluno "+nome+
        " são as seguintes:");
        System.out.println("Matrícula: "+matricula);
        System.out.println("Nota no Grau A: "+notaGA);
        System.out.println("Nota no Grau B: "+notaGB);
    }

}


