package g8103.datos;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Persistence;
import javax.persistence.Query;

import model.Usuario;


/*https://docs.oracle.com/javaee/6/tutorial/doc/bnbrg.html
Listado de Querys a utilizar*/
@NamedQueries({
		@NamedQuery(name = "Usuario.findAll", query = "SELECT c FROM Usuario c"), })

@SuppressWarnings("unchecked")

public class UsuarioController {

	private String _unidadPersistencia;
	private EntityManager _em;
	private List<Usuario> _listaUsuarios = null;

	public UsuarioController(String unidadPersistencia) {

		this._unidadPersistencia = unidadPersistencia;
	}

	private void proxyCreateEntityManager() {

		EntityManagerFactory factory = Persistence
				.createEntityManagerFactory(_unidadPersistencia);

		this._em = factory.createEntityManager();

	}

	public Usuario findUsuarioByMail(String mail) {

		Usuario usuario = null;
		proxyCreateEntityManager();

		try {
			usuario = _em.find(Usuario.class, mail);
		} finally {
			_em.close();
		}
		return usuario;
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
	public void createUsuario(Usuario usuario)  {

		try {
			proxyCreateEntityManager();
			_em.getTransaction().begin();
			_em.persist(usuario);
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

	public void deleteUsuario(Usuario usuario)  {

		try {
			proxyCreateEntityManager();
			_em.getTransaction().begin();
			usuario = _em.merge(usuario);
			_em.remove(usuario);
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

	public void updateUsuario(Usuario usuario)  {

		try {
			proxyCreateEntityManager();
			_em.getTransaction().begin();
			usuario = _em.merge(usuario);
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
