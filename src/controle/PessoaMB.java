package controle;

import java.util.ArrayList;
import java.util.List;

import banco.DAOGenerico;
import entidades.Pessoa;

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
