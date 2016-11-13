package g8103.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import g8103.datos.ProductoController;
import model.Producto;

/**
 * Servlet implementation class Controller
 */
@WebServlet("/Controller")
public class ProductServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ProductServlet() {
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

		String nombre = request.getParameter("nombreProducto");
		String precio = request.getParameter("precioProducto");
		int categoria = Integer.parseInt(request.getParameter("categoriaProducto"));
		String descripcion = request.getParameter("descripcionProducto");
		int estado = Integer.parseInt(request.getParameter("estadoProducto"));

		ProductoController _producto = new ProductoController("G8103Database");
		Producto producto = new Producto();

		producto.setNombre(nombre);
		producto.setPrecio(precio);
		producto.setDescripcion(descripcion);

		// Añadir usuario a base de datos

		_producto.createProducto(producto);

		RequestDispatcher miR = request.getRequestDispatcher("/index.jsp");
		miR.forward(request, response);

	}
}
