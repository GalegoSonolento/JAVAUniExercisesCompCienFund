import java.util.Arrays;

public class Usuario extends ContaFacebook{
    private Pessoa[] amigos;

    public Usuario(String URL, String nomeUser, String senha, Pessoa[] amigos) {
        super(URL, nomeUser, senha);
        amigos = new Pessoa[1000];
    }

    public Pessoa[] getAmigos() {
        return amigos;
    }

    public void setAmigos(Pessoa[] amigos) {
        this.amigos = amigos;
    }

    @Override
    public String toString() {
        String retorno = "";
        for (int i=0; i< amigos.length;i++){
            retorno += amigos[i] + "  ";
        }
        return "FanPage{" +
                "URL='" + super.getURL() + '\'' +
                ", nomeUser='" + super.getNomeUser() + '\'' +
                ", senha='" + super.getSenha() + '\'' +
                ", amigos=" + retorno + '\'' +
                '}';
    }

    public boolean insereAmigo(Pessoa amigo){
        boolean resposta = false;
        for (int i=0; i< amigos.length; i++)
            if (amigos[i] == null){
                amigos[i] = amigo;
                resposta = true;
                break;
            }
        return resposta;
    }
}
