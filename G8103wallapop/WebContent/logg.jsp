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
				<li><label for="login"><i class="fa fa-lock"></i> LOGIN<label for="login"></li>
				<li><label for="signup"><i class="fa fa-credit-card"></i> REGISTER</label></li>
			</ul>
		</div>

		<div class="section-out">
			<section class="login-section">
				<div class="login">
					<form action="">
						<ul class="ul-list">
							<li><input type="email" required class="input"
								placeholder="Email" /><span class="icon"><i
									class="fa fa-user"></i></span></li>
							<li><input type="password" required class="input"
								placeholder="Contraseña" /><span class="icon"><i
									class="fa fa-lock"></i></span></li>
							<li>
								<span class="remember"><input type="checkbox" id="check"> 
								<label for="check">Recordarme</label></span>
							</li>
							<li><input type="submit" value="ENTRAR" class="btn"></li>
						</ul>
					</form>
				</div>
			</section>

			<section class="signup-section">
				<div class="login">
					<form action="">
						<ul class="ul-list">
							<li><input type="email" required class="input"
								placeholder="Email" /><span class="icon"><i
									class="fa fa-user"></i></span></li>
							<li><input type="password" required class="input"
								placeholder="Contraseña" /><span class="icon"><i
									class="fa fa-lock"></i></span></li>
							<li>
								<input type="checkbox" id="check1"> 
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