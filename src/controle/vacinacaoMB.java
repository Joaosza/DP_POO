package controle;

import java.util.ArrayList;
import java.util.List;

import banco.DAOGenerico;
import entidades.Pessoa;
import entidades.vacinacao;

public class vacinacaoMB {

	private vacinacao vacinacao = new vacinacao();
	private List<vacinacao> vacinacoes = new ArrayList<>();
	private DAOGenerico<vacinacao> dao = new DAOGenerico<>(vacinacao.class);

	public vacinacaoMB() {
		vacinacoes = dao.buscarTodos();
	}

	public void inserir() {
		if (vacinacao.getId() == null) {
			dao.salvar(vacinacao);
		} else {
			dao.alterar(vacinacao);
		}
		vacinacao = new vacinacao();
		vacinacoes = dao.buscarTodos();
	}

	public void excluir(Long id) {
		dao.excluir(id);
		vacinacoes = dao.buscarTodos();
	}

	public vacinacao getVacinacao() {
		return vacinacao;
	}

	public void setVacinacao(vacinacao vacinacao) {
		this.vacinacao = vacinacao;
	}

	public List<vacinacao> getVacinacoes() {
		return vacinacoes;
	}

	public void setVacinacoes(List<vacinacao> vacinacoes) {
		this.vacinacoes = vacinacoes;
	}

}
