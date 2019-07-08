package controle;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import banco.DAOGenerico;
import entidades.Fazenda;

@ManagedBean
@ViewScoped
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
