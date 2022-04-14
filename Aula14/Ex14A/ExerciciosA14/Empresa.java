public class Empresa{
    private String nome = "Aleatório";
    private FuncionarioCaixa funcionario1 = null;
    private FuncionarioCaixa funcionario2 = null;
    
    public Empresa(String nome, FuncionarioCaixa funcionario1, FuncionarioCaixa funcionario2){
        this.nome = nome;
        this.funcionario1 = funcionario1;
        this.funcionario2 = funcionario2;
    }
    
    public Empresa(String nome){
        this.nome = nome;
    }
    
    public Empresa(){
        this.nome = "Baianinho de Mauá INC";
    }
    
    public String getNome(){
        return nome;
    }
    
    public FuncionarioCaixa getFuncionario1(){
        return funcionario1;
    }
    
    public FuncionarioCaixa getFuncionario2(){
        return funcionario2;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public void setFuncionario1(FuncionarioCaixa funcionario1){
        this.funcionario1 = funcionario1;
    }
    
    public void setFuncionario2(FuncionarioCaixa funcionario2){
        this.funcionario2 = funcionario2;
    }
    
    public String impirmeInfo(){
        return "-=-=-=-=-=-=-=-=-=-"+"\n"+"Nome da empresa: "+nome+
        "\n"+"Dados do funcionário 1: "+
        "\n"+funcionario1.imprimeInfo()+
        "\n"+"-------------"+
        "\n"+"Dados funcionário 2: "+
        "\n"+funcionario2.imprimeInfo()+
        "\n"+"-=-=-=-=-=-=-=-=-=-";
    }
}