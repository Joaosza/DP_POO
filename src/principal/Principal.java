package principal;

import banco.DAOGenerico;
import entidades.Alimento;
import entidades.Animal;
import entidades.Fazenda;
import entidades.Medicamento;
import entidades.Pessoa;

public class Principal {

	// public = modificador de acesso.

	public static void main(String[] args) {

		//Pessoa
		
		Pessoa pessoa = new Pessoa();
		DAOGenerico<Pessoa> daoP = new DAOGenerico<>(Pessoa.class);

		pessoa.setNome("bruno");
		pessoa.setRg("123123123");
		pessoa.setTelefone("456456456");
		pessoa.setEmail("joao@hotmail.com");
		pessoa.setCpf("789789789789");
		pessoa.setBairro("Jardim das olivas");
		pessoa.setCidade("Paranavai");
		pessoa.setSexo(true);
		pessoa.setUf("PR");
		pessoa.setCategoia("Funcionario");
		daoP.salvar(pessoa);

		// Medicamento

		Medicamento medicamento = new Medicamento();
		DAOGenerico<Medicamento> daoM = new DAOGenerico<>(Medicamento.class);
		
		medicamento.setFabricante("Longinas");
		medicamento.setPrincipioAtivo("Medicamento para combater os carapatos");
		medicamento.setQuantideEstoque(5);
		daoM.salvar(medicamento);

		// Alimento
		
		Alimento alimento = new Alimento();
		DAOGenerico<Alimento> daoA = new DAOGenerico<>(Alimento.class);

		alimento.setNome("Janna");
		alimento.setPrincipioAtivo("ração composta, para o fortalecimento dos ossos");
		alimento.setQuantideEstoque(15);
		alimento.setCategoria("Ração");
		daoA.salvar(alimento);
		
		//Fazenda
		
		Fazenda fazenda = new Fazenda();
		DAOGenerico<Fazenda> daoF = new DAOGenerico<>(Fazenda.class);
		
		fazenda.setCidade("Paranavai");
		fazenda.setEndereco("Rua jose felipe");
		fazenda.setComplemento("Perto do mercado tal");
		fazenda.setEstado("Parana");
		fazenda.setHectares(72);
		fazenda.setNome("Santa matilde");
		fazenda.setUf("PR");
		daoF.salvar(fazenda);

		// Animal 
		
		Animal animal = new Animal();
		DAOGenerico<Animal> daoAni = new DAOGenerico<>(Animal.class);
		
		animal.setCategoria("Bezero");
		animal.setEspecie("Bovino");
		animal.setIdentificacao("12");
		animal.setPelagem("Preto");
		animal.setRaca("Jersey");
		animal.setSexo(true);
		daoAni.salvar(animal);
		
	}

}
