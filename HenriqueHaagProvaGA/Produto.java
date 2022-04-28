//Henrique Vinícius Haag
public class Produto {
	private String nome, marca;
	private double preco;
	private boolean importado;
	
	//Método construtor com todos os atributos:
	public Produto(String nome, String marca, double preco, boolean importado) {
		this.nome = nome;
		this.marca = marca;
		this.preco = preco;
		this.importado = importado;
	}

	//Getters e Setters.
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	public boolean isImportado() {
		return importado;
	}
	public void setImportado(boolean importado) {
		this.importado = importado;
	}
	
	//Esse imprime info foi feito mais bonito que o método toString só porque eu usei ele mais tarde nos testes.
	public void imprimeInfo() {
		System.out.println("-=-=-=-=");
		System.out.println("Informações do produto: "+nome+"\n"+
		"- Marca: "+marca+"\n"+
		"- Preço: "+preco+"\n"+
		"- Importado: "+(importado ? "Sim" : "Não"));
		System.out.println("-=-=-=-=");
		
	}
	
        //Método toString básico:
	public String toString() {
		return "Produto [nome=" + nome + ", marca=" + marca + ", preco=" + preco + ", importado=" + importado + "]";
	}
}
