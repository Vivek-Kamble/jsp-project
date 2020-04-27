package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class view_005fdetails_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>view details</title>\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css\" crossorigin=\"anonymous\">\n");
      out.write("        <style>\n");
      out.write("            .card\n");
      out.write("            {\n");
      out.write("                display: inline-block;\n");
      out.write("                background-color: #bdc3c7;\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        \n");
      out.write("        <div class=\"container col-md-9\">\n");
      out.write("            <!--<h1 style=\"margin-top:50px;\">View Details</h1>-->\n");
      out.write("        ");

         Class.forName("com.mysql.jdbc.Driver");//forname method of Class class is used
            
            //2.Establish the connection
           //xampp
            Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3307/jspproject","root","");
            Statement s = con.createStatement();
            ResultSet rs=s.executeQuery("select fname,lname,age,dob,phone,id from details");
            while(rs.next())
            {
                
      out.write("\n");
      out.write("                \n");
      out.write("                <div class=\"card\" style=\"width:300px;margin-top: 20px;\">\n");
      out.write("                <div class=\"card-body\">\n");
      out.write("                  <h5 class=\"card-title name\">");
      out.print(rs.getString(1));
      out.write(" </h5>\n");
      out.write("                  <h5></h5>\n");
      out.write("                  <h5 class=\"card-title name\">");
      out.print(rs.getString(2));
      out.write("</h5>\n");
      out.write("                  <h6 class=\"card-subtitle mb-2 text-muted age\">");
      out.print(rs.getInt(3));
      out.write("</h6>\n");
      out.write("                  <h6 class=\"card-subtitle mb-2 text-muted contact\">");
      out.print(rs.getString(4));
      out.write("</h6>\n");
      out.write("                  <h6 class=\"card-subtitle mb-2 text-muted contact\">");
      out.print(rs.getString(5));
      out.write("</h6>\n");
      out.write("                  <h5 class=\"card-title name\" style=\"display:hidden\">");
      out.print(rs.getInt(6));
      out.write("</h5>\n");
      out.write("                  <!--<input type=\"hidden\" value=\"\">-->\n");
      out.write("                  <a href=\"delete_details?del=");
      out.print(rs.getInt(6));
      out.write("\" class=\"card-link btn btn-danger\">\n");
      out.write("                \n");
      out.write("                    Delete</a>\n");
      out.write("                  <button class=\"card-link btn btn-primary\" onclick=\"copyData(this)\">Update</button>\n");
      out.write("                </div>\n");
      out.write("              </div>\n");
      out.write("                ");

            }
            
               
        
      out.write("\n");
      out.write("        </div>\n");
      out.write("         <div class=\"container col-md-6\" style=\"margin-top: 50px;\">\n");
      out.write("            <h1>Update Student Details</h1>\n");
      out.write("            \n");
      out.write("            <form action=\"updateDetails\" method=\"get\">\n");
      out.write("            <input class=\"dispName form-control\" type=\"text\" name=\"fname\" placeholder=\"name\" style=\"margin-top: 20px\">\n");
      out.write("            <input class=\"dispName form-control\" type=\"text\" name=\"mname\" placeholder=\"name\" style=\"margin-top: 20px\">\n");
      out.write("            <input class=\"dispName form-control\" type=\"text\" name=\"lname\" placeholder=\"name\" style=\"margin-top: 20px\">\n");
      out.write("            <input class=\"number form-control\" type=\"number\" name=\"age\" placeholder=\"age\" style=\"margin-top: 20px\">   \n");
      out.write("            <input  class=\"text form-control\" type=\"date\" name=\"contact\" placeholder=\"contact\" style=\"margin-top: 20px\">\n");
      out.write("            <input class=\"getId\" type=\"hidden\" name=\"up\" value=\"\">\n");
      out.write("            <!--<a href=\"first\" class=\"card-link btn btn-primary\" style=\"margin-top: 20px;\" value=\"1\" name=\"add\">Add</a>-->\n");
      out.write("            <a></a>\n");
      out.write("            <button class=\"card-link btn btn-danger\" style=\"margin-top: 20px;color:white;\">Update</button>\n");
      out.write("           \n");
      out.write("            </form>\n");
      out.write("       \n");
      out.write("            <script>\n");
      out.write("                function copyData(e)\n");
      out.write("                {   \n");
      out.write("                              \n");
      out.write("                    document.getElementsByClassName(\"dispName\")[0].value=e.parentNode.children[0].innerText;\n");
      out.write("                    document.getElementsByClassName(\"dispName\")[1].value=e.parentNode.children[1].innerText;\n");
      out.write("                    document.getElementsByClassName(\"dispName\")[2].value=e.parentNode.children[2].innerText;                   \n");
      out.write("                    document.getElementsByClassName(\"number\")[0].value=e.parentNode.children[3].innerText;\n");
      out.write("                    document.getElementsByClassName(\"text\")[0].value=e.parentNode.children[4].innerText;\n");
      out.write("                    document.getElementsByClassName(\"getId\")[0].value=e.parentNode.children[7].value;\n");
      out.write("//                    document.getElementsByTagName(\"a\")[0].setAttribute(\"href\",\"updateDetails?up=\"+e.parentNode.children[3].innerText);\n");
      out.write("                    console.log(e.parentNode.children[6].innerText);\n");
      out.write("                 \n");
      out.write("                }\n");
      out.write("            </script>\n");
      out.write("            ");
con.close();
      out.write("\n");
      out.write("        </div>\n");
      out.write("        \n");
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
