package controle;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import banco.DAOGenerico;
import entidades.Fazenda;

@ManagedBean
@ViewScoped
public class FazendaMB implements Serializable{

	private Fazenda fazenda = new Fazenda();
	private List<Fazenda> fazendas = new ArrayList<>();
	private DAOGenerico<Fazenda> dao = new DAOGenerico<>(Fazenda.class);
	
	public FazendaMB() {
		fazendas = dao.buscarTodos();
	}
	
	public void salvar() {
		if (fazenda.getId() == null) {
			dao.salvar(fazenda);
		} else {
			dao.alterar(fazenda);
		}
		fazenda = new Fazenda();
		fazendas = dao.buscarTodos();
	}
	
	public void excluir(Long id) {
		dao.excluir(id);
		fazendas = dao.buscarTodos();
	}
	
	public List<Fazenda> getFazendas() {
		return fazendas;
	}

	public void setFazendas(List<Fazenda> fazendas) {
		this.fazendas = fazendas;
	}

	public Fazenda getFazenda() {
		return fazenda;
	}

	public void setFazenda(Fazenda fazenda) {
		this.fazenda = fazenda;
	}

}
