public class Aquario{
    private double tamMetros2;
    private Peixe peixe1;
    private Peixe peixe2;
    private Peixe peixe3;
    
    public Aquario(){
        this.tamMetros2 = -1;
    }
    public Aquario(double tamMetros2, Peixe peixe1, Peixe peixe2, Peixe peixe3){
        this.tamMetros2 = tamMetros2;
        this.peixe1 = peixe1;
        this.peixe2 = peixe2;
        this.peixe3 = peixe3;
    }
    public Aquario(double tamMetros2, Peixe peixe1){
        this.tamMetros2 = tamMetros2;
        this.peixe1 = peixe1;
    }
    public Aquario(double tamMetros2, Peixe peixe1, Peixe peixe2){
        this.tamMetros2 = tamMetros2;
        this.peixe1 = peixe1;
        this.peixe2 = peixe2;
    }
    
    public double getTamMetros2(){
        return tamMetros2;
    }
    public Peixe getPeixe1(){
        return peixe1;
    }
    public Peixe getPeixe2(){
        return peixe2;
    }
    public Peixe getPeixe3(){
        return peixe3;
    }
    
    public void setTamMetros2(double tamMetros2){
        this.tamMetros2 = tamMetros2;
    }
    public void setPeixe1(Peixe peixe1){
        this.peixe1 = peixe1;
    }
    public void setPeixe2(Peixe peixe2){
        this.peixe2 = peixe2;
    }
    public void setPeixe3(Peixe peixe3){
        this.peixe3 = peixe3;
    }
    
    public String toString(){
        if (tamMetros2 == -1) return "O aquário possui -1m² e não possui peixes";
        if (tamMetros2 != -1){
            if (peixe1 == null && peixe2 == null && peixe3 == null) return "O aquário possui "+tamMetros2+"m², mas não possui nenhum peixe.";
            if (peixe1 != null && peixe2 == null && peixe3 == null) return "O aquário possui "+tamMetros2+"m² e possui um peixe, cujos dados são: "+peixe1.toString();
            if (peixe1 != null && peixe2 != null && peixe3 == null) return "O aquário possui "+tamMetros2+"m² e possui dois peixes, cujos dados são: "+peixe1.toString()+"\n"+"E: "+peixe2.toString();
            if (peixe1 != null && peixe2 != null && peixe3 != null) return "O aquário possui "+tamMetros2+"m² e possui três peixes, cujos dados são: "+peixe1.toString()+"\n"+"Junto de: "+peixe2.toString()+"\n"+"E: "+peixe3.toString();
        }
        return null;
    }
    
    public boolean tamanhoSuficiente(){
        int quant = 0;
        if (peixe1 != null) quant++;
        if (peixe2 != null) quant++;
        if (peixe3 != null) quant++;
        
        if (tamMetros2 >= quant * 3) return true;
        else if (tamMetros2 < quant * 3) return false;
        
        return false;
    }
    
    public void imprimeCores(){
        String cores = "";
        if (peixe1 != null) cores+="["+peixe1.getCorPeixe()+"]";
        if (peixe2 != null) cores+="["+peixe2.getCorPeixe()+"]";
        if (peixe3 != null) cores+="["+peixe3.getCorPeixe()+"]";
        System.out.println(cores.equals("") ? "Não existem peixes no aquário." : "As cores são: "+cores);
    }
}
















