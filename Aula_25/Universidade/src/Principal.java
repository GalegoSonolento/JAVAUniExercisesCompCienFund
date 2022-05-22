public class Principal {
    public static void main(String[] args){
        Universidade[] uni = new Universidade[Teclado.leInt("Digite quantas universidades você quer cadastrar: ")];

        for (int i=0; i< uni.length; i++){
            int opcao = Teclado.leInt("Digite 1 para criar uma universidade pública e 2 para criar uma privada: ");
            if (opcao == 1)
                uni[i] = new Publica(Teclado.leString("Digite o nome da universidade: "), Teclado.leInt("Digite a quantidade de alunos da universidade: "), Teclado.leInt("Digite a quantidade de professores da universidade: "), Teclado.leString("Digite o estado da universidade [RS/RN/...]: "), Teclado.leString("Digite o nome da cidade: "));
            else if (opcao == 2)
                uni[i] = new Particular(Teclado.leString("Digite o nome da universidade: "), Teclado.leInt("Digite a quantidade de alunos: "), Teclado.leInt("Digite q quantidade de professores: "), Teclado.leDouble("Digite o preço total da mensalidade: "));
        }

        MEC mec = new MEC();
        mec.imprimeuniversidades(uni);
        mec.maisCara(uni);
        mec.universidadesDoSul(uni);
    }
}
