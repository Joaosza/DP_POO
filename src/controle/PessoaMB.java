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
public class PessoaMB implements Serializable{

	private Pessoa pessoa = new Pessoa();
	private DAOGenerico<Pessoa> daoP = new DAOGenerico<>(Pessoa.class);

	public void inserir() {
		if (pessoa.getId() == null) {
			daoP.salvar(pessoa);
		} else {
		}
		pessoa = new Pessoa();
	}

	public Pessoa getPessoa() {
		return pessoa;
	}

	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}
}
