public class Calculadora{
    private double memoria = 0;
    private String cor;
    
    public Calculadora(String cor){
        this.memoria = memoria;
        this.cor = cor;
    }
    
    public double getMemoria(){
        return memoria;
    }
    
    public String getCor(){
        return cor;
    }
    
    public void setMemoria(double memoria){
        this.memoria = memoria;
    }
    
    public void setCor(String cor){
        this.cor = cor;
    }
    
    public double soma(double num1, double num2){
        double soma = num1 + num2;
        memoria = soma;
        return soma;
    }
    
    public double subtrai(double num1, double num2){
        double menos = num1 - num2;
        memoria = menos;
        return menos;
    }
    
    public double multiplica(double num1, double num2){
        double multiplica = num1 * num2;
        memoria = multiplica;
        return multiplica;
    }
    
    public double divide(double num1, double num2){
        double divide = num1/num2;
        memoria = divide;
        return divide;
    }
    
    public int elevaAoQuadrado (int num){
        int pot2 = num*num;
        memoria = pot2;
        return pot2;
    }
    
    public int elevaAoCubo (int num){
        int pot3 = num*num*num;
        memoria = pot3;
        return pot3;
    }
    
    public void imprimeInfo(){
        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-");
        System.out.println("O último valor operacional contido na memória é: "+memoria+"\n"+
                           "A cor desses cálculos é: "+cor);
        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-");
    }
}
