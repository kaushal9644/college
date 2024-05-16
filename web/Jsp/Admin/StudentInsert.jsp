
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@page import="db.DB"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
         <script src="https://cdn.jsdelivr.net/npm/sweetalert2@11"></script>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Admin</title>
	<meta name="viewport" content="width=device-width">
	<meta name="viewport" content="width=device-width, initial-scale=1.0">
	<link rel="stylesheet" type="text/css" href="../../css/all.css">
	<link rel="stylesheet" type="text/css" href="  ../../css/all.min.css">
	<link rel="stylesheet" type="text/css" href="  ../../css/lightbox.css">
	<link rel="stylesheet" type="text/css" href="  ../../css/flexslider.css">
	<link rel="stylesheet" type="text/css" href="  ../../css/owl.carousel.css">
	<link rel="stylesheet" type="text/css" href="  ../../css/owl.theme.default.css">
	<link rel="stylesheet" type="text/css" href="  ../../css/jquery.rateyo.css"/>
	<link rel="stylesheet" type="text/css" href="../../css/jquery.mmenu.all.css" /> 
	 <link rel="stylesheet" type="text/css" href="../../css/meanmenu.min.css"> 
	<link rel="stylesheet" type="text/css" href="../../inner-page-style.css">
	<link rel="stylesheet" type="text/css" href="../../style.css">
        <link rel="stylesheet" href="../../css/syllbus.css" />
        <link rel="stylesheet" type="text/css" href="../../css/Loder.css">
	<link href="https://fonts.googleapis.com/css?family=Raleway:400,500,600,700" rel="stylesheet">
    <script src="https://code.jquery.com/jquery-3.3.1.js" integrity="sha256-2Kok7MbOyxpgUVvAk/HJ2jigOSYS2auK4Pfzbm7uH60=" crossorigin="anonymous"> </script>
<link rel="stylesheet" type="text/css" href="../../css/admin.css"> 
    <script>
            $(function(){
            $("#header").load("header.html"); 
            $("#footer").load("../footer.html"); });
        </script>
    </head>
    <body>
          <%
        String username =(String)session.getAttribute("username");
            if(username==null || username.trim()=="")
            {
                 response.sendRedirect("../../Login.html");
            }%>
        <div id="loader" class="loader"></div>
        <div id="header"></div>
        <div class="navbar">  
  <a href="Admin.jsp">Home</a> 
 <div class="subnav">
    <button class="subnavbtn">Student <i class="fa fa-caret-down"></i></button>
    <div class="subnav-content">
     <a href="AllStudent.jsp">All Student</a>
      <a href="StudentInsert.jsp">Insert</a>
      <a href="StudentUpdate.jsp">Update</a>
      
    </div>
  </div> 
  <div class="subnav">
  <button class="subnavbtn">Faculty <i class="fa fa-caret-down"></i></button>
    <div class="subnav-content">
      <a href="AllTeacher.jsp">All Faculty</a>
      <a href="TeacherInsert.jsp">Insert</a>
      <a href="TeacherUpdate.jsp">Update</a>

    </div>
  </div> 
  
