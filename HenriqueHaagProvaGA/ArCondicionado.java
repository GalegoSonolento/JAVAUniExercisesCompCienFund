//Henrique Vinícius Haag
public class ArCondicionado {
	private int tempmin, tempmax, tempatual;
	private boolean quentefrio;
	
	//Esse construtor tem apenas as temperaturas mínimas e máximas, conforme foi pedido no exercício:
	public ArCondicionado(int tempmin, int tempmax) {
		if (tempmin > tempmax) {
			this.tempmin = 16;
			this.tempmax = 30;
		}
		else {
			this.tempmin = tempmin;
			this.tempmax = tempmax;
		}
		this.tempatual = (tempmin + tempmax) / 2;
	}
	
	//Getters e setters
	public int getTempmin() {
		return tempmin;
	}
	public void setTempmin(int tempmin) {
		this.tempmin = tempmin;
	}
	public int getTempmax() {
		return tempmax;
	}
	public void setTempmax(int tempmax) {
		this.tempmax = tempmax;
	}
	public int getTempatual() {
		return tempatual;
	}
	public boolean isQuentefrio() {
		return quentefrio;
	}
	
	//Esse imprimir informações estar mais bonito que o toString tem a mesma razão da classe Produto, foi só porque eu usei.
	public void impInformacoes() {
		System.out.println("-=-=-=");
		System.out.println("Informações do ar condicionado: "+"\n"+
		"- Temperatura mínima: "+tempmin+"\n"+
		"- Temperatura máxima: "+tempmax+"\n"+
		"- Temperatura atual: "+tempatual+"\n"+
		"- Quente/Frio: "+(quentefrio ? "Sim" : "Não"));
		System.out.println("-=-=-=");
	}
	
        /*Esse método aqui foi criado única e exclusivamente para atender a ordem de que, apesar do 
        método de setar a temperatura atual ter um tipo de segurança para manter o tempatual dentro 
        do escopo de temperatura, eu preciso GARANTIR que a impressão do usuário vai atender essas
        características. */
        public int garanteTempAtual(){
            int novaatual = 0;
            do {
                novaatual = Teclado.leInt("Digite a nova temperatura atual: ");
            }while(novaatual < this.tempmin || novaatual > this.tempmax);
            return novaatual;
        }
	
        //Método chave pedido nos exercícios. 
	public boolean ajustaTemperaturaAtual(int x) {
		boolean tempusada = true;
		if (x < tempmin) {
			this.tempatual = tempmin;
			tempusada = false;
		}
		else if (x > tempmax) {
			this.tempatual = tempmax;
			tempusada = false;
		}
		else this.tempatual = x;
		return tempusada;
	}
}
