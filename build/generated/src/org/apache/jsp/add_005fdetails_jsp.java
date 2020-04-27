package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class add_005fdetails_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>add details</title>\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css\" crossorigin=\"anonymous\">\n");
      out.write("        <style>\n");
      out.write("            body\n");
      out.write("            {\n");
      out.write("                background-image: url(\"https://images.wallpaperscraft.com/image/wedding_newlyweds_couple_romance_love_113876_1366x768.jpg\");\n");
      out.write("                color:white;background-repeat: no-repeat;\n");
      out.write("  background-attachment: fixed;            \n");
      out.write("            }\n");
      out.write("            .dashboard\n");
      out.write("            {\n");
      out.write("                height: 60px;\n");
      out.write("                width: 100%;\n");
      out.write("                background: black;\n");
      out.write("                opacity: 0.5;\n");
      out.write("                color: white;\n");
      out.write("            }\n");
      out.write("            ul li{\n");
      out.write("                display: inline-block;\n");
      out.write("                padding: 15px;\n");
      out.write("                /*color: white*/\n");
      out.write("            }\n");
      out.write("            ul li button{\n");
      out.write("                color: white;\n");
      out.write("                background: transparent;\n");
      out.write("                border-radius: 10px;\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        \n");
      out.write("        <div class=\"dashboard\">\n");
      out.write("            <ul>\n");
      out.write("                <li>\n");
      out.write("                    <button onclick=\"location.href='http://localhost:8080/jspProject/add_details.jsp';\">Add Profiles</button>\n");
      out.write("                </li>\n");
      out.write("                <li>\n");
      out.write("                    <button onclick=\"location.href='http://localhost:8080/jspProject/view_details.jsp';\">View Profiles</button>\n");
      out.write("                </li>\n");
      out.write("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        \n");
      out.write("            </ul>\n");
      out.write("        </div>\n");
      out.write("        \n");
      out.write("        <div class=\"col-md-6 ml-3\" style=\"margin-top:20px\">\n");
      out.write("            <form action=\"addDetails\" method=\"post\">\n");
      out.write("                    <div class=\"form-row form-group\">    \n");
      out.write("                        <div class=\"col\">\n");
      out.write("                            <input type=\"text\" class=\"form-control\" name=\"fname\" placeholder=\"First Name\">\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"col\">\n");
      out.write("                            <input type=\"text\" class=\"form-control\" name=\"mname\" placeholder=\"Middle Name\">\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"col\">\n");
      out.write("                            <input type=\"text\" class=\"form-control\" name=\"lname\" placeholder=\"Last Name\">                    \n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                <div class=\"form-group\">\n");
      out.write("                    <!--<label for=\"age\">Age</label>-->\n");
      out.write("                    <input type=\"number\" class=\"form-control\" name=\"age\" placeholder=\"Age\">    \n");
      out.write("                </div>\n");
      out.write("                <div class=\"form-group\">\n");
      out.write("                    <div class=\"form-check form-check-inline\">\n");
      out.write("                    <input class=\"form-check-input\" type=\"radio\" name=\"gender\" id=\"male\" value=\"male\">\n");
      out.write("                    <label class=\"form-check-label\" for=\"male\">Male</label>\n");
      out.write("                  </div>\n");
      out.write("                  <div class=\"form-check form-check-inline\">\n");
      out.write("                    <input class=\"form-check-input\" type=\"radio\" name=\"gender\" id=\"female\" value=\"female\">\n");
      out.write("                    <label class=\"form-check-label\" for=\"female\">Female</label>\n");
      out.write("                  </div>\n");
      out.write("                </div>\n");
      out.write("                 <div class=\"form-group\">\n");
      out.write("                    <!--<label for=\"dob\">DOB</label>-->\n");
      out.write("                    <input type=\"date\" class=\"form-control\" name=\"dob\" placeholder=\"DOB\">    \n");
      out.write("                </div>\n");
      out.write("                \n");
      out.write("                <div class=\"form-group\">                    \n");
      out.write("                    <input type=\"text\" class=\"form-control\" name=\"occupation\" placeholder=\"Occupation\">    \n");
      out.write("                </div>\n");
      out.write("                <div class=\"form-group\">                    \n");
      out.write("                    <input type=\"text\" class=\"form-control\" name=\"address\" placeholder=\"Address\">    \n");
      out.write("                </div>\n");
      out.write("                <div class=\"form-row form-group\">    \n");
      out.write("                        <div class=\"col\">\n");
      out.write("                            <label for=\"height\">Height (in cms)</label>\n");
      out.write("                            <input type=\"number\" class=\"form-control\" name=\"height\">                            \n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"col\">\n");
      out.write("                            <label for=\"weight\">Weight ( in kg)</label>\n");
      out.write("                            <input type=\"number\" class=\"form-control\" name=\"weight\">                            \n");
      out.write("                        </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-md-3 mb-3\">\n");
      out.write("                    <label for=\"nationality\">Nationality</label>\n");
      out.write("                    <select class=\"custom-select\" name=\"nationality\" required>\n");
      out.write("                      <option selected value=\"indian\">Indian</option>\n");
      out.write("                      <option value=\"british\">British</option>\n");
      out.write("                      <option value=\"irish\">Irish</option>\n");
      out.write("                      <option value=\"scottish\">Scottish</option>\n");
      out.write("                    </select>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"form-group\">                   \n");
      out.write("                    <input type=\"text\" class=\"form-control\" name=\"contact\" placeholder=\"Contact\">    \n");
      out.write("                </div>\n");
      out.write("                <div class=\"form-group\">                    \n");
      out.write("                    <input type=\"number\" class=\"form-control\" name=\"salary\" placeholder=\"Salary\">    \n");
      out.write("                </div>\n");
      out.write("                <div class=\"form-group\">                    \n");
      out.write("                    <input type=\"text\" class=\"form-control\" name=\"education\" placeholder=\"Education\">    \n");
      out.write("                </div>\n");
      out.write("  \n");
      out.write("  <button type=\"submit\" class=\"btn btn-primary\">Submit</button>\n");
      out.write("</form>\n");
      out.write("        </div>\n");
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
