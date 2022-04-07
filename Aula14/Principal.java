public class Principal{
    public static void main(String[] args){
        Pessoa pes1 = new Pessoa("Joaquim", 'M', 19, 1.78, 0, "Rua C, 145");
        
        Pessoa pes2 = new Pessoa("Manuelita", 'F', 30, 1.67, 3, "Rua dos Camelos, 12");
            
        Pessoa pes3 = new Pessoa("Pedro", 'M', 10, 1.91, 1, "Rua dos Gigantes, 189");
                                
        pes1.imprimeInformacoes();
        System.out.println(pes1.filhoUnico());
        System.out.println(" ");
        pes2.imprimeInformacoes();
        System.out.println(pes2.filhoUnico());
        System.out.println(" ");
        pes3.imprimeInformacoes();
        System.out.println(pes3.filhoUnico());
        System.out.println(" ");
    }
}