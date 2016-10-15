<!DOCTYPE html>
<html lang="es">
  <head>
    <%@include file="head.jsp" %>
  </head>
  <body>
   
    <%@include file="header.jsp" %>
    
    <div class="product-big-title-area">
        <div class="container">
            <div class="row">
                <div class="col-md-12">
                    <div class="product-bit-title text-center">
                        <h2>Producto</h2>
                    </div>
                </div>
            </div>
        </div>
    </div>
    
    
    <div class="single-product-area">
        <div class="zigzag-bottom"></div>
        <div class="container">
            <div class="row">
                <%@include file="single-sidebar.jsp"%>
                
                <div class="col-md-8">
                    <div class="product-content-right">
                        <div class="product-breadcroumb">
                            <a href="index.jsp">Home</a>
                            <a href="">Cursos</a>
                            <a href="single-product.jsp">Curso Office 2015</a>
                        </div>
                        
                        <div class="row">
                            <div class="col-sm-6">
                                <div class="product-images">
                                    <div class="product-main-img">
                                        <img src="img/product-5.jpg" alt="">
                                    </div>
                                    
                                    <div class="product-gallery">
                                        <img src="img/word.jpg" alt="">
                                        <img src="img/excel.jpg" alt="">
                                        <img src="img/power.jpg" alt="">
                                        <img src="img/access.jpg" alt="">
                                    </div>
                                </div>
                            </div>
                            
                            <div class="col-sm-6">
                                <div class="product-inner">
                                    <h2 class="product-name">Curso Office 2015</h2>
                                    <div class="product-inner-price">
                                        <ins>349&euro;</ins> <del>599&euro;</del>
                                    </div>    
                                    
                                    <div role="tabpanel">
                                        <ul class="product-tab" role="tablist">
                                            <li role="presentation" class="active"><a href="#home" aria-controls="home" role="tab" data-toggle="tab">Descripción</a></li>
                                            <li role="presentation"><a href="#profile" aria-controls="profile" role="tab" data-toggle="tab">Reviews</a></li>
                                        </ul>
                                        <div class="tab-content">
                                            <div role="tabpanel" class="tab-pane fade in active" id="home">
                                                <h2>Descripción del producto</h2>  
                                                <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nam tristique, diam in consequat iaculis, est purus iaculis mauris, imperdiet facilisis ante ligula at nulla. Quisque volutpat nulla risus, id maximus ex aliquet ut. Suspendisse potenti. Nulla varius lectus id turpis dignissim porta. Quisque magna arcu, blandit quis felis vehicula, feugiat gravida diam. Nullam nec turpis ligula. Aliquam quis blandit elit, ac sodales nisl. Aliquam eget dolor eget elit malesuada aliquet. In varius lorem lorem, semper bibendum lectus lobortis ac.</p>

                                                <p>Mauris placerat vitae lorem gravida viverra. Mauris in fringilla ex. Nulla facilisi. Etiam scelerisque tincidunt quam facilisis lobortis. In malesuada pulvinar neque a consectetur. Nunc aliquam gravida purus, non malesuada sem accumsan in. Morbi vel sodales libero.</p>
                                            </div>
                                            <div role="tabpanel" class="tab-pane fade" id="profile">
                                                <h2>Reviews</h2>
                                                <div class="submit-review">
                                                    <p><label for="name">Nombre</label> <input name="name" type="text"></p>
                                                    <p><label for="email">Email</label> <input name="email" type="email"></p>
                                                    <div class="rating-chooser">
                                                        <p>Tu puntuación</p>

                                                        <div class="rating-wrap-post">
                                                            <i class="fa fa-star"></i>
                                                            <i class="fa fa-star"></i>
                                                            <i class="fa fa-star"></i>
                                                            <i class="fa fa-star"></i>
                                                            <i class="fa fa-star"></i>
                                                        </div>
                                                    </div>
                                                    <p><label for="review">Tu review</label> <textarea name="review" id="" cols="30" rows="10"></textarea></p>
                                                    <p><input type="submit" value="Enviar"></p>
                                                </div>
                                            </div>
                                        </div>
                                    </div>
                                    
                                </div>
                            </div>
                        </div>
                        
                        
                        <div class="related-products-wrapper">
                            <h2 class="related-products-title">Productos Relacionados</h2>
                            <div class="related-products-carousel">
                                <div class="single-product">
                                    <div class="product-f-image">
                                        <img src="img/product-1.jpg" alt="">
                                        <div class="product-hover">
                                            <a href="cart.jsp" class="add-to-cart-link"><i class="fa fa-shopping-cart"></i> A&ntilde;adir</a>
                                            <a href="single-product.jsp" class="view-details-link"><i class="fa fa-link"></i> Ver detalles</a>
                                        </div>
                                    </div>

                                    <h2><a href="single-product.jsp">Curso HTML5 + CSS3 + JS</a></h2>

                                    <div class="product-carousel-price">
                                        <ins>349&euro;</ins> <del>549&euro;</del>
                                    </div> 
                                </div>
                                <div class="single-product">
                                    <div class="product-f-image">
                                        <img src="img/product-2.jpg" alt="">
                                        <div class="product-hover">
                                            <a href="cart.jsp" class="add-to-cart-link"><i class="fa fa-shopping-cart"></i> A&ntilde;adir</a>
                                            <a href="single-product.jsp" class="view-details-link"><i class="fa fa-link"></i> Ver detalles</a>
                                        </div>
                                    </div>

                                    <h2><a href="single-product.jsp">Curso Android</a></h2>
                                    <div class="product-carousel-price">
                                        <ins>50&euro;</ins>
                                    </div> 
                                </div>
                                <div class="single-product">
                                    <div class="product-f-image">
                                        <img src="img/product-6.jpg" alt="">
                                        <div class="product-hover">
                                            <a href="cart.jsp" class="add-to-cart-link"><i class="fa fa-shopping-cart"></i> A&ntilde;adir</a>
                                            <a href="single-product.jsp" class="view-details-link"><i class="fa fa-link"></i> Ver detalles</a>
                                        </div>
                                    </div>

                                    <h2><a href="single-product.jsp">Curso animaci&oacute;n 3D</a></h2>

                                    <div class="product-carousel-price">
                                        <ins>400&euro;</ins>
                                    </div>                                 
                                </div>                                    
                            </div>
                        </div>
                    </div>                    
                </div>
            </div>
        </div>
    </div>

    <%@include file="footer.jsp" %>
    
  </body>
</html>