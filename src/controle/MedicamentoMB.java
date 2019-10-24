package controle;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import banco.DAOGenerico;
import entidades.Medicamento;

@ManagedBean
@ViewScoped
public class MedicamentoMB implements Serializable {

	private static final long serialVersionUID = 1L;
	private Medicamento medicamento = new Medicamento();
	private List<Medicamento> medicamentos = new ArrayList<>();
	private DAOGenerico<Medicamento> dao = new DAOGenerico<>(Medicamento.class);
	
	public MedicamentoMB() {
		medicamentos = dao.buscarTodos();
	}
	
	public void salvar() {
		if (medicamento.getId() == null) {
			dao.salvar(medicamento);
		} else {
			dao.alterar(medicamento);
		}
		medicamento = new Medicamento();
		medicamentos = dao.buscarTodos();
	}

	public void excluir(Long id) {
		dao.excluir(id);
		medicamentos = dao.buscarTodos();
	}

	public Medicamento getMedicamento() {
		return medicamento;
	}

	public void setMedicamento(Medicamento medicamento) {
		this.medicamento = medicamento;
	}

	public List<Medicamento> getMedicamentos() {
		return medicamentos;
	}

	public void setMedicamentos(List<Medicamento> medicamentos) {
		this.medicamentos = medicamentos;
	}

}
