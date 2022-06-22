import javax.swing.*;
import java.awt.Color;

public class Principal {
    public static void main(String[] args){
        Sala sala1 = new Sala(Teclado.leString("Digite o nome da sala: "), (int)(Math.random() * 20) + 1);

        System.out.println(sala1);
        System.out.println(" ");

        System.out.println(" ");
        System.out.println("====================");
        String[] nomes = {"Estanislau", "Lindomar", "Bartolomeu", "Ângela", "Lucimara", "Anaclécia"};
        System.out.println("Lista de possíveis nomes de alunos: ");
        for (int i=0; i< nomes.length; i++) System.out.println(nomes[i]);
        System.out.println("\n");
        String tipoCad = "";
        for (int i=0; i<20; i++){
            double teste = Math.random();
            Aluno al = new Aluno(nomes[(int)(Math.random() * nomes.length)], (int)(Math.random() * 100) + 1);
            if (teste < 0.5) System.out.println("O aluno "+al.getNome()+" "+sala1.entraAluno(al, "mesa"));
            else System.out.println("O aluno "+al.getNome()+" "+sala1.entraAluno(al, "rodinha"));
        }
        System.out.println(" ");

        System.out.println(" ");
        System.out.println("====================");
        System.out.println(" ");
        Cadeira[] cadeirasLocal = sala1.getCadeiras();
        for (int i=0; i<cadeirasLocal.length; i++)
            if (cadeirasLocal[i] instanceof CadeiraComMesa){
                double areaMesa = ((CadeiraComMesa) cadeirasLocal[i]).getLargura() * ((CadeiraComMesa) cadeirasLocal[i]).getProfundidade();
                System.out.println("A área da cadeira com mesa "+(i+1)+" é: "+areaMesa);
            }
        System.out.println(" ");
        System.out.println("====================");
        System.out.println(" ");

        System.out.println(" ");
        System.out.println("====================");
        System.out.println(" ");
        for (int i=0; i<cadeirasLocal.length; i++)
            if (cadeirasLocal[i] instanceof CadeiraComRodinhas){
                Data dataManutencao = ((CadeiraComRodinhas) cadeirasLocal[i]).getUltimaManutencao();
                System.out.println("A última manutenção da mesa "+(i+1)+" foi em: "+dataManutencao);
            }
        System.out.println(" ");
        System.out.println("====================");
        System.out.println(" ");
        int R2 = 0;
        int G2 = 0;
        int B2 = 0;
        String nomeAl = Teclado.leString("Digite um dos nomes dados na lista acima: ");
        //O programa vai pegar o primeiro que tiver aquele nome, já q a lista é pequena e eu não fiz sobrenome;
        for (int i=0; i< cadeirasLocal.length; i++){
            if (cadeirasLocal[i].getAlunoCad().getNome().equalsIgnoreCase(nomeAl)){
                R2 = cadeirasLocal[i].getCorCad().getR();
                G2 = cadeirasLocal[i].getCorCad().getG();
                B2 = cadeirasLocal[i].getCorCad().getB();
                break;
            }
        }
        JFrame a = new JFrame();
        a.setSize(200, 200);
        JPanel j = new JPanel();
        j.setBackground(new Color(R2, G2, B2));
        a.add(j);
        a.setVisible(true);
    }
}
