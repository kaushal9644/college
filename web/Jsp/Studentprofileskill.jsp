 <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Student online skill</title>
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
   <link rel="stylesheet" type="text/css" href="../css/admin.css">
        <style> 
p{
    font-size: 40px;
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
                   
                          <h1> Online Skill Test</h1>
                    <p>
                   <p> All SCSIT students are compulsorily required to give an online skill test here:
                       <a href="https://www.youth4work.com/onlinetalenttest" target="_blank" class="content-link"> 
                           https://www.youth4work.com/onlinetalenttest</a>. Please refer links
                    </p><br>

                    <ul style="margin-left: 50px;">
                        <li>
                            <p> How to participate in the test:</p> <br>
                            <a href="https://www.slideshare.net/youth4work/youth4work-aicte-skill-test-85166207" target="_blank" class="content-link">
                                <p> https://www.slideshare.net/youth4work/youth4work-aicte-skill-test-85166207</a>
                        </li><br />
                        <li>
                            <p>MOU Link between AICTE and Youth4work: <br>
                            <a href="https://www.aicte-india.org/downloads/aicte_mou_youth4work_12_9_17.PDF" target="_blank" class="content-link">
                                https://www.aicte-india.org/downloads/aicte_mou_youth4work_12_9_17.PDF</a>
                        </li><br />
                        <li>
                            <p>Video of AICTE PPT
                            <a href="https://www.youtube.com/watch?v=qUc0NE8oNq8&t=233s" target="_blank" class="content-link">
                                https://www.youtube.com/watch?v=qUc0NE8oNq8&t=233s</a>
                        </li><br />
                        <li>
                            <p>Benefits to the colleges
                            <a href="https://www.slideshare.net/youth4work/youth4work-aicte-mou" target="_blank" class="content-link">
                                https://www.slideshare.net/youth4work/youth4work-aicte-mou</a>
                        </li><br />
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