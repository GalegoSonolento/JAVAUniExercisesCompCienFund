public class FanPage extends ContaFacebook{
    private int quantCurtidas;

    public FanPage(String URL, String nomeUser, String senha, int quantCurtidas) {
        super(URL, nomeUser, senha);
        this.quantCurtidas = quantCurtidas;
    }

    public int getQuantCurtidas() {
        return quantCurtidas;
    }

    public void setQuantCurtidas(int quantCurtidas) {
        this.quantCurtidas = quantCurtidas;
    }

    @Override
    public String toString() {
        return "FanPage{" +
                "URL='" + super.getURL() + '\'' +
                ", nomeUser='" + super.getNomeUser() + '\'' +
                ", senha='" + super.getSenha() + '\'' +
                ", quantCurtidas=" + quantCurtidas + '\'' +
                '}';
    }
}
