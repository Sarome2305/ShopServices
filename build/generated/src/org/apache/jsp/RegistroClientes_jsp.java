package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.SQLException;
import java.sql.*;

public final class RegistroClientes_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html; charset=UTF-8");
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
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("        <title>Registro de clientes</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <h1>Registro de clientes</h1>\n");
      out.write("\n");
      out.write("        <form action=\"Controlador?menu=Cliente\" method=\"POST\">\n");
      out.write("            <div class=\"form-group\">\n");
      out.write("                <label>Dni</label>\n");
      out.write("                <input type=\"text\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${cliente.getDni()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" name=\"txtDni\" class=\"form-control\">\n");
      out.write("            </div>\n");
      out.write("            <div class=\"form-group\">\n");
      out.write("                <label>Nombres</label>\n");
      out.write("                <input type=\"text\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${cliente.getNom()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" name=\"txtNombres\" class=\"form-control\">\n");
      out.write("            </div>\n");
      out.write("            <div class=\"form-group\">\n");
      out.write("                <label>Direccion</label>\n");
      out.write("                <input type=\"text\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${cliente.getDir()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" name=\"txtTel\" class=\"form-control\">\n");
      out.write("            </div>           \n");
      out.write("            <div class=\"form-group\">\n");
      out.write("                <label>Telefono</label>\n");
      out.write("                <input type=\"text\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${cliente.getEs()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" name=\"txtEstado\" class=\"form-control\">\n");
      out.write("            </div>      \n");
      out.write("            <input type=\"submit\" name=\"accion\" value=\"Registrar\" class=\"btn btn-primary\">\n");
      out.write("\n");
      out.write("        </form>\n");
      out.write("    </body>\n");
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
