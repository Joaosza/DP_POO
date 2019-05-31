package entidades;

public class Medicamento {
	
	private int id;
	private String principioAtivo;
	private String fabricante;
	private double quantideEstoque;
	
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
	public String getPrincipioAtivo() {
		return principioAtivo;
	}
	public void setPrincipioAtivo(String principioAtivo) {
		this.principioAtivo = principioAtivo;
	}
	public String getFabricante() {
		return fabricante;
	}
	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}
	public double getQuantideEstoque() {
		return quantideEstoque;
	}
	public void setQuantideEstoque(double quantideEstoque) {
		this.quantideEstoque = quantideEstoque;
	}

}
