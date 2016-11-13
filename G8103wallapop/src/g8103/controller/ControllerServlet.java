package g8103.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

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
		//Buscar en la base de datos de administracion
		//Buscar en la base de datos de usuarios
		String name = request.getParameter("nombre");
		if (name != null){
			String apellidos = request.getParameter("apellidos");
			String ciudad = request.getParameter("ciudad");
			//Añadir usuario a base de datos
		}
		//Devolver control a index.jsp
		
			
			
		
	}

}
