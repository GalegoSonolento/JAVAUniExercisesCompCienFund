public class FuncionarioCaixa{
    private String nome;
    private String adress;
    private char sexo;
    private Calculadora calculo;
    
    public FuncionarioCaixa(){
        this.nome = "Nome...";
        this.adress = "Exemplo, 123 - Cidade Exemplo, País fictício";
        this.sexo = 'x';
        this.calculo = calculo;
    }
    
    public FuncionarioCaixa(String nome, String adress, char sexo, Calculadora calculo){
        this.nome = nome;
        this.adress = adress;
        this.sexo = sexo;
        this.calculo = calculo;
    }
    
    public String getNome(){
        return nome;
    }
    
    public String getAdress(){
        return adress;
    }
    
    public char getSexo(){
        return sexo;
    }
    
    public Calculadora getCalculo(){
        return calculo;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public void setAdress(String adress){
        this.adress = adress;
    }
    
    public void setSexo(char sexo){
        this.sexo = sexo;
    }
    
    public void setCalculadora(Calculadora calculo){
        this.calculo = calculo;
    }
    
    public double soma(double n1, double n2){
        double soma = calculo.soma(n1, n2);
        return soma;
    }
    
    public double subtrai(double n1, double n2){
        double menos = calculo.subtrai(n1, n2);
        return menos;
    }
    
    public double multiplica(double n1, double n2){
        double multiplica = calculo.multiplica(n1, n2);
        return multiplica;
    }
    
    public double divide(double n1, double n2){
        double divide = calculo.divide(n1, n2);
        return divide;
    }
    
    public int elevaAoQuadrado(int n1){
        int pot2 = calculo.elevaAoQuadrado(n1);
        return pot2;
    }
    
    public int elevaAoCubo(int n1){
        int pot3 = calculo.elevaAoCubo(n1);
        return pot3;
    }
    
    public String imprimeInfo(){
        return "-=-=-=-=-=-=-=-=-=-=-=-=-"+
        "\n"+"As informações do funcionário "+nome+" são:"+
        "\n"+"Endereço: "+adress+
        "\n"+"Sexo: "+sexo+
        "\n"+"Último cálculo realizado: "+calculo.getMemoria();
    }
}