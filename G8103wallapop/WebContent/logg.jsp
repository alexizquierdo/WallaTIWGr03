<!DOCTYPE html>
<html lang="es">
  <head>
    <%@include file="head.jsp" %>
    <link rel="stylesheet" href="css/logg.css">
  </head>
  <body>
   	<%@include file="header.jsp" %>

	<div id="login-form">
		<input type="radio" checked id="login" name="switch" class="hide">
		<input type="radio" id="signup" name="switch" class="hide">

		<div>
			<ul class="form-header">
				<li><label for="login"><i class="fa fa-lock"></i> LOGIN</label></li>
				<li><label for="signup"><i class="fa fa-credit-card"></i> REGISTER</label></li>
			</ul>
		</div>

		<div class="section-out">
			<section class="login-section">
				<div class="login">
					<form name="login" method="POST" action="ControllerServlet">
						<ul class="ul-list">
							<li><input type="email" required class="input"
								placeholder="Email" name="user" /><span class="icon"><i
									class="fa fa-user"></i></span></li>
							<li><input type="password" required class="input"
								placeholder="Contraseña" name="pwd"/><span class="icon"><i
									class="fa fa-lock"></i></span></li>
							<li>
								<span class="remember"><input type="checkbox" id="check"> 
								<label for="check">Recordarme</label></span>
							</li>
							<li><input type="submit" value="ENTRAR"></li>
						</ul>
					</form>
				</div>
			</section>

			<section class="signup-section">
				<div class="login">
					<form name="register" method="POST" action="ControllerServlet">
						<ul class="ul-list">
							<li><input type="email" required class="input"
								placeholder="Email" name="user"/><span class="icon"><i
									class="fa fa-user"></i></span></li>
							<li><input type="password" required class="input"
								placeholder="Contraseña" name="pwd"/><span class="icon"><i
									class="fa fa-lock"></i></span></li>
									<li><input required class="input"
								placeholder="Nombre" name="nombre" /></li>
									<li><input required class="input"
								placeholder="Apellidos" name="apellidos" /></li>
									<li>Ciudad</li>
									<li><select name="ciudad">
									<option value="1">Madrid</option>
									<option value="2">Barcelona</option>
									<option value="3">Valencia</option>
									<option value="4">Sevilla</option>
									<option value="5">Bilbao</option>
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