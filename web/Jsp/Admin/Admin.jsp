
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
        <link rel="stylesheet" type="text/css" href="../../css/admin.css">
       
	<link href="https://fonts.googleapis.com/css?family=Raleway:400,500,600,700" rel="stylesheet">
    <script src="https://code.jquery.com/jquery-3.3.1.js" integrity="sha256-2Kok7MbOyxpgUVvAk/HJ2jigOSYS2auK4Pfzbm7uH60=" crossorigin="anonymous"> </script>
   
    <script>
            $(function(){
            $("#header").load("header.html"); 
            $("#footer").load("../footer.html"); });
        </script>
        <style>
#data {
  font-family: Arial, Helvetica, sans-serif;
  border-collapse: collapse;
  width: 100%;
}

#data td, #data th {
  border: 1px solid #ddd;
  padding: 8px;
}

#data tr:hover {background-color: #CEECFE;}
#data tr{
font-size:15px;
}
#data th {
font-size:16px;
  padding-top: 12px;
  padding-bottom: 12px;
  text-align: left;
  background-color: #035C91;
  color: white;
  
  
  
</style>
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
                    <h1>Contact Message</h1>
                    <%
                        Connection con=DB.getConnection();
                        PreparedStatement ps=con.prepareStatement("select * from contact");
                            ResultSet rs=ps.executeQuery();
                            %>
                              <table id="data">
                          <tr>
                              <th>Name</th><th>Email</th><th>Subject</th><th>Message</th>
                          </tr><%
                        while(rs.next())
                                  {                   
                      %>
                    
                          <tr>
                              <td><%=rs.getString("name")%></td>
                              <td><%=rs.getString("Email")%></td>
                              <td><%=rs.getString("subject")%></td>
                               <td><%=rs.getString("message")%></td>
                              </tr>
                     
                      
                      <%}
                      %> </table>
                </div></div>
          <div class="main-content-area" id="main-content-area">
                <div class="content-left padding-border">
                    <h1>Quick Contact message</h1>
                     <%
                        Connection con1=DB.getConnection();
                        PreparedStatement ps1=con1.prepareStatement("select * from quickcontact");
                            ResultSet rs1=ps1.executeQuery();
                            %>
                            <table id="data">
                          <tr>
                              <th>Name</th><th>Email</th><th>Message</th>
                          </tr><%
                        while(rs1.next())
                                  {                   
                      %>
                    
                          <tr>
                              <td><%=rs1.getString("name")%></td>
                              <td><%=rs1.getString("Email")%></td>
                               <td><%=rs1.getString("message")%></td>
                              </tr>
                     
                      
                      <%}
                      %> </table>
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
