package util;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;

import banco.DAOGenerico;
import entidades.Medicamento;

@FacesConverter("converteMedicamento")
public class ConverterMedicamento implements Converter {

	@Override
	public Object getAsObject(FacesContext arg0, UIComponent arg1, String id) {
		// TODO Auto-generated method stub
		if (id != null && id.trim().length() > 0) {
			DAOGenerico<Medicamento> dao = new DAOGenerico<>(Medicamento.class);
			Medicamento animal = dao.buscarPorId(Long.parseLong(id));
			return animal;
		}
		return null;
	}

	@Override
	public String getAsString(FacesContext arg0, UIComponent arg1, Object object) {
		// TODO Auto-generated method stub
		if (object != null) {
			Medicamento animal = (Medicamento) object;
			return String.valueOf(animal.getId());
		}
		return null;
	}

}
