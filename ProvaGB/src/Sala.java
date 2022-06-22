public class Sala {
    private String nome;
    private Cadeira[] cadeiras;

    public Sala(String nome, int quantCadeiras) {
        this.nome = nome;
        this.cadeiras = new Cadeira[quantCadeiras];
        for (int i=0; i<cadeiras.length; i++){
            double teste = Math.random();
            if (teste < 0.5){
                int R = (int)(Math.random() * 255)+1;
                int G = (int)(Math.random() * 255)+1;
                int B = (int)(Math.random() * 255)+1;
                double largura = (Math.random() * 10);
                double profundidade = (Math.random() * 10);
                cadeiras[i] = new CadeiraComMesa(new Cor(R, G, B), largura, profundidade);
            }
            else{
                int R = (int)(Math.random() * 255)+1;
                int G = (int)(Math.random() * 255)+1;
                int B = (int)(Math.random() * 255)+1;
                int dia = (int)(Math.random() * 30)+1;
                int mes = (int)(Math.random() * 12)+1;
                int ano = (int)(Math.random() * 2023)+1;
                cadeiras[i] = new CadeiraComRodinhas(new Cor(R, G, B), new Data(dia, mes, ano));
            }
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Cadeira[] getCadeiras() {
        return cadeiras;
    }

    public void setCadeiras(Cadeira[] cadeiras) {
        this.cadeiras = cadeiras;
    }

    @Override
    public String toString() {
        String listaCad = "";
        for (int i=0; i<cadeiras.length; i++)
            listaCad += cadeiras[i] + "\n";
        return "Sala{" +
                "nome='" + nome + '\'' +
                ", cadeiras=" + listaCad +
                '}';
    }

    public int cadeirasComMesaDisponiveis(){
        int cadeirasLivres = 0;
        for (int i=0; i<cadeiras.length; i++)
            if (cadeiras[i].getAlunoCad() == null)
                cadeirasLivres ++;
        return cadeirasLivres;
    }

    public int cadeirasComRodinhasDisponiveis(){
        int cadeirasComRodinhasLivres = 0;
        for (int i=0; i<cadeiras.length; i++)
            if (cadeiras[i] instanceof CadeiraComRodinhas)
                if (cadeiras[i].getAlunoCad() == null)
                    cadeirasComRodinhasLivres ++;
        return cadeirasComRodinhasLivres;
    }

    public String entraAluno(Aluno al, String tipoCad){
        String cad = "";
        if (tipoCad.equalsIgnoreCase("mesa")) cad = "CadeiraComMesa";
        else cad = "CadeiraComRodinhas";
        boolean tipoCerto = false;
        boolean tipoErrado = false;
        for (int i=0; i<cadeiras.length; i++)
            if (cadeiras[i].getAlunoCad() == null){
                if (tipoCad.equalsIgnoreCase("mesa"))
                    if (cadeiras[i] instanceof CadeiraComMesa){
                        cadeiras[i].setAlunoCad(al);
                        if (cad.equalsIgnoreCase("mesa")) tipoCerto = true;
                        else tipoErrado = true;
                    }
                else
                    if (cadeiras[i] instanceof CadeiraComRodinhas){
                        cadeiras[i].setAlunoCad(al);
                        if (cad.equalsIgnoreCase("rodinha")) tipoCerto = true;
                        else tipoErrado = true;
                    }
                break;
            }
        if (tipoCerto) return "ocupou a cadeira desejada";
        if (tipoErrado) return "ocupou outro tipo de cadeira";
        return "não ocupou cadeira alguma";
    }
}
