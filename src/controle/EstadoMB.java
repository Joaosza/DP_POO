package controle;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import banco.DAOGenerico;
import entidades.Estado;

@ManagedBean
@ViewScoped
public class EstadoMB implements Serializable{
	
	private static final long serialVersionUID = 1L;
	private Estado estado = new Estado();
	private List<Estado> estados = new ArrayList<>();
	private DAOGenerico<Estado> dao = new DAOGenerico<>(Estado.class);

	public EstadoMB() {
		estados = dao.buscarTodos();
	}

	public void salvar() {
		if (estado.getId() == null) {
			dao.salvar(estado);
		} else {
			dao.alterar(estado);
		}
		estado = new Estado();
		estados = dao.buscarTodos();
	}

	public void excluir(Long id) {
		dao.excluir(id);
		estados = dao.buscarTodos();
	}

	public Estado getEstado() {
		return estado;
	}

	public void setEstado(Estado estado) {
		this.estado = estado;
	}

	public List<Estado> getEstados() {
		return estados;
	}

	public void setEstados(List<Estado> estados) {
		this.estados = estados;
	}

}
