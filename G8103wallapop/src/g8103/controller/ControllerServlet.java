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
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request,response);
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("entrando en servlet");
		//HttpSession sesion = request.getSession();
		String user = request.getParameter("user");
		String pwd = request.getParameter("pwd");
		
		//Búsqueda administrador
		
		AdminController _admin = new AdminController("G8103Database");
		Administrador admin = _admin.findAdminByMail(user);
		if(admin != null){
			System.out.println("Administrador encontrado");
			//Redirigir página administrador
			if(admin.getPassword().equals(pwd)){
				System.out.println("Contraseña correcta");
			}else{
				System.out.println("Contraseña incorrecta");
			}
		}
		
		//Búsqueda usuario normal
		
		UsuarioController _usuario = new UsuarioController("G8103Database");
		_usuario.findUsuarioByMail(user);
		
		if(_usuario == null){
			String name = request.getParameter("nombre");
			String apellidos = request.getParameter("apellidos");
			String ciudad = request.getParameter("ciudad");
			Usuario newUser = new Usuario(user, pwd, name, apellidos, 1);

			//Añadir usuario a base de datos

			_usuario.createUsuario(newUser);



		}
		//Devolver control a index.jsp
		
		RequestDispatcher miR = request
				.getRequestDispatcher("/index.jsp");
		miR.forward(request, response);
			
		
	}

}
