<!DOCTYPE html>
<html lang="es">
  <head>
    <%@include file="head.jsp" %>
    <link rel="stylesheet" href="css/logg.css">
  </head>
  <body>
   	<%@include file="header.jsp" %>

	<div id="login-form">

		<div>
			<ul class="form-header">
				<li><label for="signup"><i class="fa fa-credit-card"></i> Nuevo Producto</label></li>
			</ul>
		</div>

		<div class="section-out">
			<section class="signup-section">
				<div class="login">
					<form name="Register
					" method="POST" action="ProductServlet">
						<ul class="ul-list">
							<li><input type="nombreProducto" required class="input"
								placeholder="Nombre" name="nombreProducto"/>
							<li><input type="precioProducto" required class="input"
								placeholder="Precio" name="precioPorducto"/>
							<li><input type="descripcionProducto" required class="input"
								placeholder="descripción" name="descripcionProducto" /></li>
									<li>Categoria</li>
									<li><select name="categoriaProducto">
									<option value="1">Coches</option>
									<option value="2">Bicicletas</option>
									<option value="3">Bisuteria</option>
									</select></li>
									
									<li>Estado</li>
									<li><select name="estadoProducto">
									<option value="1">En venta</option>
									<option value="2">Comprado</option>
									<option value="3">Oferta</option>
									</select></li>
							<li>
								<input type="checkbox" id="check1" name="terminos"> 
								<label for="check1">I accept terms and conditions</label>
							</li>
							<li><input type="submit" value="ACEPTAR" class="btn"></li>
						</ul>
					</form>
				</div>
			</section>
		</div>

	</div>

	<%@include file="footer.jsp" %>
   	
  </body>
</html>