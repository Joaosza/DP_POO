package controle;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import banco.DAOGenerico;
import entidades.Funcionario;

@ManagedBean
@ViewScoped
public class FuncionarioMB implements Serializable{

	private Funcionario fun = new Funcionario();
	private List<Funcionario> func = new ArrayList<>();
	private DAOGenerico<Funcionario> dao = new DAOGenerico<>(Funcionario.class);

	public void salvar() {

		if (fun.getId() == null) {
			dao.salvar(fun);
		} else {
			dao.alterar(fun);
		}
		fun = new Funcionario();
		func = dao.buscarTodos();
	}
	
	public void excluir(Long id) {
		dao.excluir(id);
		func = dao.buscarTodos();
	}

	public List<Funcionario> getFunc() {
		return func;
	}

	public void setFunc(List<Funcionario> func) {
		this.func = func;
	}

	public Funcionario getFun() {
		return fun;
	}

	public void setFun(Funcionario fun) {
		this.fun = fun;
	}

}
