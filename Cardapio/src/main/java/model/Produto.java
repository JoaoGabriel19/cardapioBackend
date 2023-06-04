package model;

public class Produto {
	String nome;
	String descricao;
	float preco;
	String glutem;
	int calorias;
	String imagem;
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public float getPreco() {
		return preco;
	}
	public void setPreco(float preco) {
		this.preco = preco;
	}
	public String getGlutem() {
		return glutem;
	}
	public void setGlutem(String glutem) {
		this.glutem = glutem;
	}
	public int getCalorias() {
		return calorias;
	}
	public void setCalorias(int calorias) {
		this.calorias = calorias;
	}
	public String getImagem() {
		return imagem;
	}
	public void setImagem(String imagem) {
		this.imagem = imagem;
	}
	public Produto(String nome, String descricao, float preco, String glutem, int calorias, String imagem) {
		super();
		this.nome = nome;
		this.descricao = descricao;
		this.preco = preco;
		this.glutem = glutem;
		this.calorias = calorias;
		this.imagem = imagem;
	}
	
	

}
