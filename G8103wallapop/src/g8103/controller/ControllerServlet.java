package g8103.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

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
		String user = request.getParameter("user");
		String pwd = request.getParameter("pwd");
		String name = request.getParameter("nombre");
		PrintWriter out = response.getWriter();

		AdminController _admin = new AdminController("G8103Database");
		Administrador admin = _admin.findAdminByMail(user);
		if (admin != null) {
			System.out.println("Administrador encontrado");
			if (name == null) {
				if (admin.getPassword().equals(pwd)) {
					System.out.println("Contraseña correcta");
					HttpSession sesion = request.getSession(true);
					sesion.setAttribute(user, "Administrador");
					response.sendRedirect("http://localhost:8080/G8103admon/");
				} else {
					System.out.println("Contraseña incorrecta");
					out.println("<script type=\"text/javascript\">");
					out.println("alert('Contraseña incorrecta');");
					out.println("</script>");
					response.sendRedirect("logg.jsp");
				}
			} else {
				System.out.println("Usuario ya existente");
				out.println("<script type=\"text/javascript\">");
				out.println("alert('El usuario ya existe');");
				out.println("</script>");
				response.sendRedirect("logg.jsp");
			}
		} else {

			UsuarioController _usuario = new UsuarioController("G8103Database");
			Usuario usuario = _usuario.findUsuarioByMail(user);

			if (usuario == null) {
				if (pwd.equals(request.getParameter("pwd2"))) {
					String apellidos = request.getParameter("apellidos");
					int ciudad = Integer.parseInt(request.getParameter("ciudad"));
					Usuario newUser = new Usuario(user, pwd, name, apellidos, ciudad);

					// Añadir usuario a base de datos

					_usuario.createUsuario(newUser);

					RequestDispatcher miR = request.getRequestDispatcher("/index.jsp");
					miR.forward(request, response);
				} else {
					System.out.println("Las contraseñas no coinciden");
					out.println("<script type=\"text/javascript\">");
					out.println("alert('Las contraseñas no coinciden');");
					out.println("</script>");
					response.sendRedirect("logg.jsp");
				}
			} else {
				if (name == null) {
					if (usuario.getPassword().equals(pwd)) {
						System.out.println("Contraseña correcta");
						HttpSession sesion = request.getSession();
						sesion.setAttribute(user, usuario.getNombre());
						RequestDispatcher miR = request.getRequestDispatcher("/index.jsp");
						miR.forward(request, response);

					} else {
						System.out.println("Contraseña incorrecta");
						out.println("<script type=\"text/javascript\">");
						out.println("alert('Contraseña incorrecta');");
						out.println("</script>");
						response.sendRedirect("logg.jsp");
					}
					RequestDispatcher miR = request.getRequestDispatcher("/logg.jsp");
					miR.forward(request, response);
				} else {
					System.out.println("Usuario ya existente");
					out.println("<script type=\"text/javascript\">");
					out.println("alert('El usuario ya existe');");
					out.println("</script>");
					response.sendRedirect("logg.jsp");
				}
			}
		}
	}
}
