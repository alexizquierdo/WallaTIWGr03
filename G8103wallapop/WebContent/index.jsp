<!DOCTYPE html>
<html lang="es">
  <head>
    <%@include file="head.jsp" %>
  </head>
  <body>
   	<%@include file="header.jsp" %>
   	
   	<div class="sliders-area">
        <div class="zigzag-bottom"></div>
        <div id="slides-list" class="carousel carousel-fade slides" data-ride="carousel">
            
            <div class="slides-bulletz">
                <div class="container">
                    <div class="row">
                        <div class="col-md-12">
                            <ol class="carousel-indicators slide-indicators">
                                <li data-target="#slides-list" data-slides-to="1" class="active"></li>
                                <li data-target="#slides-list" data-slides-to="2"></li>
                            </ol>                            
                        </div>
                    </div>
                </div>
            </div>

            <div class="carousel-inner" role="listbox">
                <div class="item active">
                    <div class="single-slides">
                        <div class="slides-bg slides-one"></div>
                        <div class="slides-text-wrapper">
                            <div class="slides-text">
                                <div class="container">
                                    <div class="row">
                                        <div class="col-md-6 col-md-offset-6">
                                            <div class="slides-content">
                                                <h2>&iexcl;Compra desde casa!</h2>
                                                <p>WallaTIW pone a tu disposici&oacute;n una infinidad de productos on-line. La gran variedad
						de la que disponemos te asegura encontrar cualquier art&iacute;culo seg&uacute;n tus necesidades.</p>
                                                <p>&iexcl;Deja de buscar y entra en nuestra tienda on-line!</p>
                                                <a href="shop.jsp" class="readmore">Ver productos</a>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
                <div class="item">
                    <div class="single-slide">
                        <div class="slide-bg slide-two"></div>
                        <div class="slide-text-wrapper">
                            <div class="slide-text">
                                <div class="container">
                                    <div class="row">
                                        <div class="col-md-6 col-md-offset-6">
                                            <div class="slide-content">
                                                <h2>R&aacute;pido y Sencillo</h2>
                                                <p>Sin gastos de env&iacute;o, encuentra todo lo que necesites...</p>
						<p>&iexcl;Sin moverte de casa, el trabajo o desde el m&oacute;vil!</p>
                                                <a href="shop.jsp" class="readmore">Ver prodcutos</a>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>

        </div>        
    </div> <!-- End slider area -->
    
    <%-- <div class="promo-area">
        <div class="zigzag-bottom"></div>
        <div class="container">
            <div class="row">
                <div class="col-md-3 col-sm-6">
                    <div class="single-promo">
                        <i class="fa fa-refresh"></i>
                        <p>Pol&iacute;tica de devoluci&oacute;n</p>
                    </div>
                </div>
                <div class="col-md-3 col-sm-6">
                    <div class="single-promo">
                        <i class="fa fa-truck"></i>
                        <p>Sin gastos de env&iacute;o</p>
                    </div>
                </div>
                <div class="col-md-3 col-sm-6">
                    <div class="single-promo">
                        <i class="fa fa-lock"></i>
                        <p>Pagos seguros</p>
                    </div>
                </div>
                <div class="col-md-3 col-sm-6">
                    <div class="single-promo">
                        <i class="fa fa-gift"></i>
                        <p>Promociones</p>
                    </div>
                </div>
            </div>
        </div>
    </div> <!-- End promo area -->--%>
    
    <div class="maincontent-area">
        <div class="zigzag-bottom2"></div>
        <div class="container">
            <div class="row">
                <div class="col-md-12">
                    <div class="latest-product">
                        <h2 class="section-title">&Uacute;ltimos Productos</h2>
                        <div class="product-carousel">
                            <div class="single-product">
                                <div class="product-f-image">
                                    <img src="img/producto-1.jpg" alt="">
                                    <div class="product-hover">
                                        <a href="cart.jsp" class="add-to-cart-link"><i class="fa fa-shopping-cart"></i> A&ntilde;adir</a>
                                        <a href="single-product.jsp" class="view-details-link"><i class="fa fa-link"></i> Ver detalles</a>
                                    </div>
                                </div>
                                
                                <h2><a href="single-product.jsp">Bicicleta de Paseo</a></h2>
                                
                                <div class="product-carousel-price">
                                    <ins>150&euro;</ins>
                                </div> 
                            </div>
                            <div class="single-product">
                                <div class="product-f-image">
                                    <img src="img/producto-2.jpg" alt="">
                                    <div class="product-hover">
                                        <a href="cart.jsp" class="add-to-cart-link"><i class="fa fa-shopping-cart"></i> A&ntilde;adir</a>
                                        <a href="single-product.jsp" class="view-details-link"><i class="fa fa-link"></i> Ver detalles</a>
                                    </div>
                                </div>
                                
                                <h2><a href="single-product.jsp">Colgante hecho con botones</a></h2>
                                <div class="product-carousel-price">
                                    <ins>20&euro;</ins>
                                </div> 
                            </div>
                            <div class="single-product">
                                <div class="product-f-image">
                                    <img src="img/producto-3.jpg" alt="">
                                    <div class="product-hover">
                                        <a href="cart.jsp" class="add-to-cart-link"><i class="fa fa-shopping-cart"></i> A&ntilde;adir</a>
                                        <a href="single-product.jsp" class="view-details-link"><i class="fa fa-link"></i> Ver detalles</a>
                                    </div>
                                </div>
                                
                                <h2><a href="single-product.jsp">Bicicleta plegable el&eacute;ctrica</a></h2>

                                <div class="product-carousel-price">
                                    <ins>345&euro;</ins>
                                </div>                                 
                            </div>
                            <div class="single-product">
                                <div class="product-f-image">
                                    <img src="img/producto-4.jpg" alt="">
                                    <div class="product-hover">
                                        <a href="cart.jsp" class="add-to-cart-link"><i class="fa fa-shopping-cart"></i> A&ntilde;adir</a>
                                        <a href="single-product.jsp" class="view-details-link"><i class="fa fa-link"></i> Ver detalles</a>
                                    </div>
                                </div>
                                
                                <h2><a href="single-product.jsp">Seat Ibiza 1997 Azul</a></h2>

                                <div class="product-carousel-price">
                                    <ins>900&euro;</ins><del>1000&euro;</del>
                                </div>                            
                            </div>
                            <div class="single-product">
                                <div class="product-f-image">
                                    <img src="img/producto-5.jpg" alt="">
                                    <div class="product-hover">
                                        <a href="cart.jsp" class="add-to-cart-link"><i class="fa fa-shopping-cart"></i> A&ntilde;adir</a>
                                        <a href="single-product.jsp" class="view-details-link"><i class="fa fa-link"></i> Ver detalles</a>
                                    </div>
                                </div>
                                
                                <h2><a href="single-product.jsp">Pulsera Abalorios Multicolor</a></h2>

                                <div class="product-carousel-price">
                                    <ins>5&euro;</ins> <del>10&euro;</del>
                                </div>                                 
                            </div>
                            <div class="single-product">
                                <div class="product-f-image">
                                    <img src="img/producto-6.jpg" alt="">
                                    <div class="product-hover">
                                        <a href="cart.jsp" class="add-to-cart-link"><i class="fa fa-shopping-cart"></i> A&ntilde;adir</a>
                                        <a href="single-product.jsp" class="view-details-link"><i class="fa fa-link"></i> Ver detalles</a>
                                    </div>
                                </div>
                                
                                <h2><a href="single-product.jsp">Conjunto pendientes y anillo></h2>

                                <div class="product-carousel-price">
                                    <ins>15&euro;</ins>
                                </div>                            
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div> <!-- End main content area -->
    
    <%--<div class="brands-area">
        <div class="zigzag-bottom"></div>
        <div class="container">
            <div class="row">
                <div class="col-md-12">
                    <div class="brand-wrapper">
                        <h2 class="section-title">Escuelas</h2>
                        <div class="brand-list">
                            <img src="img/services_logo__1.jpg" alt="">
                            <img src="img/services_logo__2.jpg" alt="">
                            <img src="img/services_logo__3.jpg" alt="">
                            <img src="img/services_logo__4.jpg" alt="">                         
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div> <!-- End brands area -->--%>
    
                <%-- <div class="col-md-4">
                    <div class="single-product-widget">
                        <h2 class="product-wid-title">M&aacute;s Recientes</h2>
                        <a href="#" class="wid-view-more">Ver Todos</a>
                        <div class="single-wid-product">
                            <a href="single-product.jsp"><img src="img/product-thumb-3.jpg" alt="" class="product-thumb"></a>
                            <h2><a href="single-product.jsp">Apple new i phone 6</a></h2>
                            <div class="product-wid-rating">
                                <i class="fa fa-star"></i>
                                <i class="fa fa-star"></i>
                                <i class="fa fa-star"></i>
                                <i class="fa fa-star"></i>
                                <i class="fa fa-star"></i>
                            </div>
                            <div class="product-wid-price">
                                <ins>400&euro;</ins> <del>425&euro;</del>
                            </div>                            
                        </div>
                        <div class="single-wid-product">
                            <a href="single-product.jsp"><img src="img/product-thumb-4.jpg" alt="" class="product-thumb"></a>
                            <h2><a href="single-product.jsp">Samsung gallaxy note 4</a></h2>
                            <div class="product-wid-rating">
                                <i class="fa fa-star"></i>
                                <i class="fa fa-star"></i>
                                <i class="fa fa-star"></i>
                                <i class="fa fa-star"></i>
                                <i class="fa fa-star"></i>
                            </div>
                            <div class="product-wid-price">
                                <ins>400&euro;</ins> <del>425&euro;</del>
                            </div>                            
                        </div>
                        <div class="single-wid-product">
                            <a href="single-product.jsp"><img src="img/product-thumb-1.jpg" alt="" class="product-thumb"></a>
                            <h2><a href="single-product.jsp">Sony playstation microsoft</a></h2>
                            <div class="product-wid-rating">
                                <i class="fa fa-star"></i>
                                <i class="fa fa-star"></i>
                                <i class="fa fa-star"></i>
                                <i class="fa fa-star"></i>
                                <i class="fa fa-star"></i>
                            </div>
                            <div class="product-wid-price">
                                <ins>400&euro;</ins> <del>425&euro;</del>
                            </div>                            
                        </div>
                    </div>
                </div> --%>
            </div>
        </div>
    </div> <!-- End product widget area -->
    
    <%@include file="footer.jsp" %>

  </body>
</html>