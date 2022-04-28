# JAVAUniExercisesCompCienFund
Exercises I did during my curse of algorithm basics course at Unisinos in JAVA, using BlueJ

Aula 11 e 12– 28-30/03/2022
JAVA

	Linguagem fortemente tipadas
- Alguns cuidados são necessários
- - Ela exige mais do programador

	IDE
- Integrated Development Environment
- Tem tudo que precisa pra programar em uma linguagem específica
- Instalado na máquina 
- JAVA é uma linguagem compilada 
- Já tem compilador, local de edição e prompt de comando
- Permite fazer tudo em um único espaço 
- JTK – kit de desenvolvedor de JAVA
- JVM – local de execução do JAVA
- Tem q instalar o JAVA e a IDE
- Bluej vai ser usado até o final do grauB, mas ele obriga a fzr tudo na mão

	Usando o JAVA
- Pra criar uma classe tem que usar a função ‘class’
- O código n fica solto
- As classes sempre devem ter a primeira letra maiúscula
- As classes começam TODAS com a letra maiúscula
- As iniciais das próximas palavras tbm são maiúsculas
- Não precisa necessariamente do nome do projeto
- No java, em vez de usar indentação, usa-se chaves para identificar os blocos. Mas é uma boa prática identar igual – fica mais bonito e legível
- O java tem separadores específicos (as chaves)
- Void -> tipo de retorno (sem) – faz a mesma coisa que o return do python
- A maioria das linguagens usa ‘print’ pra colocar algo na tela, java tbm
- Os parâmetros permitem apenas exatamente aquilo que foram escritos pra receber
- Array é um parâmetro
- Todas as linhas de código terminam com um ponto e vírgula
- No java tem diferença entre aspas simples e duplas (apenas a dupla funciona como string)
- Dá pra escrever tudo em uma linha, msm q isso n faça sentido 
- Entregar o programa todo alinhado pra esquerda resulta em zero (tem q fzr o código bonito sempre)
- O nome da classe deve ser o mesmo nome do arquivo (sempre)
- Quando compila o java cria um arquivo.class (executável)
- O código fonte sempre vão ficar todos juntos na pasta
- Para entregar os trabalhos tem que entregar a pasta toda compactada
- O blueJ vai ter um terminar de execução 
- Ele coloca uma saída em cima da outra (sempre limpar antes da saída do método)
- O sistema de println quebra a linha automaticamente, mas se usa o \n tbm funciona
- Classes sempre tem a primeira letra maiúscula automaticamente
- Textos em java (Strings) são classes
- Quando não compila o erro aparece
- Tipos sem letra maiúscula são tipos primitivos
- int - inteiro
- double – mesma coisa que o float – precisa de identificação f e ocupa menos espaço (ponto flutuante)
- String – é um tipo, mas não primitivo – strings são conjuntos de chars (array) – sempre dentro de aspas duplas
- char – apenas um caracter – sempre dentro de aspas simples
- boolean – T e F sã minúsculos
- Comentário de linha = //
- comentário de bloco = /* código comentado */

	Variáveis 
- É a mesma coisa basicamente
- Mesmas regras do python

	Declaração de variáveis
- Antes de usar uma variável ela precisa ser declarada – dizer que existe e o tipo dela
- double salario;
- Cada variável é exclusivamente única e não pode ter o tipo mudado
    - int n1;
    String nome
    boolean false

	Expressões 
- Mudança apenas nas lógicas
   - e lógico = &&
   - ou | |
   - negação !
- Não dá pra só retornar a parte inteira da divisão 
- Regra de precedência é igual



ORIENTAÇÃO A OBJETOS
	Programas em java exigem a criação de classes e métodos

	Problemas são feitos em módulos
- Sistema é dividido em várias partes
- Maneiras de separar todas as funções com suas similaridades
- São módulos independentes entre si
- Mas o sistema funciona associando todos os módulos colocados
- Características semelhantes são atributos, que são características presentes no objetos 
- Todos os participantes de uma mesma classe tem as mesma características (com valores que podem ser diferentes)
- As classes definem como os objetos se comportam  definem atributos e métodos
- As classes criam os objetos
- Todos os objetos derivados de uma classe executam as ações que são por ela definidas
- Instância = Um objeto criado a partir de uma classe

	Montagem da classe
-  A classe é definida com os atributos colocados no meio do código 
- Visibilidade de um atributo (membros da classe)
- Um membro sem visibilidade específica é public por default
- Existem duas visibilidades 
  - pública
    - Todos podem acessar
    - Classes externas normalmente são públicas 
    - Aqui estão a maioria dos métodos
  - privada
    - normalmente onde são colocados os atributos
    - Só pode ser acessada dentro de uma classe específica – apenas os objetos associados àquela classe podem acessar as características 
- É possível criar quantos instâncias forem necessárias (objetos)

	Método main
- Método principal publlic static void main {}
- Identifica o começo do programa
- Todo programa em Java começa pelo método main
- Quando existem vários mains eu preciso indicar se ele funciona
- Várias classes podem ter main para testes

	Toda variável criada com um tipo definido (ele tem que ser tipada) sem definição de valor tem um valor padrão 
