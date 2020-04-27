<%-- 
    Document   : view_details
    Created on : 21 Feb, 2020, 3:44:10 PM
    Author     : vivek
--%>

<%@page import="java.sql.*"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>view details</title>
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
        
        <div class="container col-md-9">
            <!--<h1 style="margin-top:50px;">View Details</h1>-->
        <%
         Class.forName("com.mysql.jdbc.Driver");//forname method of Class class is used
            
            //2.Establish the connection
           //xampp
            Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3307/jspproject","root","");
            Statement s = con.createStatement();
            ResultSet rs=s.executeQuery("select fname,lname,age,dob,phone,id from details");
            while(rs.next())
            {
                %>
                
                <div class="card" style="width:300px;margin-top: 20px;">
                <div class="card-body">
                  <h5 class="card-title name"><%=rs.getString(1)%> </h5>             
                  <h5 class="card-title name"><%=rs.getString(2)%></h5>
                  <h6 class="card-subtitle mb-2 text-muted age"><%=rs.getInt(3)%></h6>
                  <h6 class="card-subtitle mb-2 text-muted contact"><%=rs.getString(4)%></h6>
                  <h6 class="card-subtitle mb-2 text-muted contact"><%=rs.getString(5)%></h6>
                  <!--<h5 class="card-title name" style="display:none"><%=rs.getInt(6)%></h5>-->
                  <!--<input type="hidden" value="<%=rs.getInt(6)%>" name="id">-->
                  
                  <div class="row" style="margin-left:1px;">
                      <a href="delete_details?del=<%=rs.getInt(6)%>" class="card-link btn btn-danger" >Delete</a>
                  <a href="update_details.jsp?id=<%=rs.getInt(6)%>" class="card-link btn btn-primary">Update</a>
                  <a href="" class="card-link btn btn-success">Match</a>
                  </div>
                </div>
              </div>
                <%
            }
            con.close();
               
        %>
        </div>
         
        
    </body>
</html>
