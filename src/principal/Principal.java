package principal;

import banco.DAOGenerico;
import entidades.Alimento;
import entidades.Animal;
import entidades.Fazenda;
import entidades.Funcionario;
import entidades.Medicamento;

public class Principal {

	// public = modificador de acesso.

	public static void main(String[] args) {

				
		//TESTE HERANÇA
		
				//Objeto
		Funcionario fun = new Funcionario();
		DAOGenerico<Funcionario> daoFuncionario = new DAOGenerico<>(Funcionario.class);

		fun.setNome("pereira");
		fun.setRg("789456132");
		fun.setTelefone("456789132");
		fun.setEmail("marcos@gmail.com");
		fun.setCpf("12348789465");
		fun.setBairro("São Jorge");
		fun.setCidade("Paranavai");
		fun.setSexo(true);
		fun.setUf("PR");
		fun.setCategoia("Funcionario");
		fun.setLogin("joaoMarcos");
		fun.setSenha("456789123");
		daoFuncionario.salvar(fun);
		

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

