
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@page import="db.DB"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Student Profile</title>
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
  <a href="StudentProfile.jsp">Home</a> 
  <a href="StudentprofileUpdate.jsp">Profile Update</a>  
  <a href="StudentprofilePassword.jsp">Change Password</a> 
  <a href="https://davv.mponline.gov.in/portal/Services/DAVV/UTD_APP/semfee/semfeesubmission.aspx">Fees</a>  
  <a href="StudentprofileSyllbus.jsp">Syllbus</a>
  <a href="Studentprofileskill.jsp">Online Skill Test</a>  
  <a href="StudentprofileTimetable.jsp">Lab Manual</a>  
</div> 
             <%
                         String username =(String)session.getAttribute("username");
            if(username==null || username.trim()=="")
            {
                 response.sendRedirect("../Login.html");
            }
                         
            String id =username;
                
            Connection con =DB.getConnection(); 
            PreparedStatement ps=con.prepareStatement("select * from student2 where sid='"+id+"'");
            ResultSet rs =ps.executeQuery();
            while(rs.next())
            {
              %>
                
               <div class="main-content-area" id="main-content-area">
                <div class="content-left padding-border">
              <h2>Welcome <%=username%></h2>
              <table id="customers">
            
                  <tr>
                      <td>Student ID  </td><td><%=rs.getString("sid")%></td>
                  </tr>
                  <tr>
                      <td>Name  </td><td><%=rs.getString("sname")%></td>
                  </tr>
                  <tr>
                      <td>Father's Name  </td><td><%=rs.getString("sfname")%></td>
                  </tr>
                  <tr>
                      <td>Gender  </td><td><%=rs.getString("gender")%></td>
                  </tr>
                  <tr>
                      <td>DOB  </td><td><%=rs.getString("dob")%></td>
                  </tr>
                  <tr>
                      <td>Course  </td><td><%=rs.getString("course")%></td>
                  </tr>
                  <tr>
                      <td>Semester </td><td><%=rs.getString("semester")%></td>
                  </tr>
                  <tr>
                      <td>Mobile Number </td><td><%=rs.getString("mobilenumber")%></td>
                  </tr>
                  <tr>
                      <td>Email  </td><td><%=rs.getString("email")%></td>
                  </tr><tr>
                      <td>State  </td><td><%=rs.getString("state")%></td>
                  </tr>
                  <tr>
                      <td>City  </td><td><%=rs.getString("city")%></td>
                  </tr>
                  <tr>
                      <td>District  </td><td><%=rs.getString("district")%></td>
                  </tr>
                  <tr>
                      <td>Village  </td><td><%=rs.getString("village")%></td>
                  </tr>
                 
                  
                  
              </table>
        <% 
            }
          
            
            %>
                    
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
