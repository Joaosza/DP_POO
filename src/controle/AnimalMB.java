package controle;

import banco.DAOGenerico;
import entidades.Animal;

public class AnimalMB {

	private Animal animal = new Animal();
	private DAOGenerico<Animal> dao = new DAOGenerico<>(Animal.class);

	public void salvar() {
		if (animal.getId() == null) {
			dao.salvar(animal);
		} else {

		}
		animal = new Animal();
	}

}
