public class Teste{
    public static void main(String args[]){
        FuncionarioCaixa funcionario1 = new FuncionarioCaixa(Teclado.leString("Digite no nome do funcionário: "), Teclado.leString("Digite o nome do endereço deste funcionário: "), Teclado.leChar("Digite um caractere para"+"\n"+" identificar o sexo deste funcionário(M/F): "), new Calculadora(Teclado.leString("Digite uma cor para identificar a calculadora: ")));
        
        System.out.println("O resultado de 2 + 2,"+"\n"+"feito pelo funcionário 1, é: "+funcionario1.soma(2,2));
        System.out.println("O resultado de 5 - 4,"+"\n"+"feito pelo funcionário 1, é: "+funcionario1.subtrai(5,4));
        System.out.println("O resultado de 2 x 3,"+"\n"+"feito pelo funcionário 1, é: "+funcionario1.multiplica(2,3));
        System.out.println("O resultado de 6 / 3,"+"\n"+"feito pelo funcionário 1, é: "+funcionario1.divide(6,3));
        System.out.println("O resultado de 7 na potência 2,"+"\n"+"feito pelo funcionário 1, é: "+funcionario1.elevaAoQuadrado(7));
        System.out.println("O resultado de 8 na potência 3,"+"\n"+"feito pelo funcionário 1, é: "+funcionario1.elevaAoCubo(8));
        
        Empresa empresa1 = new Empresa(Teclado.leString("Digite o nome da empresa: "), funcionario1, new FuncionarioCaixa(Teclado.leString("Digite o nome do novo funcionário da empresa: "), Teclado.leString("Digite o endereço deste funcionário: "), Teclado.leChar("Digite um caractere para"+"\n"+"identificar o sexo deste funcionário(M/F): "), new Calculadora(Teclado.leString("Digite uma cor para identifica a calculadora: "))));
        System.out.println(empresa1.impirmeInfo());
    }
}