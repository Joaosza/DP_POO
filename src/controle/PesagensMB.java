package controle;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import banco.DAOGenerico;
import entidades.Pesagens;

@ManagedBean
@ViewScoped
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
