
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Student Syllbus</title>
	<meta name="viewport" content="width=device-width">
	<meta name="viewport" content="width=device-width, initial-scale=1.0">
	<link rel="stylesheet" type="text/css" href="../css/all.css">
	<link rel="stylesheet" type="text/css" href="../css/jquery.mmenu.all.css" /> 
	 <link rel="stylesheet" type="text/css" href="../css/meanmenu.min.css"> 
	<link rel="stylesheet" type="text/css" href="../inner-page-style.css">
	<link rel="stylesheet" type="text/css" href="../style.css">
         <link rel="stylesheet" href="../css/syllbus.css" />
         <link rel="stylesheet" type="text/css" href="../css/Loder.css">
	<link href="https://fonts.googleapis.com/css?family=Raleway:400,500,600,700" rel="stylesheet">
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
   <script src="https://code.jquery.com/jquery-3.3.1.js" integrity="sha256-2Kok7MbOyxpgUVvAk/HJ2jigOSYS2auK4Pfzbm7uH60=" crossorigin="anonymous"> </script>

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
                    <h1>Syllabus</h1>
                    <br>
                    <button type="button" class="collapsible">Bachelor of Computer Application (BCA)</button>
                    <div class="content">

                        <ul style="margin-left: 20px;">
                            <a href="../pdf/BCA_1.pdf">
                                <li class="content-link">BCA I Semester</li>
                            </a>
                             <a href="../pdf/BCA-2nd-Sem-2022-23.pdf">
                                <li class="content-link">BCA II Semester</li>
                            </a>
                            <a href="../pdf/BCA-3rd-Sem-2022-23.pdf"><li class="content-link">BCA III Semester</li></a>
                            <a href="../pdf/BCA-4th-Sem-2022-23.pdf"><li class="content-link">
							    BCA IV Semester
								</li></a>
                            <a href="../pdf/BCA-5th-Sem-2022-23.pdf"><li class="content-link">BCA V Semester</li></a>
                            <a href="../pdf/BCA-6th-Sem-2022-23.pdf"><li class="content-link">BCA VI Semester</li></a>
                        </ul>
                    </div>
             <br>
                    <button type="button" class="collapsible">Master of Computer Application (MCA)</button>
                    <div class="content">

                        <ul style="margin-left: 20px;">
                            <a href="../pdf/MCA-1st-Sem-2022-23.pdf"><li class="content-link">MCA I Semester</li></a>
                           
						   
						    <a href="../pdf/MCA-2nd-Sem-2022-23.pdf"><li class="content-link">MCA II Semester</li></a>
							
							 <a href="../pdf/MCA-3rd-Sem-2022-23.pdf"><li class="content-link">MCA III Semester</li></a>
                        </ul>
                    </div>
             <br>

                    <button type="button" class="collapsible">Master of Science M.Sc. (CS/IT)</button>
                    <div class="content">
                        <ul style="margin-left: 20px;">
                            <a href="../pdf/MSc-CSIT-1st-Sem-2022-23.pdf"><li class="content-link">M.Sc. (CS/IT) I Semester</li></a>
                            <a href="../pdf/MSc-CSIT-2nd-Sem-2022-23.pdf"><li class="content-link">M.Sc. (CS/IT) II Semester</li></a>
                            <a href="../pdf/MSc-CSIT-3rd-Sem-2022-23.pdf"><li class="content-link">M.Sc. (CS/IT) III Semester</li></a>
                            <a href="../pdf/Msc-CSIT-4th-Sem-2022-23.pdf"><li class="content-link">M.Sc. (CS/IT) IV Semester</li></a>
                        </ul>
                    </div>

             <br>
                   
                    <button type="button" class="collapsible">Master of Business Administration MBA (CM)</button>
                    <div class="content">
                        <ul style="margin-left: 20px;">
                            <a href="../pdf/MBA-CM-1st-Sem-2022-23.pdf"><li class="content-link">MBA (CM) I Semester</li></a>
                            <a href="../pdf/MBA-CM-2nd-Sem-2022-23.pdf"><li class="content-link">MBA (CM) II Semester</li></a>
                            <a href="../pdf/MBA-CM-3rd-Sem-2022-23.pdf"><li class="content-link">MBA (CM) III Semester</li></a>
                            <a href="../pdf/MBA-CM-4th-Sem-2022-23.pdf"><li class="content-link">MBA (CM) IV Semester</li></a>
                        </ul>
                    </div>

                    <br>
                    <button type="button" class="collapsible">Master of Technology M.Tech (CS)</button>
                    <div class="content">
                        
                        <ul style="margin-left: 20px;">
                            <a href="../pdf/MTech-CS-1st-Sem-2022-23.pdf"><li class="content-link">MTech (CS) I Semester</li></a>
                            <a href="../pdf/MTech-CS-2nd-Sem-2022-23.pdf"><li class="content-link">MTech (CS) II Semester</li></a>
							<a href="../pdf/MTech CS Exec 2 Semester.pdf"><li class="content-link">MTech (CS) Executive II Semester</li></a>
                            
                        </ul>
                    </div>
                    <br>
                    <button type="button" class="collapsible">Master of Technology M.Tech (NM & IS)</button>
                    <div class="content">
                        
                        <ul style="margin-left: 20px;">
                            <a href="../pdf/MTech-NM-1st-Sem-2022-23.pdf"><li class="content-link">MTech (NM & IS) I Semester</li></a>
                            <a href="../pdf/MTech-NM-2nd-Sem-2022-23.pdf"><li class="content-link">MTech (NM & IS) II Semester</li></a>
                            
                        </ul>
                    </div>
					
                    <br>
                    
                    <button type="button" class="collapsible">PGDCA I Semester</button>
                    <div class="content">                        
                        <ul style="margin-left: 20px;">
                           <a href="../pdf/PGDCA-1st-Sem-2022-23.pdf"><li class="content-link">PGDCA I Semester </li></a>            
						   <a href="../pdf/PGDCA-2nd-Sem-2022-23.pdf"><li class="content-link">PGDCA II Semester </li></a>                                                     
                        </ul>
                    </div>
					
					
                </div></div>				
					
					
                  

 

 
    <script>
    var coll = document.getElementsByClassName("collapsible");
    var i;

    for (i = 0; i < coll.length; i++) {
        coll[i].addEventListener("click", function() {
            this.classList.toggle("active");
            var content = this.nextElementSibling;
            if (content.style.maxHeight) {
                content.style.maxHeight = null;
            } else {
                content.style.maxHeight = content.scrollHeight + "px";
            }
        });
    }
    </script>
        
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
