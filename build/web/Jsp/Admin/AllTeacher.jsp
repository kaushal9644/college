
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@page import="db.DB"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Admin</title>
	<meta name="viewport" content="width=device-width">
	<meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/normalize/5.0.0/normalize.min.css">
        <link rel='stylesheet prefetch' href='https://maxcdn.bootstrapcdn.com/bootstrap/3.2.0/css/bootstrap.min.css'>
        <link rel='stylesheet prefetch' href='https://s3-us-west-2.amazonaws.com/s.cdpn.io/123941/rwd.table.min.css'>
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
        <link rel="stylesheet" href="../css/syllbus.css" />
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
        
        <P>
            
        </P>
        <p>
            
        </p>
       
         <%      
            Connection con =DB.getConnection(); 
            PreparedStatement ps=con.prepareStatement("select * from teacher ");
            ResultSet rs =ps.executeQuery();
            %>
  
  <div class="row">
    <div class="col-xs-12">
      <div class="table-responsive" data-pattern="priority-columns">
        <table  class="table table-bordered table-hover">
          <thead>
                <tr>
                    <th data-priority="1"> ID </th><th data-priority="2">Faculty Name</th><th data-priority="3">Father's Name</th><th data-priority="4">Gender</th><th data-priority="5">DOB</th><th data-priority="6"> Post </th><th data-priority="7">Subject </th><th data-priority="8"> Mobile number</th><th data-priority="9"> Email</th><th data-priority="10"> State</th><th data-priority="11"> City </th><th data-priority="12">Address </th><th data-priority="13"> Salary</th><th data-priority="14"> Password</th>
                </tr>
             </thead>
          <tbody>
            <%
            while(rs.next())
            {
              %>
               <tr>
                    <td> <%=rs.getString("tid")%> </td><td><%=rs.getString("tname")%></td><td><%=rs.getString("tfname")%></td><td><%=rs.getString("gender")%></td><td><%=rs.getString("dob")%></td><td><%=rs.getString("post")%> </td><td><%=rs.getString("subject")%> </td><td> <%=rs.getString("mobilenumber")%></td> <td> <%=rs.getString("email")%></td><td> <%=rs.getString("state")%></td><td> <%=rs.getString("city")%> </td><td><%=rs.getString("address")%> </td><td> <%=rs.getString("salary")%>&#8377</td><td> <%=rs.getString("password")%></td>
                </tr> 
             
        <% 
            }
          
            
            %>
             </tbody>
        </table>
      </div>
    </div>
  </div>
       <script src='http://cdnjs.cloudflare.com/ajax/libs/jquery/2.1.3/jquery.min.js'></script>
            <script src='https://cdnjs.cloudflare.com/ajax/libs/twitter-bootstrap/3.3.2/js/bootstrap.min.js'></script>
            <script src='https://s3-us-west-2.amazonaws.com/s.cdpn.io/123941/rwd-table-patterns.js'></script>
                    
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
