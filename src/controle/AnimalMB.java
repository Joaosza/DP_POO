package controle;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import banco.DAOGenerico;
import entidades.Animal;

@ManagedBean
@ViewScoped
public class AnimalMB implements Serializable{

	private Animal animal = new Animal();
	private List<Animal> animais = new ArrayList<>();
	private DAOGenerico<Animal> dao = new DAOGenerico<>(Animal.class);
	
	public AnimalMB() {
		animais = dao.buscarTodos();
	}
	
	public List<Animal> getAnimais() {
		return animais;
	}

	public void setAnimais(List<Animal> animais) {
		this.animais = animais;
	}

	public void salvar() {
		if (animal.getId() == null) {
			dao.salvar(animal);
		} else {
			dao.alterar(animal);
		}
		animal = new Animal();
		animais = dao.buscarTodos();
	}
	
	public void excluir(Long id) {
		dao.excluir(id);
		animais = dao.buscarTodos();
	}
	
	
	public Animal getAnimal() {
		return animal;
	}

	public void setAnimal(Animal animal) {
		this.animal = animal;
	}

}
