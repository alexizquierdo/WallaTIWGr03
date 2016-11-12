package model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the ciudades database table.
 * 
 */
@Entity
@Table(name="ciudades")
@NamedQuery(name="Ciudade.findAll", query="SELECT c FROM Ciudades c")
public class Ciudades implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int idciudad;

	private String nombre;

	//bi-directional many-to-one association to Usuario
	@OneToMany(mappedBy="ciudades")
	private List<Usuario> usuarios;

	public Ciudades() {
	}

	public int getIdciudad() {
		return this.idciudad;
	}

	public void setIdciudad(int idciudad) {
		this.idciudad = idciudad;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public List<Usuario> getUsuarios() {
		return this.usuarios;
	}

	public void setUsuarios(List<Usuario> usuarios) {
		this.usuarios = usuarios;
	}

	public Usuario addUsuario(Usuario usuario) {
		getUsuarios().add(usuario);
		usuario.setCiudade(this);

		return usuario;
	}

	public Usuario removeUsuario(Usuario usuario) {
		getUsuarios().remove(usuario);
		usuario.setCiudade(null);

		return usuario;
	}

}