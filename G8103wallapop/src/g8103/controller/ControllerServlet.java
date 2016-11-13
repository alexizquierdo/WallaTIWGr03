package g8103.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import g8103.datos.UsuarioController;
import g8103.negocio.AdminController;
import model.Administrador;
import model.Usuario;

/**
 * Servlet implementation class Controller
 */
@WebServlet("/Controller")
public class ControllerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ControllerServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doPost(request, response);
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("entrando en servlet");
		// HttpSession sesion = request.getSession();
		String user = request.getParameter("user");
		String pwd = request.getParameter("pwd");
		String name = request.getParameter("nombre");
		// Búsqueda administrador

		AdminController _admin = new AdminController("G8103Database");
		Administrador admin = _admin.findAdminByMail(user);
		if (admin != null) {
			System.out.println("Administrador encontrado");
			if (name == null) {
				// Redirigir página administrador
				if (admin.getPassword().equals(pwd)) {
					System.out.println("Contraseña correcta");

				} else {
					System.out.println("Contraseña incorrecta");
					RequestDispatcher miR = request.getRequestDispatcher("/logg.jsp");
					miR.forward(request, response);
				}
			} else {
				System.out.println("Usuario ya existente");
				RequestDispatcher miR = request.getRequestDispatcher("/logg.jsp");
				miR.forward(request, response);
			}
		} else {

			// Búsqueda usuario normal

			UsuarioController _usuario = new UsuarioController("G8103Database");
			Usuario usuario = _usuario.findUsuarioByMail(user);

			if (usuario == null) {

				String apellidos = request.getParameter("apellidos");
				int ciudad = Integer.parseInt(request.getParameter("ciudad"));
				Usuario newUser = new Usuario(user, pwd, name, apellidos, ciudad);

				// Añadir usuario a base de datos

				_usuario.createUsuario(newUser);

				RequestDispatcher miR = request.getRequestDispatcher("/index.jsp");
				miR.forward(request, response);
			} else {
				if (name == null) {
					if (usuario.getPassword().equals(pwd)) {
						System.out.println("Contraseña correcta");
						RequestDispatcher miR = request.getRequestDispatcher("/index.jsp");
						miR.forward(request, response);

					} else {
						System.out.println("Contraseña incorrecta");
						RequestDispatcher miR = request.getRequestDispatcher("/logg.jsp");
						miR.forward(request, response);
					}
					RequestDispatcher miR = request.getRequestDispatcher("/logg.jsp");
					miR.forward(request, response);
				} else {
					System.out.println("Usuario ya existente");
					RequestDispatcher miR = request.getRequestDispatcher("/logg.jsp");
					miR.forward(request, response);
				}
			}

		}
	}

}
