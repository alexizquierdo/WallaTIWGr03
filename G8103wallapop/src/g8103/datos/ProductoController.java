package g8103.datos;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Persistence;
import javax.persistence.Query;

import model.Producto;


/*https://docs.oracle.com/javaee/6/tutorial/doc/bnbrg.html
Listado de Querys a utilizar*/
@NamedQueries({
		@NamedQuery(name = "Producto.findAll", query = "SELECT c FROM Producto c"), 
		@NamedQuery(name = "Producto.findByCategory", query = "SELECT c FROM Producto c WHERE c.categoria = :_varCat"),
		@NamedQuery(name = "Producto.findByState", query = "SELECT c FROM Producto c WHERE c.estado = :_varCat"),})


@SuppressWarnings("unchecked")

public class ProductoController {

	private String _unidadPersistencia;
	private EntityManager _em;
	private List<Producto> _listaProductos = null;

	public ProductoController(String unidadPersistencia) {

		this._unidadPersistencia = unidadPersistencia;
	}

	private void proxyCreateEntityManager() {

		EntityManagerFactory factory = Persistence
				.createEntityManagerFactory(_unidadPersistencia);

		this._em = factory.createEntityManager();

	}

	public List<Producto> findProductoPorCategoria(int categoria) {

		try {
			proxyCreateEntityManager();
			Query query = _em.createNamedQuery("Producto.findByCategory",Producto.class);
			query.setParameter("_varCat", categoria);
			query.setMaxResults(5);
			_listaProductos = query.getResultList();
		} finally {
			_em.close();
		}
		return _listaProductos;

	}

	public List<Producto> findProductoPorEstado(int estado) {

		try {
			proxyCreateEntityManager();
			Query query = _em.createNamedQuery("Producto.findByState",Producto.class);
			query.setParameter("_varCat", estado);
			query.setMaxResults(5);
			_listaProductos = query.getResultList();
		} finally {
			_em.close();
		}
		return _listaProductos;

	}

	public void createProducto(Producto producto)  {

		try {
			proxyCreateEntityManager();
			_em.getTransaction().begin();
			_em.persist(producto);
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

	public void deleteUsuario(Producto producto)  {

		try {
			proxyCreateEntityManager();
			_em.getTransaction().begin();
			producto = _em.merge(producto);
			_em.remove(producto);
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

	public void updateUsuario(Producto producto)  {

		try {
			proxyCreateEntityManager();
			_em.getTransaction().begin();
			producto = _em.merge(producto);
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
