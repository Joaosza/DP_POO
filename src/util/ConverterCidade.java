package util;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;

import banco.DAOGenerico;
import entidades.Cidade;

@FacesConverter("converterCidade")
public class ConverterCidade implements Converter{
	
	@Override
	public Object getAsObject(FacesContext arg0, UIComponent arg1, String id) {
		// TODO Auto-generated method stub
		if (id != null && id.trim().length() > 0) {
			DAOGenerico<Cidade> dao = new DAOGenerico<>(Cidade.class);
			Cidade cidade = dao.buscarPorId(Long.parseLong(id));
			return cidade;
		}
		return null;
	}

	@Override
	public String getAsString(FacesContext arg0, UIComponent arg1, Object object) {
		// TODO Auto-generated method stub
		if (object != null) {
			Cidade cidade = (Cidade) object;
			return String.valueOf(cidade.getId());
		}
		return null;
	}
	
}
