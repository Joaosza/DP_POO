package controle;

import banco.DAOGenerico;
import entidades.Pesagens;

public class PesagensMB {

	private Pesagens pesagens = new Pesagens();
	private DAOGenerico<Pesagens> dao = new DAOGenerico<>(Pesagens.class);

	public void salvar() {
		if (pesagens.getId() == null) {
			dao.salvar(pesagens);
		} else {
		}
		pesagens = new Pesagens();
	}
}
