
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Student Class Time Tebale</title>
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
    <style>  
.navbar {  
  background-color: #024871 ; 
  overflow: hidden; 
}  
  
.navbar a {  
  float: left; 
  display: #0444b3; 
  color: white;
    font-size: 20px;
  text-align: center;  
  padding: 14px 16px;  
  text-decoration: none; 
}  
  

.navbar a:hover {  
  background-color: #ddd;   
  color: black;  
} 

</style>   
    <script>
            $(function(){
            $("#header").load("header.html"); 
            $("#footer").load("footer.html"); });
        </script>
    </head>
    <body>
        <div id="loader" class="loader"></div>
         <%
         String username =(String)session.getAttribute("username");
            if(username==null || username.trim()=="")
            {
                 response.sendRedirect("../Login.html");
            }%>
        <div id="header"></div>
        <div class="navbar">  
  <a href="StudentProfile.jsp">Home</a>   
  <a href="StudentprofileUpdate.jsp">Profile Update</a>
<a href="StudentprofilePassword.jsp">Change Password</a> 
  <a href="https://davv.mponline.gov.in/portal/Services/DAVV/UTD_APP/semfee/semfeesubmission.aspx">Fees</a>

  <a href="StudentprofileSyllbus.jsp">Syllbus</a>
  <a href="Studentprofileskill.jsp">Online Skill Test</a>  
  <a href="StudentprofileTimetable.jsp">Lab Manual</a>  
</div> 
           <div class="main-content-area" id="main-content-area">
                <div class="content-left padding-border">
       
                     <div class="all-news">
                            <a href="../pdf/Lab manual  Computer Organization and Assembly Language Programming.pdf">
                               <button type="button" class="collapsible">CS-2023 Computer Organization and Hardware Maintenance</button>
                            </a>
                            <a href="../pdf/Lab manual  Data Structures and Algorithms.pdf">
                                <div class="content"></div>
                                <br>
                                <button type="button" class="collapsible">CS-2222 Data Structures and Algorithms</button>
                            </a>
                            <a href="../pdf/Lab manual Computer Graphics & Multimedia Fundamentals.pdf">
                                <div class="content"></div>
                                <br>
                                <button type="button" class="collapsible">CS-3505 Computer Graphics & Multimedia Fundamentals</button>
                            </a>
                            <a href="../pdf/Lab manual Computer Organization and Hardware Maintenance.pdf">
                                <div class="content"></div>
                                <br>
                                <button type="button" class="collapsible">CS-4022 Computer Organization and Assembly Language Programming</button>
                            </a>
                            <a href="../pdf/Lab manual Programming and Problem Solving Using C.pdf">
                                <div class="content"></div>
                                <br>
                                <button type="button" class="collapsible">CS-4205 Programming and Problem Solving Using C</button>
                            </a>
                            <a href="../pdf/Lab manual Object Oriented Programming using JAVA.pdf">
                                <div class="content"></div><br>
                                <button type="button" class="collapsible">CS-4211 Object Oriented Programming using JAVA</button>
                            </a>
                            <a href="../pdf/Lab manual Computer Graphics & Multimedia.pdf">
                                <div class="content"></div><br>
                                <button type="button" class="collapsible">CS-4508 Computer Graphics & Multimedia</button>
                            </a>
                            <a href="../pdf/Lab manual  Operating Systems.pdf">
                                <div class="content"></div><br>
                                <button type="button" class="collapsible">CS-5511 Operating Systems</button>
                            </a>
                            <a href="../pdf/Lab manual  Advanced Algorithm Design.pdf">
                                <div class="content"></div><br>
                                <button type="button" class="collapsible">CS-6221 Advanced Algorithm Design</button>
                            </a>
                            <a href="../pdf/Lab manual Internet of Things.pdf">
                                <div class="content"></div><br>
                                <button type="button" class="collapsible">CS-6630 Internet of Things</button>
                            </a>
                        </div>
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
