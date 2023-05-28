package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Nosotros_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css\" integrity=\"sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T\" crossorigin=\"anonymous\">\n");
      out.write("        <link rel=\"icon\" type=\"image/svg+xml\" href=\"r.ico\" />\n");
      out.write("        <link rel=\"stylesheet\" href=\"Styles/stylenosotros.css\">\n");
      out.write("\n");
      out.write("        <title>Nosotros</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"center\">\n");
      out.write("            ¿Qué somos?\n");
      out.write("        </div>\n");
      out.write("    <center>\n");
      out.write("        <div class=\"par2\">\n");
      out.write("            Somos una plataforma dedicada a brindar a nuestros clientes una experiencia de compra en línea fácil y segura, desde la comodidad de su hogar. <hr> <a href=\"index.jsp\">Inicio<a/>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("    </center>\n");
      out.write("          <div class=\"container\">\n");
      out.write("            <h1>Nuestros Servicios</h1>\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-sm-6\">\n");
      out.write("                    <div class=\"card\">\n");
      out.write("                        <img src=\"img/servicio1.jpg\" class=\"card-img-top\" alt=\"Servicio 1\">\n");
      out.write("                        <div class=\"card-body\">\n");
      out.write("                            <h5 class=\"card-title\">Servicio 1</h5>\n");
      out.write("                            <p class=\"card-text\">Este es el primer servicio que ofrecemos. Ofrecemos un gran valor para nuestros clientes y estamos comprometidos a garantizar su satisfacción.</p>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-sm-6\">\n");
      out.write("                    <div class=\"card\">\n");
      out.write("                        <img src=\"img/servicio2.jpg\" class=\"card-img-top\" alt=\"Servicio 2\">\n");
      out.write("                        <div class=\"card-body\">\n");
      out.write("                            <h5 class=\"card-title\">Servicio 2</h5>\n");
      out.write("                            <p class=\"card-text\">Este es el segundo servicio que ofrecemos. Nuestro equipo está altamente capacitado y comprometido a brindar la mejor experiencia a nuestros clientes.</p>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </body>\n");
      out.write("</body>\n");
      out.write("</html>\n");
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
