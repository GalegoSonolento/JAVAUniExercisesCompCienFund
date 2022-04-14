public class PrincipalBiblioteca {
    public static void main(String[] args){
        Cliente cliente1 = new Cliente("Carlos Lacerda", 34, "M", "Carlinhos10@gmail.com", "1234");
        Cliente cliente2 = new Cliente("Robertinho", 20, "M", "robertinhogameplays@gmail.com", "sususususus");
        Cliente cliente3 = new Cliente("Radigunda", 30, "F", "radigunda.gunga@hotmail.com", "abracadabra");
        
        Livro livro1 = new Livro("1984", 1925, 34, 300);
        Livro livro2 = new Livro("Percy Jackson", 2010, 50, 290);
        Livro livro3 = new Livro("A Origem das Espécies", 1890, 39, 400);
        
        livro1.calcularPrecoPorPagina();
        livro2.calcularPrecoPorPagina();
        livro3.calcularPrecoPorPagina();
        
        cliente1.imprimeInfo();
        cliente2.imprimeInfo();
        cliente3.imprimeInfo();
        System.out.println("----------------");
        livro1.imprimeInfo();
        livro2.imprimeInfo();
        livro3.imprimeInfo();
    }
}