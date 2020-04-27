<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>add details</title>
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" crossorigin="anonymous">
        <style>
            body
            {
                background-image: url("https://images.wallpaperscraft.com/image/wedding_newlyweds_couple_romance_love_113876_1366x768.jpg");
                color:white;background-repeat: no-repeat;
  background-attachment: fixed;            
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
        
        <div class="col-md-6 ml-3" style="margin-top:20px">
            <form action="addDetails" method="post">
                    <div class="form-row form-group">    
                        <div class="col">
                            <input type="text" class="form-control" name="fname" placeholder="First Name">
                        </div>
                        <div class="col">
                            <input type="text" class="form-control" name="mname" placeholder="Middle Name">
                        </div>
                        <div class="col">
                            <input type="text" class="form-control" name="lname" placeholder="Last Name">                    
                        </div>
                    </div>
                <div class="form-group">
                    <!--<label for="age">Age</label>-->
                    <input type="number" class="form-control" name="age" placeholder="Age">    
                </div>
                <div class="form-group">
                    <div class="form-check form-check-inline">
                    <input class="form-check-input" type="radio" name="gender" id="male" value="male">
                    <label class="form-check-label" for="male">Male</label>
                  </div>
                  <div class="form-check form-check-inline">
                    <input class="form-check-input" type="radio" name="gender" id="female" value="female">
                    <label class="form-check-label" for="female">Female</label>
                  </div>
                </div>
                 <div class="form-group">
                    <!--<label for="dob">DOB</label>-->
                    <input type="date" class="form-control" name="dob" placeholder="DOB">    
                </div>
                
                <div class="form-group">                    
                    <input type="text" class="form-control" name="occupation" placeholder="Occupation">    
                </div>
                <div class="form-group">                    
                    <input type="text" class="form-control" name="address" placeholder="Address">    
                </div>
                <div class="form-row form-group">    
                        <div class="col">
                            <label for="height">Height (in cms)</label>
                            <input type="number" class="form-control" name="height">                            
                        </div>
                        <div class="col">
                            <label for="weight">Weight ( in kg)</label>
                            <input type="number" class="form-control" name="weight">                            
                        </div>
                </div>
                <div class="col-md-3 mb-3">
                    <label for="nationality">Nationality</label>
                    <select class="custom-select" name="nationality" required>
                      <option selected value="indian">Indian</option>
                      <option value="british">British</option>
                      <option value="irish">Irish</option>
                      <option value="scottish">Scottish</option>
                    </select>
                </div>
                <div class="form-group">                   
                    <input type="text" class="form-control" name="contact" placeholder="Contact">    
                </div>
                <div class="form-group">                    
                    <input type="number" class="form-control" name="salary" placeholder="Salary">    
                </div>
                <div class="form-group">                    
                    <input type="text" class="form-control" name="education" placeholder="Education">    
                </div>
  
  <button type="submit" class="btn btn-primary">Submit</button>
</form>
        </div>
    </body>
</html>
