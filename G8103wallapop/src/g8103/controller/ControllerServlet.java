package g8103.controller;


import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import g8103.datos.UsuarioController;
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
		Usuario newUser = new Usuario();
		
		//Búsqueda usuario
		
		UsuarioController _usuario = new UsuarioController("G8103Database");
		_usuario.findUsuarioByMail(user);
		
		if(_usuario != null){
		String name = request.getParameter("nombre");
		if (name != null){
			String apellidos = request.getParameter("apellidos");
			String ciudad = request.getParameter("ciudad");
			
			//Añadir usuario a base de datos
			
			newUser.setMail(user);
			newUser.setPassword(pwd);
			newUser.setNombre(name);
			newUser.setApellidos(apellidos);
			
			//CONEXION
			
			_usuario.createUsuario(newUser);

			
			
		}
		//Devolver control a index.jsp
		
		RequestDispatcher miR = request
				.getRequestDispatcher("/index.jsp");
		miR.forward(request, response);
		}	
		
	}

}
