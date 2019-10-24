package controle;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import banco.DAOGenerico;
import entidades.Pessoa;

@ManagedBean
@ViewScoped
public class PessoaMB implements Serializable {

	private Pessoa pessoa = new Pessoa();
	private List<Pessoa> pessoas = new ArrayList<>();
	private DAOGenerico<Pessoa> dao = new DAOGenerico<>(Pessoa.class);

	public PessoaMB() {
		pessoas = dao.buscarTodos();
	}

	public void inserir() {
		if (pessoa.getId() == null) {
			dao.salvar(pessoa);
		} else {
			dao.alterar(pessoa);
		}
		pessoa = new Pessoa();
		pessoas = dao.buscarTodos();
	}

	public void excluir(Long id) {
		dao.excluir(id);
		pessoas = dao.buscarTodos();
	}

	public List<Pessoa> getPessoas() {
		return pessoas;
	}

	public void setPessoas(List<Pessoa> pessoas) {
		this.pessoas = pessoas;
	}

	public Pessoa getPessoa() {
		return pessoa;
	}

	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}
}
