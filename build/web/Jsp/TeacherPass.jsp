
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
        <title>Faculty Profile</title>
	<meta name="viewport" content="width=device-width">
	<meta name="viewport" content="width=device-width, initial-scale=1.0">
	<link rel="stylesheet" type="text/css" href="../css/all.css">
	<link rel="stylesheet" type="text/css" href="  ../css/all.min.css">
	<link rel="stylesheet" type="text/css" href="  ../css/lightbox.css">
	<link rel="stylesheet" type="text/css" href="  ../css/flexslider.css">
	<link rel="stylesheet" type="text/css" href="  ../css/owl.carousel.css">
	<link rel="stylesheet" type="text/css" href="  ../css/owl.theme.default.css">
	<link rel="stylesheet" type="text/css" href="  ../css/jquery.rateyo.css"/>
	<link rel="stylesheet" type="text/css" href="../css/jquery.mmenu.all.css" /> 
	 <link rel="stylesheet" type="text/css" href="../css/meanmenu.min.css"> 
	<link rel="stylesheet" type="text/css" href="../inner-page-style.css">
	<link rel="stylesheet" type="text/css" href="../style.css">
        <link rel="stylesheet" href="../css/syllbus.css" />
        <link rel="stylesheet" type="text/css" href="../css/Loder.css">
	<link href="https://fonts.googleapis.com/css?family=Raleway:400,500,600,700" rel="stylesheet">
    <script src="https://code.jquery.com/jquery-3.3.1.js" integrity="sha256-2Kok7MbOyxpgUVvAk/HJ2jigOSYS2auK4Pfzbm7uH60=" crossorigin="anonymous"> </script>
     <link rel="stylesheet" type="text/css" href="../css/admin.css">

    <script>
            $(function(){
            $("#header").load("header.html"); 
            $("#footer").load("footer.html"); });
        </script>
    </head>
    <body>
        <div id="loader" class="loader"></div>
        <div id="header"></div>
           <div class="navbar">  
    <a href="TeacherProfile.jsp">Peofile</a> 
    <a href="TeacherprofileUpdate.jsp">Update Profile</a> 
    <a href="TeacherPass.jsp">Change Password</a> 
</div>
             <%
                         String username =(String)session.getAttribute("username");
            if(username==null || username.trim()=="")
            {
                 response.sendRedirect("../Login.html");
            }
              %>
                

            
             
        <div class="main-content-area" id="main-content-area">
                <div class="content-left padding-border">
              <h2>Change Your PassWord</h2>
          <form method="post" action="../TeacherPass">    
          <div class="form-group">     
        <label>Create Password</label>
        <input type="password" name="pass1"  placeholder="Enter Password" >
      </div>
      <div class="form-group">
        <label>Re Enter Password</label>
        <input type="password" name="pass2"   placeholder="Re-Enter Password">
      </div>
      
      <div class="form-group submit-btn">
        <input type="submit" value="Submit">
      </div>
    </form> 
                 <script>
        const urlParams = new URLSearchParams(window.location.search);
        const message = urlParams.get('message');
        if (message=='yes') {
           Swal.fire({
              title: "Update!",
              text: "You Password is Update!",
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
        else if(message=='notmatch'){
            Swal.fire({
                icon: "error",
                title: "Oops...",
                text: "Password not match..!"
              });
        }
    </script>
                     
                </div></div>
        <div id="footer"></div>
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
