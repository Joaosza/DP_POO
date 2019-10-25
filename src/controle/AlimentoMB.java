package controle;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import banco.DAOGenerico;
import entidades.Alimento;

@ManagedBean
@ViewScoped
public class AlimentoMB implements Serializable{
	
	private static final long serialVersionUID = 1L;
	private Alimento alimento = new Alimento();
	private List<Alimento> alimentos = new ArrayList<>();
	private DAOGenerico<Alimento> dao = new DAOGenerico<>(Alimento.class);
	
	public AlimentoMB() {
		alimentos = dao.buscarTodos();
	}
	
	public void inserir() {
		if(alimento.getId()==null) {
			dao.salvar(alimento);
		}
		else {
			dao.alterar(alimento);
		}
		alimento = new Alimento();
		alimentos = dao.buscarTodos();
	}
	
	public void excluir(Long id) {
		dao.excluir(id);
		alimentos = dao.buscarTodos();
	}

	public Alimento getAlimento() {
		return alimento;
	}

	public void setAlimento(Alimento alimento) {
		this.alimento = alimento;
	}

	public List<Alimento> getAlimentos() {
		return alimentos;
	}

	public void setAlimentos(List<Alimento> alimentos) {
		this.alimentos = alimentos;
	}
	
	
	
}
