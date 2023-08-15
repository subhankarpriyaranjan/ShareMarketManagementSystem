<%@ page language="java" import="java.util.*" pageEncoding="ISO-8859-1"%>
<%@taglib uri="/struts-tags" prefix="s"   %>
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
<meta name="keywords" content="" />
<meta name="description" content="" />
<meta http-equiv="content-type" content="text/html; charset=utf-8" />

<link href='http://fonts.googleapis.com/css?family=Oswald:400,300' rel='stylesheet' type='text/css' />
<link href='http://fonts.googleapis.com/css?family=Abel|Satisfy' rel='stylesheet' type='text/css' />
<link href="default.css" rel="stylesheet" type="text/css" media="all" />
<!--[if IE 6]>
<link href="default_ie6.css" rel="stylesheet" type="text/css" />
<![endif]-->
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
					<li class="current_page_item"><a href="#" accesskey="1" title="">Homepage</a></li>
					<li><a href="about.jsp" accesskey="2" title="">About Us</a></li>
					<li><a href="contactus.jsp" accesskey="3" title="">Contact Us</a></li>
					
				</ul>
			</div>
		</div>
	</div>
	<div id="banner"><img src="images/anigif.gif " width="1120" height="500" alt="" /></div>
	<div id="page-wrapper">
		<div id="page">
		<h1><U><font size=6 color="brown">BROKER HOME PAGE</font></U></h1>&nbsp;&nbsp;&nbsp;&nbsp;
	
		<s:form action="loginaction" >
		<ul type="square" color="blue">
		<li><a href="viewbrok"><font size=5 color="blue">VIEW   PROFILE</font></a></li><br/>&nbsp;&nbsp;&nbsp;&nbsp;
		<li><a href="editbrok"><font size=5 color="blue">EDIT  PROFILE</font></a></li><br/>&nbsp;&nbsp;&nbsp;&nbsp;
		<li><a href="viewsharprice"><font size=5 color="blue">VIEW  SHARE  PRICE</font></a></li><br/>&nbsp;
		<li><a href="choosecustomer"><font size=5 color="blue">CUSTOMER  DETAILS</font></a></li><br/>&nbsp;
		<li><a href="broktrans.jsp"><font size=5 color="blue">TRANSACTION</font></a></li><br/>&nbsp;
		<li><a href="detailsoffeedback.jsp"><font size=5 color="blue">FEEDBACK</font></a></li>	
		<li><a href="login.jsp"><font size=5 color="blue">LOGOUT</font></a></li><br/>&nbsp;
		</ul>
		</s:form>
		</div>
		</div>
	</div>
	<div id="footer-wrapper"><br /></div>
</body>
</html>