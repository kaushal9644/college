

<%@page import="java.lang.String"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="db.DB"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <script src="https://cdn.jsdelivr.net/npm/sweetalert2@11"></script>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Student Profile update</title>
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
           <div class="main-content-area" id="main-content-area">
                <div class="content-left padding-border">
       
                     
                          <%
                         String username =(String)session.getAttribute("username");
            if(username==null || username.trim()=="")
            {
                 response.sendRedirect("../Login.html");
            }
            
           String sid =username;
           String name=null;
           String fname = null;
           Connection con =DB.getConnection();
          
           try{
               
           String q="select sname,sfname  from student2 where sid='"+sid+"'";
           PreparedStatement ps =con.prepareStatement(q);
           ResultSet rs =ps.executeQuery();
           if(rs.next())
            {
                name=rs.getString("sname");
                fname=rs.getString("sfname");
            }
            
           }catch(Exception e )
           {
              System.out.print(e);
           }
       %>
      <form action="../StudentUpdate" method="post">
      <h1>Update Profile</h1>
     
      <div class="form-group">
        <label>Student ID</label>
        <input type="text" name="sid" value="<%=sid%>" readonly>
      </div>
      <div class="form-group">
        <label>Student Full Name</label>
        <input type="text" name="sname" value="<%=name%>" readonly>
      </div>
      <div class="form-group ">
        <label>Student Father's Name</label>
        <input type="text" name="sfname" value="<%=fname%>" readonly>
      </div>
       <div class="form-group ">
        <label>Gender</label>
        <select name="gender" required>
          <option value="" selected disabled>Select your gender</option>
          <option value="M">Male</option>
          <option value="F">Female</option>
          <option value="T">Other</option>
        </select>
      </div>
      <div class="form-group ">
        <label for="date">Birth Date</label>
        <input type="date" name="dob" placeholder="Select dob" required>
      </div>
      <div class="form-group ">
        <label >Course</label>
        <select name="course" required>
          <option value="" selected disabled>Select your Course</option>
          <option value="MSc">MSc</option>
          <option value="MCA">MCA</option>
          <option value="MBA">MBA</option>
          <option value="BCA">BCA</option>
        </select>
      </div>
      <div class="form-group ">
        <label>Semester</label>
        <select name="semester" required>
          <option value="" selected disabled>Select your Semester</option>
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
                        <option value="" selected disabled>Select your State</option>
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
              text: "You Profile is Update!",
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
