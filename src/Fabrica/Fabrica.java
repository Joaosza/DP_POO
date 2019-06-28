package Fabrica;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Fabrica {

	private static EntityManagerFactory fabrica = null;

	public static EntityManagerFactory get() {

		if (fabrica == null) {
			try {
				fabrica = Persistence.createEntityManagerFactory("mysqlPU");
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return fabrica;
	}

}