</div> 
        <div class="main-content-area" id="main-content-area">
                <div class="content-left padding-border">
           <form action="../../StudentDataInsert" method="post">
      <h2>Insert Data of Student</h2>
     
      <div class="form-group">
        <label>Student ID</label>
        <input type="text" name="sid" placeholder="Enter Student Id" required>
      </div>
      <div class="form-group">
        <label>Student Full Name</label>
        <input type="text" name="sname" placeholder="Enter Full name" required>
      </div>
      <div class="form-group ">
        <label>Student Father's Name</label>
        <input type="text" name="sfname" placeholder="Enter Father's  name" required>
      </div>
       <div class="form-group ">
        <label>Gender</label>
        <select name="gender" required>
          <option value="" selected disabled>Select gender</option>
          <option value="Male">Male</option>
          <option value="Female">Female</option>
          <option value="Other">Other</option>
        </select>
      </div>
      <div class="form-group ">
        <label for="date">Birth Date</label>
        <input type="date" name="dob" placeholder="Select dob" required>
      </div>
      <div class="form-group ">
        <label >Course</label>
        <select name="course" required>
          <option value="" selected disabled>Select Course</option>
          <option value="MSc">MSc</option>
          <option value="MCA">MCA</option>
          <option value="MBA">MBA</option>
          <option value="BCA">BCA</option>
        </select>
      </div>
      <div class="form-group ">
        <label>Semester</label>
        <select name="semester" required>
          <option value="" selected disabled>Select Semester</option>
          <option value="I">I Sem</option>
          <option value="II">II Sem</option>
          <option value="III">III Sem</option>
          <option value="IV">IV Sem</option>
          <option value="V">V Sem</option>
          <option value="VI">VI Sem</option>
          <option value="VII">VII Sem</option>
          <option value="VIII">VIII Sem</option>
        </select>
      </div>
       <div class="form-group">
        <label>Mobile Number</label>
        <input type="text" name="mobilenumber" placeholder="Enter Mobile Number" required>
      </div>
      <div class="form-group">
        <label>Email Address</label>
        <input type="text" name="email" placeholder="Enter email address" required>
      </div>
      <div class="form-group ">
        <label>Enter State</label>
        <select name="state" required>
                        <option value="" selected disabled>Select State</option>
                        <option value="AN">Andaman and Nicobar Islands</option>
                        <option value="AP">Andhra Pradesh</option>
                        <option value="AR">Arunachal Pradesh</option>
                        <option value="AS">Assam</option>
                        <option value="BR">Bihar</option>
                        <option value="CH">Chandigarh</option>
                        <option value="CT">Chhattisgarh</option>
                        <option value="DN">Dadra and Nagar Haveli</option>
                        <option value="DD">Daman and Diu</option>
                        <option value="DL">Delhi</option>
                        <option value="GA">Goa</option>
                        <option value="GJ">Gujarat</option>
                        <option value="HR">Haryana</option>
                        <option value="HP">Himachal Pradesh</option>
                        <option value="JK">Jammu and Kashmir</option>
                        <option value="JH">Jharkhand</option>
                        <option value="KA">Karnataka</option>
                        <option value="KL">Kerala</option>
                        <option value="LA">Ladakh</option>
                        <option value="LD">Lakshadweep</option>
                        <option value="MP">Madhya Pradesh</option>
                        <option value="MH">Maharashtra</option>
                        <option value="MN">Manipur</option>
                        <option value="ML">Meghalaya</option>
                        <option value="MZ">Mizoram</option>
                        <option value="NL">Nagaland</option>
                        <option value="OR">Odisha</option>
                        <option value="PY">Puducherry</option>
                        <option value="PB">Punjab</option>
                        <option value="RJ">Rajasthan</option>
                        <option value="SK">Sikkim</option>
                        <option value="TN">Tamil Nadu</option>
                        <option value="TG">Telangana</option>
                        <option value="TR">Tripura</option>
                        <option value="UP">Uttar Pradesh</option>
                        <option value="UT">Uttarakhand</option>
                        <option value="WB">West Bengal</option>
        </select>
      </div>
      <div class="form-group">
        <label>City</label>
        <input type="text" name="city" placeholder="Enter City"required>
      </div>
      <div class="form-group">
        <label for="email">District</label>
        <input type="text" name="district" placeholder="Enter District" required>
      </div>
      <div class="form-group">
        <label>Village</label>
        <input type="text" name="village" placeholder="Enter Village" required>
      </div>
      <div class="form-group password">
        <label>Password</label>
        <input type="password" name="password" placeholder="Create password" required>
       
      </div>
      <div class="form-group submit-btn">
        <input type="submit" value="Submit">
      </div>
    </form>    
                    
                </div></div>
        <div id="footer"></div>
        
        <script>
        const urlParams = new URLSearchParams(window.location.search);
        const message = urlParams.get('message');
        if (message=='yes') {
           Swal.fire({
              title: "Update!",
              text: "Data insert!",
              icon: "success"
            });
        }
         else if(message=='no')
        {
            Swal.fire({
                icon: "error",
                title: "Oops...",
                text: "Something went wrong!"
              });
        }
        </script>
         <script>
        document.onreadystatechange = function () {
            if (document.readyState !== "complete") {
                document.querySelector(
                    "body").style.visibility = "hidden";
                document.querySelector(
                    "#loader").style.visibility = "visible";
            } else {
                document.querySelector(
                    "#loader").style.display = "none";
                document.querySelector(
                    "body").style.visibility = "visible";
            }
        };
    </script>
    </body>
</html>
