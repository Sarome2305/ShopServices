package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("<html lang=\"en\">\n");
      out.write("    <head>\n");
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("        <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("        <link rel=\"icon\" type=\"image/svg+xml\" href=\"r.ico\" />\n");
      out.write("        <link rel=\"stylesheet\" href=\"Styles/styleinicio.css\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("        <title>Computer Store</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("   \n");
      out.write("        <header>\n");
      out.write("            <div class=\"header-section container\">\n");
      out.write("                <a href=\"Login.jsp\"><img src=\"https://i.pinimg.com/originals/f4/38/f3/f438f3600d2690018f981c66e7935b49.png\" alt=\"\" width=\"50px\"></a>\n");
      out.write("                <img  class=\"logo\" src=\"img/Comstore.png\" alt=\"\"/>\n");
      out.write("\n");
      out.write("                <div>\n");
      out.write("                    <img onclick=\"showCart(this)\" class=\"cart\" src=\"https://purepng.com/public/uploads/large/purepng.com-shopping-cartshoppingcarttrolleycarriagebuggysupermarkets-1421526532323sy0um.png\" alt=\"\">\n");
      out.write("                    <p class=\"count-product\">0</p>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"cart-products\" id=\"products-id\">\n");
      out.write("                    <p class=\"close-btn\" onclick=\"closeBtn()\">X</p>\n");
      out.write("\n");
      out.write("                    <h3>Mi carrito</h3>\n");
      out.write("                    <div class=\"card-items\"></div>\n");
      out.write("                    <h2>Total: $<strong class=\"price-total\" id=\"total\">0</strong></h2>\n");
      out.write("                    <div class=\"form-container\">\n");
      out.write("                        <button onclick=\"showForm()\" id=\"finalizar-compra-btn\" style=\"display: block; margin: 50px; width: 200px; height: 50px\">Finalizar Compra</button>\n");
      out.write("                        <form id=\"myForm\" style=\"display: none;\"> <hr>\n");
      out.write("\n");
      out.write("                            <h5>¡Carrito guardado correctamente! Rellene el siguiente formulario para finalizar su compra.</h5><hr>\n");
      out.write("\n");
      out.write("                            <b><label for=\"nombre\">Nombre completo:</label></b>\n");
      out.write("                            <input type=\"text\" id=\"nombre\" name=\"nombre\" required>\n");
      out.write("                            <b><label for=\"idcliente\">Identificacion:</label></b>\n");
      out.write("                            <input type=\"text\" id=\"idcliente\" name=\"idcliente\" required>\n");
      out.write("                            <br>\n");
      out.write("                            <b><label for=\"direccion\">Dirección:</label></b>\n");
      out.write("                            <input type=\"text\" id=\"direccion\" name=\"direccion\" required>\n");
      out.write("                            <br>\n");
      out.write("                            <b><label for=\"telefono\">Teléfono:</label></b>\n");
      out.write("                            <input type=\"tel\" id=\"telefono\" name=\"telefono\" required>\n");
      out.write("                            <br>\n");
      out.write("                            <b><label for=\"metodo-pago\">Método de pago:</label></b>\n");
      out.write("                            <select id=\"metodo-pago\" name=\"metodo-pago\" required>\n");
      out.write("                                <b><option value=\"\">Selecciona una opción</option></b>\n");
      out.write("                                <option value=\"Pse\">Pse</option>\n");
      out.write("                                <option value=\"transferencia\">Transferencia bancaria</option>\n");
      out.write("                            </select>\n");
      out.write("                            <hr>\n");
      out.write("                            <button type=\"submit\" onclick=\"sendCartByWhatsApp()\">Enviar por Whatsapp</button>\n");
      out.write("                        </form>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("        </header>\n");
      out.write("\n");
      out.write("        <section class=\"container\">\n");
      out.write("            <div class=\"products\">\n");
      out.write("                <div class=\"carts\">\n");
      out.write("                    <div>\n");
      out.write("                        <img src=\"img/memoria.jpg\" alt=\"\"/>\n");
      out.write("                        <p>$<span>15000</span></p>\n");
      out.write("                    </div>\n");
      out.write("                    <p class=\"title\">Memoria USB 8GB</p>\n");
      out.write("                    <a href=\"\" data-id=\"1\" class=\"btn-add-cart\">Comprar</a>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"carts\">\n");
      out.write("                    <div>\n");
      out.write("                        <img src=\"img/monitor.jpg\" alt=\"\"/>\n");
      out.write("                        <p>$<span>1200000</span></p>\n");
      out.write("                    </div>\n");
      out.write("                    <p class=\"title\"> Monitor Samsung 4k</p>\n");
      out.write("                    <a href=\"\" class=\"btn-add-cart\" data-id=\"2\">Comprar</a>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"carts\">\n");
      out.write("                    <div>\n");
      out.write("                        <img src=\"img/mouse.jpg\" alt=\"\">\n");
      out.write("                        <p>$<span>150000</span></p>\n");
      out.write("                    </div>\n");
      out.write("                    <p class=\"title\"> Mouse Gamer Logitech</p>\n");
      out.write("                    <a href=\"\" data-id=\"3\" class=\"btn-add-cart\">Comprar</a>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"carts\">\n");
      out.write("                    <div>\n");
      out.write("                        <img src=\"img/chasis.jpg\" alt=\"\">\n");
      out.write("                        <p>$<span>450000</span></p>\n");
      out.write("                    </div>\n");
      out.write("                    <p class=\"title\"> Chasis Cpu Gamer Asus</p>\n");
      out.write("                    <a href=\"\" data-id=\"4\" class=\"btn-add-cart\">Comprar</a>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"carts\">\n");
      out.write("                    <div>\n");
      out.write("                        <img src=\"img/teclado.jpg\" alt=\"\">\n");
      out.write("                        <p>$<span>200000</span></p>\n");
      out.write("                    </div>\n");
      out.write("                    <p class=\"title\"> Teclado Mecanico Redragon</p>\n");
      out.write("                    <a href=\"\" data-id=\"5\" class=\"btn-add-cart\">Comprar</a>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"carts\">\n");
      out.write("                    <div>\n");
      out.write("                        <img src=\"img/grafica.jpg\" alt=\"\">\n");
      out.write("                        <p>$<span>3000000</span></p>\n");
      out.write("                    </div>\n");
      out.write("                    <p class=\"title\"> Tarjeta Grafica Nvidia Geforce RTX 3080</p>\n");
      out.write("                    <a href=\"\" data-id=\"6\" class=\"btn-add-cart\">Comprar</a>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"carts\">\n");
      out.write("                    <div>\n");
      out.write("                        <img src=\"img/portatil.jpg\" alt=\"\">\n");
      out.write("                        <p>$<span>1500000</span></p>\n");
      out.write("                    </div>\n");
      out.write("                    <p class=\"title\"> Portatil ASUS Vivobook</p>\n");
      out.write("                    <a href=\"\" data-id=\"7\" class=\"btn-add-cart\">Comprar</a>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"carts\">\n");
      out.write("                    <div>\n");
      out.write("                        <img src=\"img/disco.jpg\" alt=\"\">\n");
      out.write("                        <p>$<span>500000</span></p>\n");
      out.write("                    </div>\n");
      out.write("                    <p class=\"title\"> Disco SSD 1 TERA</p>\n");
      out.write("                    <a href=\"\" data-id=\"8\" class=\"btn-add-cart\">Comprar</a>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </section>\n");
      out.write("        <a href=\"https://api.whatsapp.com/send?phone=942885252&text=hola%20hebert\" target=\"_blank\"></a>\n");
      out.write("        <div>\n");
      out.write("            <div>\n");
      out.write("                <form id=\"formulariowtsp\" action=\"\" class=\"formulariowtsp\">\n");
      out.write("                    <p class=\"newmessagewts\">Ticket</p> <span class=\"closemodal\">x</span>\n");
      out.write("                    <label for=\"\">Nombre</label>\n");
      out.write("                    <input id=\"inputname\" class=\"inputwts\" type=\"text\" required=\"\" placeholder=\"Nombre\" autocomplete=\"off\">\n");
      out.write("                    <label for=\"\">¿Tienes algún problema?</label>\n");
      out.write("                    <textarea id=\"inputmensaje\" name=\"mensaje\" id=\"\" cols=\"30\" rows=\"10\" class=\"textareawts\" placeholder=\"Déjanos tu mensaje aquí\" required=\"\"></textarea>\n");
      out.write("                    <button type=\"submit\" id=\"sendbttn\" class=\"btnwtsp\">Enviar mensaje</button>\n");
      out.write("                </form>\n");
      out.write("            </div>\n");
      out.write("            <img id=\"icon-whatsapp\" class=\"image-icon-whatsapp\" src=\"img/whatsapp.webp\" alt=\"\" width=\"70\">\n");
      out.write("        </div>\n");
      out.write("        <footer>\n");
      out.write("            <p class=\"author\">Derechos Reservados © 2023 ShopServices Inc.</p>\n");
      out.write("            <center>\n");
      out.write("                <p>Siguenos en nuestras redes sociales.</p>\n");
      out.write("                <a href=\"https://www.instagram.com/\"><img src=\"https://th.bing.com/th/id/R.4159d4fdfa9c7b2bfb9554c056c39f9f?rik=bboqCWj0zWomAQ&riu=http%3a%2f%2fwww.knac.com%2fimages%2finstagram.jpg&ehk=zVrTD4epve5wPxqhYjEP0ZA3lSpagirtl6DQyrTjB6w%3d&risl=&pid=ImgRaw&r=0\" alt=\"\" width=\"50px\" > </a>\n");
      out.write("                <a href=\"https://www.facebook.com/\"><img src=\"https://i.pinimg.com/736x/26/a2/85/26a2857a33ac96048936429b907be8ba.jpg\" alt=\"\" width=\"50px\" > </a>\n");
      out.write("            </center>\n");
      out.write("            <hr>\n");
      out.write("            <p>¿Quieres saber a cerca de nosotros? <a href=\"Nosotros.jsp\">Click aquí</a></p>\n");
      out.write("                <style>\n");
      out.write("                    a{\n");
      out.write("                        color:white;\n");
      out.write("                    }\n");
      out.write("                </style>\n");
      out.write("        </footer>\n");
      out.write("        <script src=\"js/custom.js\" ></script>\n");
      out.write("    </div>\n");
      out.write("</body>\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
