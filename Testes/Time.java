public class Time {
    //Atributos
    private String nome;
    private int quantMundiais;
    private String corPrincipal;
    private boolean estadioProprio;
    private double orcamento;
    
    //Objetos -> aqui eu digo que para criar um time, eu preciso desses parâmetros 
    public Time (String nome, int quantMundiais, String corPrincipal,
    boolean estadioProprio, double orcamento) {
        this.nome = nome;
        this.quantMundiais = quantMundiais;
        this.corPrincipal = corPrincipal;
        this.estadioProprio = estadioProprio;
        this.orcamento = orcamento;
    }
    
    //VISIBILIDADE TIPO_DE_RETORNO NOME_DO_MÉTODO (PARÂMETROS) -> ASSICNATURA DE MÉTODO
    public String getNome () {
        return /*this.*/ nome;
    }
    
    public int getquantMundiais () {
        return quantMundiais;
    }
    
    public String getCorPrincipal () {
        return corPrincipal;
    }
    
    public boolean isEstadioProprio () {
        return estadioProprio;
    }
    
    public double getOrcamento () {
        return orcamento;
    }
    
    //VISIBILIDADE TIPO_DE_RETORNO NOME_DO_MÉTODO (PARÂMETROS)
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public void setQuantMundiais(int quantMundiais) {
        this.quantMundiais = quantMundiais;
    }
    
    public void setCorPrincipal (String corPrincipal) {
        this.corPrincipal = corPrincipal;
    }
    
    public void setEstadioProprio (boolean estadioProprio) {
        this.estadioProprio = estadioProprio;
    }
    
    public void setOrcamento (double orcamento) {
        this.orcamento = orcamento;
    }
}