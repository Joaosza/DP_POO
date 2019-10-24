package controle;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import banco.DAOGenerico;
import entidades.Pesagens;

@ManagedBean
@ViewScoped
public class PesagensMB implements Serializable {

	private Pesagens pesagem = new Pesagens();
	private List<Pesagens> pesagens = new ArrayList<>();
	private DAOGenerico<Pesagens> dao = new DAOGenerico<>(Pesagens.class);
	
	public PesagensMB() {
		pesagens = dao.buscarTodos();
	}
	
	public void salvar() {
		if (pesagem.getId() == null) {
			dao.salvar(pesagem);
		} else {
			dao.alterar(pesagem);
		}
		pesagem = new Pesagens();
		pesagens = dao.buscarTodos();

	}

	public void excluir(Long id) {
		dao.excluir(id);
		pesagens = dao.buscarTodos();
	}

	public List<Pesagens> getPesagens() {
		return pesagens;
	}

	public void setPesagens(List<Pesagens> pesagens) {
		this.pesagens = pesagens;
	}

	public Pesagens getPesagem() {
		return pesagem;
	}

	public void setPesagem(Pesagens pesagem) {
		this.pesagem = pesagem;
	}

}
