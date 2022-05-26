public class Festa {
    private Pessoa[] festa;

    public Festa(int quantMaxPessoa){
        festa = new Pessoa[quantMaxPessoa];
    }

    public Pessoa[] getFesta(){
        return festa;
    }
    public void setFesta(Pessoa[] festa){
        this.festa = festa;
    }

    public void imprimePessoasFesta(){
        if (festa == null) System.out.println("Não há pessoas na festa.");
        else
            for (int i=0; i< festa.length; i++)
                if(festa[i] != null)
                    if (festa[i] instanceof Mulher) System.out.println(((Mulher)festa[i]).toString());
                    else if (festa[i] instanceof Homem) System.out.println(((Homem)festa[i]).toString());
    }

    public boolean entraPessoa(Pessoa p){
        for (int i=0; i< festa.length; i++)
            if (festa[i] == null){
                festa[i] = p;
                return true;
            }
        return false;
    }

    public Pessoa[] procuraMulheres() {
        int cont = 0;
        Pessoa[] apenasMulheres;
        for (int i = 0; i < festa.length; i++) {
            if (festa[i] instanceof Mulher) {
                cont++;
            }
        }
        if (cont == 0) return null;
        apenasMulheres = new Pessoa[cont];
        int pos = 0;
        for (int i = 0; i < festa.length; i++)
            if (festa[i] instanceof Mulher)
                apenasMulheres[pos++] = festa[i];
        return apenasMulheres;
    }

    public void imprimeTimeHomens(){
        boolean temHomens = false;
        for (int i=0; i< festa.length; i++)
            if (festa[i] instanceof Homem) {
                System.out.println(((Homem) festa[i]).getTime().toString());
                temHomens = true;
            }
        if (!temHomens) System.out.println("Não existem homens na festa.");
    }

    public void achaParPerfeito(){
        boolean temHomem = false;
        if (festa != null){
            for (int i=0; i< festa.length; i++)
                if (festa[i] instanceof Homem){
                    temHomem = true;
                    System.out.println("Mulheres que se encaixam no perfil de "+festa[i].getNome());
                    for (int j=0; j<festa.length; j++)
                        if (festa[j] instanceof Mulher)
                            if (((Homem) festa[i]).getCorCabeloPreferida().equalsIgnoreCase(((Mulher) festa[j]).getCorDoCabelo()))
                                if (festa[i].getIdade() > festa[j].getIdade())
                                    System.out.println(festa[j].getNome()+", "+(festa[i].getIdade() - festa[j].getIdade())+" anos de diferença. (ELE é mais velho)");
                                else if (festa[i].getIdade() < festa[j].getIdade())
                                    System.out.println(festa[j].getNome()+", "+(festa[j].getIdade() - festa[i].getIdade())+" anos de diferença. (ELA é mais velha)");
                }
            if (!temHomem) System.out.println("Não existem homens na festa.");
        }
        else System.out.println("Não existem pessoas na festa. ");
    }
}
