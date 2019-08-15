package controle;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import banco.DAOGenerico;
import entidades.Alimento;
import entidades.Proprietario;

@ManagedBean
@ViewScoped
public class ProprietarioMB {

	private Proprietario pro = new Proprietario();
	private DAOGenerico<Proprietario> dao = new DAOGenerico<>(Proprietario.class);

	public void salvar() {

		if (pro.getId() == null) {
			dao.salvar(pro);
		} else {
		}
		pro = new Proprietario();
	}

	public Proprietario getPro() {
		return pro;
	}

	public void setPro(Proprietario pro) {
		this.pro = pro;
	}
}
