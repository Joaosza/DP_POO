package util;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;

import banco.DAOGenerico;
import entidades.Estado;

@FacesConverter("converterEstado")
public class ConverterEstado implements Converter {

	@Override
	public Object getAsObject(FacesContext arg0, UIComponent arg1, String id) {
		// TODO Auto-generated method stub
		if (id != null && id.trim().length() > 0) {
			DAOGenerico<Estado> dao = new DAOGenerico<>(Estado.class);
			Estado estado = dao.buscarPorId(Long.parseLong(id));
			return estado;
		}
		return null;
	}

	@Override
	public String getAsString(FacesContext arg0, UIComponent arg1, Object object) {
		// TODO Auto-generated method stub
		if (object != null) {
			Estado estado = (Estado) object;
			return String.valueOf(estado.getId());
		}
		return null;
	}

}
