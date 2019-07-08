package controle;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import banco.DAOGenerico;
import entidades.Medicamento;

@ManagedBean
@ViewScoped
public class MedicamentoMB {

	private Medicamento medicamento = new Medicamento();
	private DAOGenerico<Medicamento> dao = new DAOGenerico<>(Medicamento.class);

	public void salvar() {
		if (medicamento.getId() == null) {
			dao.salvar(medicamento);
		} else {
		}

		medicamento = new Medicamento();
	}

}
