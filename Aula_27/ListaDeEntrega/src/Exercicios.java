public class Exercicios {
    public void exercicio1(int[] array) {
        for (int i = array.length-1; i >= 0; i--)
            System.out.println(array[i]);
    }

    public int[] exercicio2(int[] a){
        int[] invertido = new int[a.length];
        int pos = 0;
        for (int i=a.length-1; i>=0; i--){
            invertido[pos++] = a[i];
        }
        return invertido;
    }

    public int[] exercicio3(int[] a){
        int[] apenasPares;
        int cont = 0;
        for (int i=0; i<a.length; i++)
            if (a[i] % 2 == 0) cont++;
        apenasPares = new int[cont];
        int pos = 0;
        for (int i=0; i<a.length; i++)
            if (a[i] % 2 == 0)
                apenasPares[pos++] = a[i];
        return apenasPares;
    }

    public int exercicio4(String[] a, String x){
        int posArray = -1;
        for (int i=0; i<a.length; i++)
            if (a[i] != null)
                if (a[i].equalsIgnoreCase(x)){
                    posArray = i;
                    break;
                }
        return posArray;
    }

    public int[] exercicio5(boolean[] bool){
        int[] resp = new int[bool.length];
        int pos = 0;
        for (int i=0; i< bool.length; i++)
            if (bool[i])
                resp[pos++] = 1;
            else
                resp[pos++] = -1;
        return resp;
    }

    public int[] exercicio6(int[] a, int[] b){
        int[] c = new int[a.length + b.length];
        int pos = 0;
        for (int i=0; i<a.length; i++)
            c[pos++] = a[i];
        for (int i=0; i<b.length; i++)
            c[pos++] = b[i];
        return c;
    }

//    Exercício 7: Faça um método chamado exercicio7 que recebe dois arrays de inteiros, e retorna
//    um terceiro array que possui todos os elementos negativos (dos dois arrays) na primeira parte
//    e todos os elementos positivos (inclusive o zero) na segunda parte (dos dois arrays).

    public int[] exercicio7(int[] a, int[] b){
        int negs = 0;
        int posiv = 0;
        for (int i=0; i<a.length; i++)
            if (a[i] < 0) negs++;
            else if (a[i] >= 0) posiv++;
        for (int i=0; i<b.length; i++)
            if (b[i] < 0) negs++;
            else if (b[i] >= 0) posiv++;
        int[] tdNegativos = new int[negs];
        int[] tdPositivo = new int[posiv];
        negs = 0;
        posiv = 0;
        for (int i=0; i<a.length; i++)
            if (a[i] < 0)
                tdNegativos[negs++] = a[i];
            else if (a[i] >= 0)
                tdPositivo[posiv++] = a[i];
        for (int i=0; i<b.length; i++)
            if (b[i] < 0)
                tdNegativos[negs++] = b[i];
            else if (b[i] >= 0)
                tdPositivo[posiv++] = b[i];
        int[] resp = new int[tdPositivo.length+ tdNegativos.length];
        int pos = 0;
        for (int i=0; i< tdNegativos.length; i++)
            resp[pos++] = tdNegativos[i];
        for (int i=0; i< tdPositivo.length; i++)
            resp[pos++] = tdPositivo[i];
        return resp;
    }

//    Exercício 8: Faça um método chamado exercicio8 que recebe um array de char e imprime na
//    tela (na mesma linha) todos os elementos do array
    public void exercicio8(char[] c){
        for (int i=0; i<c.length; i++)
            System.out.print(c[i] + " ");
    }

//    Exercício 9: Faça um método chamado exercicio9 que recebe um array de inteiros e retorna a
//    média de todos os elementos do array
    public double exercicio9(int[] a){
        double soma = 0;
        for (int i=0; i<a.length; i++)
            soma += a[i];
        double tot = a.length;
        return (soma/tot);
    }

//    Exercício 10: Faça um método chamado exercicio10 que recebe um array de inteiros e retorna
//    a média de todos os elementos pares do array
    public double exercicio10(int[] a){
        double quantPares = 0;
        double somaPares = 0;
        for (int i=0; i<a.length; i++)
            if (a[i] % 2 == 0){
                quantPares += 1;
                somaPares += a[i];
            }
        return somaPares/quantPares;
    }

//    Exercício 11: Faça um método chamado exercicio11 que recebe um array de inteiros e um
//    inteiro x e retorna o elemento da posição x do array
    public int exercicio11(int[] a, int x){
        for (int i=0; i<a.length; i++)
            if (i == x)
                return a[i];
        return -1;
    }

//    Exercício 12: Faça um método chamado exercicio12 que recebe um array de double e retorna
//true caso algum elemento seja negativo, e false caso todos sejam positivos.
    public boolean exercicio12(double[] a){
        for (int i=0; i<a.length; i++)
            if (a[i] < 0) return true;
        return false;
    }

    public int exercicio13(int[] a){
        int maior = 0;
        for (int i=0; i<a.length; i++)
            if (i == 0)
                maior = a[i];
            else
                if (a[i] > maior)
                    maior = a[i];
        return maior;
    }

    public int exercicio14(int[] a){
        int maiorNum = 0;
        int maiorPos = -1;
        for (int i=0; i<a.length; i++)
            if (i == 0){
                maiorPos = i;
                maiorNum = a[i];
            }
            else
                if (a[i] > maiorNum){
                    maiorNum = a[i];
                    maiorPos = i;
                }
        return maiorPos;
    }

    public int exercicio15(int[] a){
        int menor = 0;
        for (int i=0; i<a.length; i++)
            if (i == 0)
                menor = a[i];
            else
                if (a[i] < menor)
                    menor = a[i];
        return menor;
    }

    public int exercicio16(int[] a){
        int menorNum = 0;
        int menorPos = -1;
        for (int i=0; i<a.length; i++)
            if (i == 0){
                menorNum = a[i];
                menorPos = i;
            }
            else
                if (a[i] < menorNum){
                    menorNum = a[i];
                    menorPos = i;
                }
        return menorPos;
    }

    public boolean exercicio17(int[] a, int[] b){
        if (a.length != b.length) return false;
        else
            for (int i=0; i<a.length; i++)
                if (a[i] != b[i]) return false;
        return true;
    }

    public String exercicio18(char[] a){
        String retorno = "";
        for (int i=0; i<a.length; i++)
            retorno += a[i];
        return retorno;
    }


    public String[] exercicio19(int x){
        String[] retorno = new String[x];
        System.out.println("Digite os valores da array de Strings via teclado: ");
        for (int i=0; i<retorno.length; i++)
            retorno[i] = Teclado.leString("-> ");
        return retorno;

        //Essa aqui é só uma resposta que eu encontrei para o que eu pensei que fosse a resposta certa
        // Ele vai criar um array de char que vai receber todos os algarismos de uma String
        //Depois ele vai propriamente criar uma String e retornar o método
//        char[] chars = new char[x];
//        System.out.println("Digite os algarismos da String: ");
//        for (int i=0; i<chars.length; i++)
//            chars[i] = Teclado.leChar("");
//        String retorno = "";
//        for (int i=0; i<chars.length; i++)
//            retorno += chars[i];
//        return retorno;
    }

    public String[] exercicio20(String[] s, int x){
        if (s == null) return null;
        if (s.length <= x){
            System.out.println("Não existe esse elemento na array de Strings.");
            return null;
        }
        s[x] = null;
        for (int i=x; i<s.length-1; i++)
            s[i] = s[++x];
        s[s.length-1] = null;
//        for (int i=0; i<s.length; i++){
//            if (i == x+1){
//                if ((x+1) == s.length-1){
//                    s[x] = s[i];
//                    x = i;
//                }
//            }
//        }
//        for (int i=0; i<s.length; i++)
//            if (i < s.length-1)
//                if (s[i] == null)
//                    if (s[i+1] != null){
//                        s[i] = s[i+1];
//                        s[i+1] = null;
//                    }
        return s;
    }

    public void exercicio21(double[] d){
        for (int i=0; i<d.length; i++)
            if (d[i] >= 0)
                System.out.println(i);
    }
}
