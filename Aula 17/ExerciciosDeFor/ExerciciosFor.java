public class ExerciciosFor {
    public void exercicio1(int x) {
        for (int i=0; i<x; i++) 
            Teclado.leString("Digite um nome de pessoa: ");
    }
    public void exercicio2(int x) {
        for (int i=0; i<=x; i++)
            System.out.println(i);
    }
    public void exercicio3(int x) {
        if (x<0)System.out.println("Valor inválido!");
        for (int i=0; i<=x; i++) {
            if (i % 2 == 0) System.out.println(i);
        }
    }
    public void exercicio4(int x) {
        if (x < 0) System.out.println("Valor inválido");
        else for (int i=x; i>=0; i--) System.out.println(i);
    }
    public void exercicio5(int x) {
        int cont = 0;
        for (int i=0; i<x; i++) {
            String time = Teclado.leString("Para qual time você torce? ");
            if (time.equals("Grêmio")||time.equals("GREMIO")||time.equals("gremio")||time.equals("grêmio"))cont++;
        }
        System.out.println("Existem "+cont+" torcedores do Grêmio");
    }
    public void exercicio6(int x) {
        double soma=0;
        for (int i=0; i<x; i++)soma += Teclado.leDouble("Digite um valor com ponto flutuante");
        System.out.println("A soma de todos os valores digitados foi: "+soma);
    }
    public void exercicio7() {
        int soma = 0;
        for (int i=1; i<11; i++)soma+= Teclado.leInt("Digite o "+i+"° valor inteiro");
        System.out.println("A soma dos números digitados é: "+soma);
    }
    public void exercicio8() {
        int quant = Teclado.leInt("Quantos números irá digitar? ");
        for (int i=0; i<quant; i++) {
            int num = Teclado.leInt("Digite um número inteiro: ");
            if (num<0)System.out.println("Você digitou um número negativo!");
            else if (num==0)System.out.println("Você digitou zero!");
            else if (num>0)System.out.println("Você digitou um número positivo!");
        }
    }
    public void exercicio9(int val1, int val2) {
        if (val1 < 0||val2<0)System.out.println("É impossível realizar a operação");
        else {
            if (val1>val2) {
                for (int i=val2; i<=val1; i++) {
                    if (i % 2 == 0)System.out.println(i);
                }
            }
            else if (val1<val2) {
                for (int i=val1; i<=val2; i++) {
                    if (i % 2 == 0)System.out.println(i);
                }
            }
        }
    }
    public void exercicio10() {
        int soma = 0;
        for (int i = 0; i<=198; i++)soma+=i;
        System.out.println("A soma de 0 até 198 é: "+soma);
    }
    public void exercicio11(int x, int y) {
        int soma=0;
        if (x<y) for (int i=x; i<=y; i++) if (i % 2 != 0)soma+=i;
        
        else if (x>y) for (int j=y; j<=x; j++) if (i % 2 != 0)soma += j;
        System.out.println("A soma dos lagarismos ímpares é: "+soma);
    }
    public void exercicio12(){
        int soma = 0;
        int quantnum = 0;
        while (true) {
            int num = Teclado.leInt("Digite um número inteiro: ");
            if (num >= 0) {
                soma += num;
                quantnum ++;
            }
            else if (num < 0) break;
        }
        double media = soma/quantnum;
        System.out.println("Fora digitados "+quantnum+" números positivos. Sua média é: "+media);
    }
    public void exercicio13(int x) {
        int fatorial = x;
        for (int i=x-1; i>=1; i--) fatorial = fatorial * i;
        System.out.println("O fatorial de "+x+" é: "+fatorial);
    }
    public boolean exercicio14(int x) {
	boolean isPrimo = true;
	int cont = 0;
	for (int i=1; i<=x; i++) {
        	if (x % i == 0) cont ++;
        	if (cont == 2) isPrimo = true;
        	else isPrimo = false;
	}
	return isPrimo;
	}
    public void exercicio15(int x) {
    	int cont = 0;
    	int soma = 0;
    	for (int j = 1; j<=x; j++){
    	    if (x % j == 0) cont ++;
    	    if (cont == 2)
        }
    	for (int i=0; i<=x; i++) {
    		System.out.println(i);
    		soma++;
    	}
    	System.out.println("A soma de todos os números é: "+soma);
    }
}
