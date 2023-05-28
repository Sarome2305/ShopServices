package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import javax.servlet.http.HttpServletRequest;

public final class Registro_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta charset=\"utf-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\n");
      out.write("        <title>Registro de clientes</title>\n");
      out.write("        <link rel=\"icon\" type=\"image/svg+xml\" href=\"r.ico\" />\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/twitter-bootstrap/4.6.0/css/bootstrap.min.css\">\n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"container py-5\">\n");
      out.write("            <div class=\"row justify-content-center\">\n");
      out.write("                <div class=\"col-lg-6\">\n");
      out.write("                    <form class=\"form-register\" action=\"RegistrarCliente\" method=\"POST\" onsubmit=\"guardarDatos(event)\">\n");
      out.write("                        <div class=\"register text-center\">\n");
      out.write("                            <h3>Sign in</h3>\n");
      out.write("                        </div>\n");
      out.write("                        <br>\n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                            <label for=\"txtDni\">DNI:</label>\n");
      out.write("                            <input type=\"text\" id=\"txtDni\" name=\"txtDni\" class=\"form-control\">\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                            <label for=\"txtNombres\">Nombres:</label>\n");
      out.write("                            <input type=\"text\" id=\"txtNombres\" name=\"txtNombres\" class=\"form-control\">\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                            <label for=\"txtDireccion\">Dirección:</label>\n");
      out.write("                            <input type=\"text\" id=\"txtDireccion\" name=\"txtDireccion\" class=\"form-control\">\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                            <label for=\"txtTelefono\">Teléfono:</label>\n");
      out.write("                            <input type=\"text\" id=\"txtTelefono\" name=\"txtTelefono\" class=\"form-control\">\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                            <label for=\"txtUser\">Usuario:</label>\n");
      out.write("                            <input type=\"text\" id=\"txtUser\" name=\"txtUser\" class=\"form-control\">\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                            <label for=\"txtPass\">Contraseña:</label>\n");
      out.write("                            <input type=\"text\" id=\"txtPass\" name=\"txtPass\" class=\"form-control\">\n");
      out.write("                        </div>\n");
      out.write("                        <br>\n");
      out.write("                        <input type=\"submit\" name=\"accion\" value=\"Registrar\" class=\"btn btn-primary btn-block\" onclick=\"mostrarMensaje()\">\n");
      out.write("                    </form>\n");
      out.write("                    <center>\n");
      out.write("                        <br>\n");
      out.write("                        <a style=\"border: none\" class=\"btn btn-outline-light\" href=\"index.jsp\">Regresar al Inicio</a>\n");
      out.write("                    </center>\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <style>\n");
      out.write("            body{\n");
      out.write("                background-image: url(https://wallpapercave.com/wp/wp8422340.jpg);\n");
      out.write("                background-size: cover;\n");
      out.write("                background-position: center;\n");
      out.write("                color: white;\n");
      out.write("\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("\n");
      out.write("\n");
      out.write("    </body>\n");
      out.write("\n");
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
