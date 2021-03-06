package g8103.negocio;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Persistence;
import javax.persistence.Query;

import model.Administrador;


/*https://docs.oracle.com/javaee/6/tutorial/doc/bnbrg.html
Listado de Querys a utilizar*/
@NamedQueries({
		@NamedQuery(name = "Administrador.findAll", query = "SELECT c FROM Administrador c"), })

@SuppressWarnings("unchecked")

public class AdminController {

	private String _unidadPersistencia;
	private EntityManager _em;
	private List<Administrador> _listaAdmins = null;

	public AdminController(String unidadPersistencia) {

		this._unidadPersistencia = unidadPersistencia;
	}

	private void proxyCreateEntityManager() {

		EntityManagerFactory factory = Persistence
				.createEntityManagerFactory(_unidadPersistencia);

		this._em = factory.createEntityManager();

	}

	public Administrador findAdminByMail(String mail) {

		Administrador admin = null;
		proxyCreateEntityManager();

		try {
			admin = _em.find(Administrador.class, mail);
		} finally {
			_em.close();
		}
		return admin;
	}

	public List<Administrador> findAdmin() {

		try {
			proxyCreateEntityManager();
			Query query = _em.createNamedQuery("Persona.findAll",Administrador.class);
			query.setMaxResults(5);
			_listaAdmins = query.getResultList();
		} finally {
			_em.close();
		}
		return _listaAdmins;

	}

	public void createAdmin(Administrador admin)  {

		try {
			proxyCreateEntityManager();
			_em.getTransaction().begin();
			_em.persist(admin);
			_em.getTransaction().commit();
		} catch (Exception ex) {
			try {
				if (_em.getTransaction().isActive()) {
					_em.getTransaction().rollback();
				}
			} catch (Exception e) {
				ex.printStackTrace();
			}

		} finally {
			_em.close();
		}

	}

	public void deleteUsuario(Administrador admin)  {

		try {
			proxyCreateEntityManager();
			_em.getTransaction().begin();
			admin = _em.merge(admin);
			_em.remove(admin);
			_em.getTransaction().commit();
		} catch (Exception ex) {
			try {
				if (_em.getTransaction().isActive()) {
					_em.getTransaction().rollback();
				}
			} catch (Exception e) {
				ex.printStackTrace();
			}

		} finally {
			_em.close();
		}

	}

	public void updateUsuario(Administrador admin)  {

		try {
			proxyCreateEntityManager();
			_em.getTransaction().begin();
			admin = _em.merge(admin);
			_em.getTransaction().commit();
		} catch (Exception ex) {
			try {
				if (_em.getTransaction().isActive()) {
					_em.getTransaction().rollback();
				}
			} catch (Exception e) {
				ex.printStackTrace();
			}

		} finally {
			_em.close();
		}
	}

	
	
}
