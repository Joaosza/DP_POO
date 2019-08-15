package banco;

import java.util.List;
import javax.persistence.EntityManager;

import Fabrica.Fabrica;

public class DAOGenerico<T> {

	private static EntityManager entityManager;
	private Class<T> classe;

	public DAOGenerico(Class<T> classe) {
		this.classe = classe;
	}

	public T salvar(T objeto) {
		entityManager = Fabrica.get().createEntityManager();
		try {
			entityManager.getTransaction().begin();
			entityManager.persist(objeto);
			entityManager.getTransaction().commit();
		} catch (Exception e) {
			entityManager.getTransaction().rollback();
			e.printStackTrace();
		} finally {
			entityManager.close();
		}
		return objeto;
	}

	}