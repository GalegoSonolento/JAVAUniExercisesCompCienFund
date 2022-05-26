public class Baralho {
    private Carta[] espadas = new Carta[13], paus = new Carta[13], copas = new Carta[13], ouros = new Carta[13], coringa = new Carta[4];
    public Baralho() {
        Carta[] baralho = new Carta[56];
        for (int i=0; i<baralho.length; i++){
            for (int j=0; i<13; j++){
                baralho[i] = new Carta(j+1, "Espadas");
            }
            for (int k=0; i >= 13 && i < 26; k++){
                baralho[i] = new Carta(k+1, "Paus");
            }
            for (int p=0; i >= 26 && i < 39; p++){
                baralho[i] = new Carta(p+1, "Copas");
            }
            for (int s=0; i >= 39 && i < 52; s++){
                baralho[i] = new Carta(s+1, "Ouros");
            }
            for (int v=0; i >= 52; v++){
                baralho[i] = new Carta("Coringa", "Coringa");
            }
        }
    }
}
