public class Principal {
    public static void main(String[] args){
        Festa festa = new Festa(10);

        String[] nomesMulheres = {"Ana", "Letícia", "Ricarda", "Amanda", "Júlia", "Rafaela", "Anaclécia", "Clara", "Carla", "Carol", "Isadora"};
        String[] nomesHomens ={"Alemão", "Ricardito", "Antônio", "Petrônio", "Estanislau", "Andrés", "Pedro", "Júlio", "Arnaldo"};
        String[] coresCabelo = {"Ruivo", "Loiro", "Moreno", "Vermelho", "Branco", "Castanho"};
        String[] sobrenomes = {"Lewandovsky", "Teixeira", "Moreira", "Mariani", "Schneider", "Oliveira", "Bittencourt"};
        String[] times = {"Internacional", "Grêmio", "Juventude", "Barcelona", "PSG", "Real Madrid", "Hamburgo", "Manchester City"};

        for (int i=0; i<13; i++){
            Pessoa p;
            int idade = (int)(Math.random()*100+1);
            String corCabelo = coresCabelo[(int)(Math.random()* coresCabelo.length)];
            if (Math.random() < 0.5)
                p = new Mulher(nomesMulheres[(int)(Math.random()* nomesMulheres.length)]+" "+sobrenomes[(int)(Math.random()* sobrenomes.length)], idade, corCabelo);
            else
                p = new Homem(nomesHomens[(int)(Math.random()* nomesHomens.length)]+" "+sobrenomes[(int)(Math.random()* sobrenomes.length)], idade, new Time(times[(int)(Math.random()* times.length)], 0, 0), corCabelo);
            if (festa.entraPessoa(p)) System.out.println("A pessoa "+p.getNome()+" entrou na festa");
            else System.out.println("A pessoa "+p.getNome()+" não entrou na festa");
        }
        System.out.println(" ");

        System.out.println("========== Informações das pessoas na festa ==========");
        festa.imprimePessoasFesta();
        System.out.println("====================");
        System.out.println(" ");

        System.out.println("=-=-=-=-=- Informações das mulheres da festa -=-=-=-=-=");
        Pessoa[] mulheres = festa.procuraMulheres();
        if (mulheres == null) System.out.println("Não existem mulheres na festa");
        else
            for (int i=0; i< mulheres.length; i++)
                System.out.println(mulheres[i]);
        System.out.println("-=-=-=-=-=-=-=-=-=-=");
        System.out.println(" ");

        System.out.println("========== Times dos homens da festa ==========");
        festa.imprimeTimeHomens();
        System.out.println("-=-=-=-=-=-=-=-=-=-=");
        System.out.println(" ");

        System.out.println("========== Pares perfeitos da festa ==========");
        festa.achaParPerfeito();
        System.out.println("-=-=-=-=-=-=-=-=-=-=");
        System.out.println(" ");
    }
}
