public class Cliente{
    private String nome;
    private int idade;
    private String sexo;
    private String email;
    private String senha;
    
    public Cliente (String nome, int idade, String sexo, String email, String senha){
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
        this.email = email;
        this.senha = senha;
    }
    
    public void imprimeInfo(){
        System.out.println("As informações do cliente "+nome+" são as seguintes: ");
        System.out.println("Idade: "+idade);
        System.out.println("Sexo: "+sexo);
        System.out.println("E-mail; "+email);
        System.out.println("Senha: "+senha);
    }
}