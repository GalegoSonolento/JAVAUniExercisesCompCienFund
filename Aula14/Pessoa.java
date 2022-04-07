public class Pessoa{
    private String nome;
    private char sexo;
    private int idade;
    private double altura;
    private int quantIrmao;
    private String adress;
    
    public Pessoa (String nome, char sexo, int idade, double altura, 
                    int quantIrmao, String adress){
        this.nome = nome;
        this.sexo = sexo;
        this.idade = idade;
        this.altura = altura;
        this.quantIrmao = quantIrmao;
        this.adress = adress;
    }
    
    public void imprimeInformacoes(){
        System.out.println("Nome do usuário: "+nome);
        System.out.println("Sexo: "+sexo);
        System.out.println("Idade: "+idade);
        System.out.println("Altura: "+altura);
        System.out.println("Quantidade de irmãos: "+quantIrmao);
        System.out.println("Último endereço informado: "+adress);
    }
    
    public boolean isFilhoUnico(){
        boolean filhoUnico = false;
        if (quantIrmao==0)
            filhoUnico = true;
        return filhoUnico;
    }
    
    public String filhoUnico(){
        if (isFilhoUnico())
            return "Filho único";
        else
            return "Não é filho único";
    }
    
}