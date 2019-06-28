package controle;

import banco.DAOGenerico;
import entidades.Medicamento;

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
