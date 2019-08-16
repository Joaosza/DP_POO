package controle;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import banco.DAOGenerico;
import entidades.Animal;

@ManagedBean
@ViewScoped
public class AnimalMB implements Serializable{

	private Animal animal = new Animal();
	private DAOGenerico<Animal> dao = new DAOGenerico<>(Animal.class);

	public void salvar() {
		if (animal.getId() == null) {
			dao.salvar(animal);
		} else {

		}
		animal = new Animal();
	}

	public Animal getAnimal() {
		return animal;
	}

	public void setAnimal(Animal animal) {
		this.animal = animal;
	}

}
