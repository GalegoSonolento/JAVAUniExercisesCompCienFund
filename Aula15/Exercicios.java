public class Exercicios{
    public void Contador(int x){
        while (x <= 300) System.out.println(x++);
    }
    
    public void imprimePares(int x){
        if (x <= 0) System.out.println("Número inválido, digite um número mais alto!");
        int i = 0;
        while (i <= x)
            if (i % 2 == 0) System.out.println(i++);
    }
    
    public boolean verificaPrimo(int x){
        int cont = 2;
        boolean isPrimo = false;
        while (cont < x){
            if (x % cont == 0) isPrimo = true;
            cont++;
        }
        return isPrimo;
    }
}