package entidades;

public class Alimento {
	
	private int id;
	private String nome;
	private double quantideEstoque;
	private String categoria;
	private String principioAtivo;
	
	private boolean Tipo; //Entrada e Saida

	
	public boolean isTipo() {
		return Tipo;
	}
	public void setTipo(boolean tipo) {
		Tipo = tipo;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getQuantideEstoque() {
		return quantideEstoque;
	}
	public void setQuantideEstoque(double quantideEstoque) {
		this.quantideEstoque = quantideEstoque;
	}
	public String getCategoria() {
		return categoria;
	}
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	public String getPrincipioAtivo() {
		return principioAtivo;
	}
	public void setPrincipioAtivo(String principioAtivo) {
		this.principioAtivo = principioAtivo;
	}
	
	
}
