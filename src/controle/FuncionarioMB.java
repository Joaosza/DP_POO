package controle;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import banco.DAOGenerico;
import entidades.Funcionario;

@ManagedBean
@ViewScoped
public class FuncionarioMB implements Serializable{

	private Funcionario fun = new Funcionario();
	private DAOGenerico<Funcionario> dao = new DAOGenerico<>(Funcionario.class);

	public void salvar() {

		if (fun.getId() == null) {
			dao.salvar(fun);
		} else {
		}
		fun = new Funcionario();
	}

	public Funcionario getFun() {
		return fun;
	}

	public void setFun(Funcionario fun) {
		this.fun = fun;
	}

}
