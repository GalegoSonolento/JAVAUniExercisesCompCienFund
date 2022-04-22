public class ContaCorrente{
    private String numConta;
    private double saldo;
    
    public ContaCorrente(String numConta, double saldo){
        this.numConta = numConta;
        this.saldo = saldo;
    }
    
    public String getNumConta(){
        return numConta;
    }
    public double getSaldo(){
        return saldo;
    }
    
    public void setNumConta(String numConta){
        this.numConta = numConta;
    }
    public void setSaldo(double saldo){
        this.saldo = saldo;
    }
    
    public void imprimeInfo(){
        System.out.println("====="+"\n"+"OS DADOS DA CONTA SÃO: "
        +"\n"+"Número da conta: "+numConta+"\n"+
        "Saldo restante: "+saldo);
    }
    
    public void efetuaDeposito(double deposito){
        if (deposito >= 0) this.saldo = saldo+deposito;
        else System.out.println("A operação não pode ser efetuada!");
    }
    
    public void efetuaSaque(double saque){
        if (saque < 0) System.out.println("A operação não pode ser realizada!");
        else if (saque > saldo) System.out.println("A operação não pode ser realizada! Não é possível realizar um saque maior do que o saldo em conta.");
        else this.saldo = saldo-saque;
    }
}

























