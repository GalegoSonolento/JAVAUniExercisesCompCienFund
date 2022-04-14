public class Teste{
    public static void main(String [] args){
        Pessoa pessoa1 = new Pessoa(Teclado.leString("Digite o nome de uma pessoa: "), new Aquario());
        
        pessoa1.getAquarioPes().setPeixe1(new Peixe("Flick", new Cor("Azul", 135, 206, 250), "beta"));
        pessoa1.getAquarioPes().setPeixe2(new Peixe("Losh", new Cor("Verde", 0, 255, 127), "bagre"));
        pessoa1.getAquarioPes().setTamMetros2(220);
        
        System.out.println(pessoa1.getAquarioPes().tamanhoSuficiente() == false ? "O aquário não tem espaço para o(s) peixe(s)" : "O aquário tem espaço para o(s) peixe(s)");
        pessoa1.getAquarioPes().getPeixe2().setRaca(Teclado.leString("Altere o registro da raça do peixe 2: "));
        
        pessoa1.getAquarioPes().imprimeCores();
    }
}