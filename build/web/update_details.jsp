<%-- 
    Document   : update_details
    Created on : 21 Feb, 2020, 8:56:33 PM
    Author     : vivek
--%>

<%@page import="java.sql.*"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>updating details</title>
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" crossorigin="anonymous">
        <style>
            body
            {
                background-image: url("https://images.wallpaperscraft.com/image/wedding_newlyweds_couple_romance_love_113876_1366x768.jpg");
                color:white;
                background-repeat: no-repeat;
  background-attachment: fixed;
            }
            .card
            {
                display: inline-block;
                background-color: black;
                opacity: 0.5;
            }
             .dashboard
            {
                height: 60px;
                width: 100%;
                background: black;
                opacity: 0.5;
                color: white;
            }
            ul li{
                display: inline-block;
                padding: 15px;
                /*color: white*/
            }
            ul li button{
                color: white;
                background: transparent;
                border-radius: 10px;
            }
            input::placeholder
            {
                opacity:1;
                color: red;
                background-color: black;
            }
        </style>
    </head>
    <body>
        
        <div class="dashboard">
            <ul>
                <li>
                    <button onclick="location.href='http://localhost:8080/jspProject/add_details.jsp';">Add Profiles</button>
                </li>
                <li>
                    <button onclick="location.href='http://localhost:8080/jspProject/view_details.jsp';">View Profiles</button>
                </li>
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        
            </ul>
        </div>
        <%
        
        int id=Integer.parseInt(request.getParameter("id"));
        
         Class.forName("com.mysql.jdbc.Driver");//forname method of Class class is used
            
            //2.Establish the connection
           //xampp
            Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3307/jspproject","root","");
            Statement s = con.createStatement();
            ResultSet rs=s.executeQuery("select * from details where id="+id);
            while(rs.next())
            {
               
        
        %>
 
        <div class="container col-md-6" style="margin-top: 50px;">
            <h1 style="color:black;">Update Profile</h1>
            
            <form action="updateDetails?id=<%=id%>" method="post">
                <input class="form-control" type="text" name="fname" placeholder="asf" value="<%=rs.getString(1)%>" style="margin-top: 20px">
                <input class="form-control" type="text" name="mname" value="<%=rs.getString(2)%>" style="margin-top: 20px">
                <input class="form-control" type="text" name="lname" value="<%=rs.getString(3)%>" style="margin-top: 20px">
                <input class="number form-control" type="number" name="age" value="<%=rs.getInt(13)%>" style="margin-top: 20px">   
                <input class="form-control" type="text" name="gender" value="<%=rs.getString(14)%>" style="margin-top: 20px">
                <input type="date" class="form-control" name="dob" value="<%=rs.getString(4)%>" style="margin-top: 20px">
                <input type="text" class="form-control" name="occupation" value="<%=rs.getString(5)%>" style="margin-top: 20px">
                <input type="text" class="form-control" name="address" value="<%=rs.getString(6)%>" style="margin-top: 20px">
                <input class="number form-control" type="number" name="height" value="<%=rs.getInt(7)%>" style="margin-top: 20px">   
                <input class="number form-control" type="number" name="weight" value="<%=rs.getInt(8)%>" style="margin-top: 20px">   
                <input type="text" class="form-control" name="natipnality" value="<%=rs.getString(9)%>" style="margin-top: 20px">
                <input type="text" class="form-control" name="contact" value="<%=rs.getString(10)%>" style="margin-top: 20px">
                <input type="text" class="form-control" name="salary" value="<%=rs.getString(11)%>" style="margin-top: 20px">
                <input type="text" class="form-control" name="education" value="<%=rs.getString(12)%>" style="margin-top: 20px">                                             
                <button type="submit" class="card-link btn btn-danger" style="margin-top: 20px;color:white;">Update</button>
           
            </form>
       
         <%
             }
             con.close();
             %>
        </div>
    </body>
</html>
