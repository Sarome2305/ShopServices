
<%@page session="true"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<html lang="en">
    <head>
        <meta charset="UTF-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <link rel="icon" type="image/svg+xml" href="r.ico" />
        <link rel="stylesheet" href="Styles/stylesindex.css">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>Computer Store</title>
    </head>
    <body>
        <header>
            <div class="header-section container">
                <img src="img/editadologo.png" alt="Compustore" width="100px" height="100px" />
                <div>
                    <img onclick="showCart(this)" class="cart" src="https://cdn-icons-png.flaticon.com/512/3649/3649552.png" alt="60px">
                    <p class="count-product">0</p>
                </div>
                <div class="cart-products" id="products-id">
                    <p class="close-btn" onclick="closeBtn()">X</p>
                    <h3>Mi carrito</h3>
                    <div class="card-items"></div>
                    <h2>Total: $<strong class="price-total" id="total">0</strong></h2>
                    <div class="form-container">
                        <button onclick="showForm()" id="finalizar-compra-btn" style="display: block;">Continuar</button>
                        <form id="myForm" style="display: none;"> <hr>

                            <h5>¡Carrito guardado correctamente! Rellene el siguiente formulario para finalizar su compra.</h5><hr>

                            <b><label for="nombre">Nombre completo:</label></b>
                            <input type="text" id="nombre" name="nombre" required>
                            <b><label for="idcliente">Identificacion:</label></b>
                            <input type="text" id="idcliente" name="idcliente" required>
                            <br>
                            <b><label for="direccion">Dirección:</label></b>
                            <input type="text" id="direccion" name="direccion" required>
                            <br>
                            <b><label for="telefono">Teléfono:</label></b>
                            <input type="tel" id="telefono" name="telefono" required>
                            <br>
                            <b><label for="metodo-pago">Método de pago:</label></b>
                            <select id="metodo-pago" name="metodo-pago" required>
                                <b><option value="">Selecciona una opción</option></b>
                                <option value="Pse">Pse</option>
                                <option value="transferencia">Transferencia bancaria</option>
                            </select>
                            <hr>
                            <button type="submit" onclick="sendCartByWhatsApp()">Enviar por Whatsapp</button>

                        </form>
                    </div
                </div>
        </header>
        <section class="container">
            <div class="products">
                <div class="carts">
                    <div>
                        <img src="img/memoria.jpg" alt=""/>
                        <p>$<span>15000</span></p>
                    </div>
                    <p class="title">Memoria USB 8GB</p>
                    <a href="" data-id="1" class="btn-add-cart">Comprar</a>
                </div>
                <div class="carts">
                    <div>
                        <img src="img/monitor.jpg" alt=""/>
                        <p>$<span>1200000</span></p>
                    </div>
                    <p class="title"> Monitor Samsung 4k</p>
                    <a href="" class="btn-add-cart" data-id="2">Comprar</a>
                </div>
                <div class="carts">
                    <div>
                        <img src="img/mouse.jpg" alt="">
                        <p>$<span>150000</span></p>
                    </div>
                    <p class="title"> Mouse Gamer Logitech</p>
                    <a href="" data-id="3" class="btn-add-cart">Comprar</a>
                </div>
                <div class="carts">
                    <div>
                        <img src="img/chasis.jpg" alt="">
                        <p>$<span>450000</span></p>
                    </div>
                    <p class="title"> Chasis Cpu Gamer Asus</p>
                    <a href="" data-id="4" class="btn-add-cart">Comprar</a>
                </div>
                <div class="carts">
                    <div>
                        <img src="img/teclado.jpg" alt="">
                        <p>$<span>200000</span></p>
                    </div>
                    <p class="title"> Teclado Mecanico Redragon</p>
                    <a href="" data-id="5" class="btn-add-cart">Comprar</a>
                </div>
                <div class="carts">
                    <div>
                        <img src="img/grafica.jpg" alt="">
                        <p>$<span>3000000</span></p>
                    </div>
                    <p class="title"> Tarjeta Grafica Nvidia Geforce RTX 3080</p>
                    <a href="" data-id="6" class="btn-add-cart">Comprar</a>
                </div>
                <div class="carts">
                    <div>
                        <img src="img/portatil.jpg" alt="">
                        <p>$<span>1500000</span></p>
                    </div>
                    <p class="title"> Portatil ASUS Vivobook</p>
                    <a href="" data-id="7" class="btn-add-cart">Comprar</a>
                </div>
                <div class="carts">
                    <div>
                        <img src="img/disco.jpg" alt="">
                        <p>$<span>500000</span></p>
                    </div>
                    <p class="title"> Disco SSD 1 TERA</p>
                    <a href="" data-id="8" class="btn-add-cart">Comprar</a>
                </div>
            </div>
        </section>
        <a href="https://api.whatsapp.com/send?phone=573023268469&text=hola%20hebert" target="_blank"></a>
        <div>
            <div>
                <form id="formulariowtsp" action="" class="formulariowtsp">
                    <p class="newmessagewts">Ticket</p> <span class="closemodal">x</span>
                    <label for="">Nombre</label>
                    <input id="inputname" class="inputwts" type="text" required="" placeholder="Nombre" autocomplete="off">
                    <label for="">¿Tienes algún problema?</label>
                    <textarea id="inputmensaje" name="mensaje" id="" cols="30" rows="10" class="textareawts" placeholder="Déjanos tu mensaje aquí" required=""></textarea>
                    <button type="submit" id="sendbttn" class="btnwtsp">Enviar mensaje</button>
                </form>
            </div>
            <img id="icon-whatsapp" class="image-icon-whatsapp" src="img/whatsapp.webp" alt="" width="70">
        </div>
        <footer>
            <p class="author">Derechos Reservados © 2023 Computer Store Inc.</p>
            <center>
                <p>Siguenos en nuestras redes sociales.</p>
                <a href="https://www.instagram.com/"><img src="https://th.bing.com/th/id/R.4159d4fdfa9c7b2bfb9554c056c39f9f?rik=bboqCWj0zWomAQ&riu=http%3a%2f%2fwww.knac.com%2fimages%2finstagram.jpg&ehk=zVrTD4epve5wPxqhYjEP0ZA3lSpagirtl6DQyrTjB6w%3d&risl=&pid=ImgRaw&r=0" alt="" width="50px" > </a>
                <a href="https://www.facebook.com/"><img src="https://i.pinimg.com/736x/26/a2/85/26a2857a33ac96048936429b907be8ba.jpg" alt="" width="50px" > </a>
            </center>
            <hr>
            <p>¿Quieres saber a cerca de nosotros? <a href="Nosotros.jsp">Click aquí</a></p>
            <a href="Login.jsp"><img src="https://i.pinimg.com/originals/f4/38/f3/f438f3600d2690018f981c66e7935b49.png" alt="" width="60px"></a>
            <style>
                a{
                    color:white;
                }
                body{
                    background: rgb(2,0,36);
                    background-image: url(https://th.bing.com/th/id/R.a91af503ca642cb5d0eb9fce10111ef6?rik=yYMapPlPWbTgvw&riu=http%3a%2f%2fimg.artlebedev.ru%2feverything%2falfabank%2fsite5%2fmake_money.jpg&ehk=67Il7Zu%2baq2HJBTvZyC63ZlYTSVsJBfEoDiIv0cC6cs%3d&risl=&pid=ImgRaw&r=0);
                    background-size: cover;
                    background-position: center;
                }
            </style>
        </footer>
        <script src="js/custom.js" ></script>
    </div>
</body>
</html>