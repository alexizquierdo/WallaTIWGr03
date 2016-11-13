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

/**	public List<Usuario> findPersonaByEdad(int _edad) {

		try {
			proxyCreateEntityManager();
			Query query = _em.createNamedQuery("Persona.findByEdad",Persona.class);
			query.setParameter("_varEdad", _edad);
			query.setMaxResults(5);
			_listaPersonas = query.getResultList();
		} finally {
			_em.close();
		}
		return _listaPersonas;

	}

	public List<Persona> findPersonaByEdadQuery(int _edad) {

		try {
			proxyCreateEntityManager();
			Query query = _em
					.createQuery(
							"Select s FROM Persona s WHERE s.edad = :edad",
							Persona.class);
			query.setParameter("edad", _edad);
			query.setMaxResults(15);
			_listaPersonas = query.getResultList();
		} finally {
			_em.close();
		}
		return _listaPersonas;

	}*/
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
