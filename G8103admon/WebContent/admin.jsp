<!DOCTYPE html>
<%@page session="true" %>
<html lang="es">
  <head>
    <%@include file="head.jsp" %>
  </head>
  <body>
   	<%@include file="headerAdmin.jsp" %>
   	
   	<div class="slider-area">
        <div class="zigzag-bottom"></div>
        <div id="slide-list" class="carousel carousel-fade slide" data-ride="carousel">
            
            <div class="slide-bulletz">
                <div class="container">
                    <div class="row">
                        <div class="col-md-12">
                            <ol class="carousel-indicators slide-indicators">
                                <li data-target="#slide-list" data-slide-to="0"></li>
                                <li data-target="#slide-list" data-slide-to="1"></li>
                                <li data-target="#slide-list" data-slide-to="2" class="active"></li>
                            </ol>                            
                        </div>
                    </div>
                </div>
            </div>

                
    <%@include file="footer.jsp" %>

  </body>
</html>