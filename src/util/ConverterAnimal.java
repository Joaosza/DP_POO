package util;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;

import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;

import banco.DAOGenerico;
import entidades.Animal;


@FacesConverter("converterAnimal")
public class ConverterAnimal implements Converter{

	@Override
	public Object getAsObject(FacesContext arg0, UIComponent arg1, String id) {
		// TODO Auto-generated method stub
		if (id != null && id.trim().length() > 0) {
			DAOGenerico<Animal> dao = new DAOGenerico<>(Animal.class);
			Animal animal = dao.buscarPorId(Long.parseLong(id));
			return animal;
		}
		return null;
	}

	@Override
	public String getAsString(FacesContext arg0, UIComponent arg1, Object object) {
		// TODO Auto-generated method stub
		if (object != null) {
			Animal animal = (Animal) object;
			return String.valueOf(animal.getId());
		}
		return null;
	}

}
