public class Cronometro {
    private int min = 0;
    private int seg = 0;
    private int h = 0;
    public void relogio(){
        System.out.println("Para qual horario deseja que o cronometro pare? ");
        int limH = Teclado.leInt("Digite a hora: ");
        int limMin = Teclado.leInt("Digite os minutos: ");
        int limSeg = Teclado.leInt("Digite os segundos: ");
        while(true){
            seg = seg + 1;
            if (seg == 60){
                min = min + 1;
                seg = 0;
            }
            if (min == 61){
                h = h + 1;
                min = 0;
                seg = 0;
            }
            if (h > 99) break;
            if (h < 10){
                if (min < 10){
                    if (seg < 10) System.out.println("0"+h + ":" + "0"+min + ":" + "0"+seg);
                    else if (seg >= 10) System.out.println("0"+h + ":" + "0"+min + ":" + seg);
                }
                else if (min >= 10){
                    if (seg < 10) System.out.println("0"+h + ":" + min + ":" + "0"+seg);
                    else if (seg >= 10) System.out.println("0"+h + ":" + min + ":" + seg);
                }
            }
            else if (h >= 10) {
                if (min < 10) {
                    if (seg < 10) System.out.println(h + ":" + "0" + min + ":" + "0" + seg);
                    else if (seg >= 10) System.out.println(h + ":" + "0" + min + ":" + seg);
                } else if (min >= 10) {
                    if (seg < 10) System.out.println(h + ":" + min + ":" + "0" + seg);
                    else if (seg >= 10) System.out.println(h + ":" + min + ":" + seg);
                }
            }
            if (limH == h && limMin == min && limSeg == seg){
                System.out.println("Times' up!");
                break;
            }
            try{
                Thread.sleep(1000);
            }catch(Exception e){}
        }
    }
}