- String = null – uma classe não instanciada 
- int = 0 – valor padrão 
- boolean = false - padrão
- double = 0.0 – valor padrão
- char = 0

	Criação de instância
new NomeDaClasse();
- new é um termo reservado da linguagem

	Atributos 
- Definem as características dos atributos 
- São sempre permanentes, ficam na memória até o objeto morrer
- Variáveis globais
- O escopo delas é toda a classe
- Declaradas no corpo da classe
- As variáveis tem o mesmo nome dos atributos 

	Métodos 
- O nome do criador do é método é construtor e ele constrói o objeto
- O método construtor é definido implicitamente, sem parâmetros
- Método padrão de construtor é: NomeDoMetodo() {}
- Mesmo que uma classe não seja criada o método tá lá pronto
- public por default
- Toda vez que der um um ‘new’ com o nome da classe mas tu chama o construtor padrão do java
- O construtor tem o mesmo nome da classe
- Não existe nenhum tipo de retorno – único método sem retorno
- O construtor é acionado na construção do objeto
- Os parâmetros do construtor são passados ao objeto
- O método cria um objeto
- Os parâmetros possuem variáveis locais, o escopo é apenas o método (somem depois da execução do método)
- Os métodos sempre tem a mesma construção, o que muda são os parâmetros -> colocar mais de um tipo de criação de objetos na mesma classe é chamado de sobrecarga

	Parâmetros de entrada
- Pra colocar informações dentro do método que o próprio método ainda n tem
- Trazer informações de fora
- Informações que o método não conhece

	Objetos
- Toda vez que se dá new, o objeto está na memória
- Ter parâmetros nos métodos permite que os objetos tenham conteúdos diferentes 
- Toda vez que der new, cria-se um objeto novo, mesmo que tenham os mesmos valores 

	Escopo de uma variável
- Onde é possível acessá-la
- O que os métodos podem acessar
- Os atributos tem o escopo global da classe 
- Os parâmetros dos métodos (construtores ou não) tem alcance limitado no metodo

	Uso do this.
- this. Na frente de qualquer membro ou método fala que deste objeto chama o atributo ou método da classe tal
- O this. Faz uma referência a classe, nunca ao método ou objeto
- O operador ‘.’ É uma ferramenta de acesso a algo

	Métodos de acesso à atributos
- Get e set
- getters -> pega o valor do atributo
- setter -> altera, setar o atributo

	get
- Não tem parâmetro de entrada
- boa prática:
  - Sempre que o get for de um boolean -> em vez de usar get, usar is (por questões de gramática)

	set
- Métodos de retorno do set sempre vai ser void
- Até dá pra ter retorno em um método void, ele só n pode ter valor, mas não faz sentido 
- Sempre vai pedir o parâmetro, do mesmo jeito que muda o atributo no criador de objeto

-> Classe Teclado
- A classe vai ser muito usada mas eu vou aprender a entender ela inteira conforme
as aulas acontecem

-> Sobrecarga
- Vários métodos que fazem a mesma coisa e são iguais, mas que recebem parâmetros 
diferentes 

-> ToString
- Representação de forma String da posição de memória em que o objeto se encontra
- Existe uma classe mãe de todas, a "object", nela existe um método chamado ToString -> representa o objeto na forma de String
- O padrão é mostrar a posição de momória
- Dá pra trocar o que o ToString mostra quando chamado

==-- WHILE --==

-> Funciona igual um while de python, mas obviamente tem a sintaxe do if 
- As aspas no caso 
- Também tem o esquema das chaves
    - Se o sistema do while tiver apenas uma linha, não precisa delas, mas sabe né, se tiver mais linhas dentro (do chamamento) elas se fazem necessárias
- Usado para repetições que eu não sei quantas vezes repetirão
- Sempre pode virar um for 

==-- FOR --==

- Um jeito muito parecido de fazer um while
- A variável 
- O for sempre vai usar uma variável que ainda não existe 
- A sintaxe dele é diferente 
- Usado quando se sabe quantas vezes o código vai precisar repetir 
- Sempre pode transformar em while 
- Normalmente se usa i dentro do for (convenção)
- Existe uma preferência nos nomes das variáveis (i > j > k > ...)
- for (variável ; condição ; atualização da variável)
- NÃO FAÇA UM FOR COM TUDO VAZIO -> é só um while true, se fizer isso fica feio
- Usar if ternário lá dentro tbm fica feio
- Dá pra usar break
- O for sempre precisa de, pelo menos, dois pontos e vírgula
- O esquema das chaves é o mesmo
- Esse for é muito mais um while do que no python que era uma leitura de lista
- For só funciona com int 

-> do{


} while (cond)
- Diferença -> o while teste, se na primeira vez for falso, enm executa -> muito útil para menus
- O do{}while sempre vai passar pelo menos uma vez pelo bloco de código e depois testa
- Depois do 'do' sempre é necessário as chaves
