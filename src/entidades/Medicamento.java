package entidades;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Medicamento {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String principioAtivo;
	private String fabricante;
	private String quantideEstoque;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
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

	public String getQuantideEstoque() {
		return quantideEstoque;
	}

	public void setQuantideEstoque(String quantideEstoque) {
		this.quantideEstoque = quantideEstoque;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((fabricante == null) ? 0 : fabricante.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((principioAtivo == null) ? 0 : principioAtivo.hashCode());
		result = prime * result + ((quantideEstoque == null) ? 0 : quantideEstoque.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Medicamento other = (Medicamento) obj;
		if (fabricante == null) {
			if (other.fabricante != null)
				return false;
		} else if (!fabricante.equals(other.fabricante))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (principioAtivo == null) {
			if (other.principioAtivo != null)
				return false;
		} else if (!principioAtivo.equals(other.principioAtivo))
			return false;
		if (quantideEstoque == null) {
			if (other.quantideEstoque != null)
				return false;
		} else if (!quantideEstoque.equals(other.quantideEstoque))
			return false;
		return true;
	}

}
