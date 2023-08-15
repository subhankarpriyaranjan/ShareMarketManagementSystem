<%@ page language="java" import="java.util.*" pageEncoding="ISO-8859-1"%>
<%@taglib uri="/struts-tags" prefix="s"   %>
<%@taglib uri="/struts-dojo-tags" prefix="sx" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Strict//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd">
<!--
Design by Free CSS Templates
http://www.freecsstemplates.org
Released for free under a Creative Commons Attribution 2.5 License

Name       : Temperate 
Description: A two-column, fixed-width design with dark color scheme.
Version    : 1.0
Released   : 20121205

-->
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<script type="text/javascript">
       function f(){
       var x12=document.forms["m"]["firstname"].value;
        if(x12=="") {
         alert("Error: FirstName cannot be blank!");
          document.forms["m"]["firstname"].focus();
           return false; 
          } 
        var x13=document.forms["m"]["lastname"].value;
        if(x13=="") {
         alert("Error: LastName cannot be blank!");
          document.forms["m"]["lastname"].focus();
           return false; 
          }  
        var x14=document.forms["m"]["address"].value;
        if(x14=="") {
         alert("Error: Address cannot be blank!");
          document.forms["m"]["address"].focus();
           return false; 
          } 
        var x15=document.forms["m"]["city"].value;
        if(x15=="") {
         alert("Error: City cannot be blank!");
          document.forms["m"]["city"].focus();
           return false; 
          }
          
           
       
                   
          var x18=document.forms["m"]["phon"].value;
        if(x18=="") {
         alert("Error: Phone No cannot be blank!");
          document.forms["m"]["phon"].focus();
           return false; 
          } 
          if(isNaN(x18)||x18.indexOf(" ")!=-1){
            alert("Enter numeric value in mobile field  ")
			document.forms["m"]["mobilenumber"].focus();
            return false; }
if(x18.length < 10) {
            alert("You have entered wrong number");
            document.forms["m"]["mobilenumber"].focus();
            return false;}
          
        var x19=document.forms["m"]["dateofbirth"].value;
        if(x19=="") {
         alert("Error: Date Of Birth cannot be blank!");
          document.forms["m"]["dateofbirth"].focus();
           return false; 
          }
         
         var x17=document.forms["m"]["pincode"].value;
        if(x17=="") {
         alert("Error: Pincode cannot be blank!");
          document.forms["m"]["pincode"].focus();
           return false; 
          }
          var x16=document.forms["m"]["answer"].value;
        if(x16=="") {
         alert("Error: Security Answer cannot be blank!");
          document.forms["m"]["answer"].focus();
           return false; 
          } 
 var x=document.forms["m"]["email"].value; 
         var atp=x.indexOf("@");
         var dotp=x.lastIndexOf(".");
         if(atp<1||dotp<atp+2||dotp+2>=x.length)
            {
         alert("Not a Valid Email Address");
         document.forms["m"]["email"].focus();
         return false;         
                   }
          
       return true;
          }    

</script>
<meta name="keywords" content="" />
<meta name="description" content="" />
<meta http-equiv="content-type" content="text/html; charset=utf-8" />

<link href='http://fonts.googleapis.com/css?family=Oswald:400,300' rel='stylesheet' type='text/css' />
<link href='http://fonts.googleapis.com/css?family=Abel|Satisfy' rel='stylesheet' type='text/css' />
<link href="User.css" rel="stylesheet" type="text/css" media="all" />
<!--[if IE 6]>
<link href="default_ie6.css" rel="stylesheet" type="text/css" />
<![endif]-->
<sx:head/>
</head>
<body>
<div id="wrapper">
	<div id="header-wrapper">
		<div id="header">
			<div id="logo">
				<h1><a href="#">online SHARE trading</a></h1>
			</div>
			<div id="menu">
				<ul>
					<li class="next-btn"><a href="homepage.jsp" accesskey="1" title="">Homepage</a></li>
					<li><a href="#" accesskey="2" title=""  class="next-btn">Login</a></li>
					<li><a href="about.jsp" accesskey="3" title="" class="next-btn">About Us</a></li>
					<li><a href="contactus.jsp" accesskey="4" title="" class="next-btn">Contact Us</a></li>
					
				</ul>
			</div>
		</div>
	</div>
	<div id="banner"><img src="images/anigif.gif " width="1120" height="500" alt="" /></div>
	<div id="page-wrapper">
		<div id="page">
		<h1><U><i>NEW USER REGISTRATION</i></U></h1>
		
		<s:form action="newuser">
		<s:textfield name="firstname" label="FIRST NAME" ></s:textfield>
		
		<s:textfield name="lastname" label="LAST NAME" ></s:textfield>
		
		<s:textfield name="username" class ="uname" label="USERNAME" ></s:textfield>
		
		<s:password name="password" class="pass" label="PASSWORD"></s:password>
		
		<s:radio name="sex" label="SEX"  list="{'female','male'}"></s:radio>
		
	<s:textarea name="address" label="ADDRESS" ></s:textarea>
		
		<s:textfield name="city" label="CITY" ></s:textfield>
		
		<sx:datetimepicker name="dateofbirth"   label="Format (dd-MMM-yyyy)" displayFormat="dd-MMM-yyyy" value="todayDate"  />
 
		
		<s:textfield name="pincode" label="PINCODE" ></s:textfield>
		
		<s:textfield name="email" class="email" label="EMAIL ID" ></s:textfield>
		
		<s:textfield name="phon" class="phone" label="PHONE NO." ></s:textfield>
		
		
		<s:select label="SECURITY QUESTION" name="securityquestion"  list="{'place   of  birth','your  home town','your favourite  food','your  favourite color'}" headerValue="---please select---" >
		</s:select>
		
	<s:textfield name="answer" label="ANSWER" ></s:textfield>
		
		 <s:submit  class="next-btn" value="NEXT" ></s:submit>
		
		</s:form>
		<s:property value="msg" />
		
			
			</div>
			
		</div>
	</div>
	<div id="footer-wrapper"><br /></div>
</body>
</html>