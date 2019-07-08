package controle;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import banco.DAOGenerico;
import entidades.Funcionario;

@ManagedBean
@ViewScoped
public class FuncionarioMB {
	
	private Funcionario fun = new Funcionario();
	private DAOGenerico<Funcionario> dao = new DAOGenerico<>(Funcionario.class);
	
	
	public void salvar() {
		
		if(fun.getId()==null) {
			dao.salvar(fun);
		}else {
		}
		fun = new Funcionario();
	}
}
