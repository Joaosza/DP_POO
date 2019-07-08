package controle;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import banco.DAOGenerico;
import entidades.Pessoa;

@ManagedBean
@ViewScoped
public class PessoaMB {

	private Pessoa pessoa = new Pessoa();
	private DAOGenerico<Pessoa> daoP = new DAOGenerico<>(Pessoa.class);

	public void salvar() {
		if (pessoa.getId() == null) {
			daoP.salvar(pessoa);
		} else {
		}
		pessoa = new Pessoa();
	}

}
