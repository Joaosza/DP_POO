package controle;

import banco.DAOGenerico;
import entidades.Fazenda;

public class FazendaMB {

	private Fazenda fazenda = new Fazenda();
	private DAOGenerico<Fazenda> dao = new DAOGenerico<>(Fazenda.class);

	public void salvar() {
		if (fazenda.getId() == null) {
			dao.salvar(fazenda);
		} else {

		}
		fazenda = new Fazenda();
	}
}
