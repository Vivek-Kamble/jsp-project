/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author vivek
 */
public class updateDetails extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            String fname=request.getParameter("fname");
            String mname=request.getParameter("mname");
            String lname=request.getParameter("lname");
            Integer age=Integer.parseInt(request.getParameter("age"));               
            String gender=request.getParameter("gender");
            String dob=request.getParameter("dob");
            String occupation=request.getParameter("occupation");
            String address=request.getParameter("address");
            Integer height = Integer.parseInt(request.getParameter("height"));
            Integer weight = Integer.parseInt(request.getParameter("weight"));
            String nationality=request.getParameter("nationality");
            String phone=request.getParameter("contact");
            String salary=request.getParameter("salary");
            String education=request.getParameter("education");
            Integer id = Integer.parseInt(request.getParameter("id"));
            
           try{
                Class.forName("com.mysql.jdbc.Driver");//forname method of Class class is used
                Connection con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3307/jspproject","root","");
                //Sql query for upadating user input into table
                PreparedStatement ps= (PreparedStatement) con.prepareStatement("update details"
                        + " set fname='"+fname+"',mname='"+mname+"',lname='"+lname+"',dob='"+dob+"',occupation='"+occupation+"',"
                                + "address='"+address+"',height="+height+",weight="+weight+",nationality='"+nationality+"',"
                                        + "phone='"+phone+"',salary='"+salary+"',education='"+education+"',"
                                                + "age="+age+",gender='"+gender+"' where id="+id+";");
                //passing values to query               
                ps.executeUpdate();
            }         
               catch(ClassNotFoundException | SQLException e){
                   System.out.println("<h1>"+e.getMessage()+"</h1>");
               }
           response.sendRedirect("http://localhost:8080/jspProject/view_details.jsp");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
