public class Facebook {
    private ContaFacebook[] contas;

    public Facebook(int quantContas){
        contas = new ContaFacebook[quantContas];
    }

    public boolean insereConta(ContaFacebook conta){
        for (int i=0; i<contas.length; i++)
            if (contas[i] == null){
                contas[i] = conta;
                return true;
            }
        return false;
    }

    public void imrpimeInformacoesContas(){
        for (int i=0; i< contas.length; i++)
            System.out.println(contas[i]);
    }

    public void imprimeURLFanpages(){
        for (int i=0; i< contas.length; i++)
            if (contas[i] instanceof FanPage)
                System.out.println(((FanPage)contas[i]).getURL());
    }
}
