public class ContaFacebook {
    private String URL, nomeUser, senha;

    public ContaFacebook(String URL, String nomeUser, String senha) {
        this.URL = URL;
        this.nomeUser = nomeUser;
        this.senha = senha;
    }

    public String getURL() {
        return URL;
    }

    public void setURL(String URL) {
        this.URL = URL;
    }

    public String getNomeUser() {
        return nomeUser;
    }

    public void setNomeUser(String nomeUser) {
        this.nomeUser = nomeUser;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        if (Teclado.leString("Digite a antiga senha: ").equals(senha)){
            this.senha = senha;
            System.out.println("Senha alterada com sucesso!");
        }
        else System.out.println("Senha para a troca de senha inválida!");

    }

    @Override
    public String toString() {
        return "ContaFacebook{" +
                "URL='" + URL + '\'' +
                ", nomeUser='" + nomeUser + '\'' +
                ", senha='" + senha + '\'' +
                '}';
    }
}
