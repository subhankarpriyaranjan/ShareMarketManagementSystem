<%@ page language="java" import="java.util.*,p1.loginaction,com.opensymphony.xwork2.ActionContext" pageEncoding="ISO-8859-1"%>
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
					<li class="current_page_item"><a href="homepage.jsp" accesskey="1" title="">Homepage</a></li>
					<li><a href="about.jsp" accesskey="2" title="">About Us</a></li>
					<li><a href="contactus.jsp" accesskey="3" title="">Contact Us</a></li>
					
				</ul>
			</div>
		</div>
	</div>
	<div id="banner"><img src="images/anigif.gif " width="1120" height="500" alt="" /></div>
	<div id="page-wrapper">
		<div id="page">
		<a href="#"><font size="3" color="blue" >Back</font></a>
		<h1><U><font size="6" color="brown">COMPANY DETAILS</font></U></h1>
		<center>
		<table>
          <s:form action="purchaseprocessed" >
          <tr><td><s:hidden name="customerid"/></td></tr>
          <tr><td><s:hidden name="companyid"></s:hidden></td></tr>
          <tr><td><s:hidden name="brokerid"/></td></tr>
          <tr><td><s:hidden name="broamount"></s:hidden></td></tr>
           <tr><td><s:hidden name="acno"/></td></tr>
           <tr><td><s:hidden name="reqid"/></td></tr>
          
          <!--  <tr><td><s:hidden name="presentamt"></s:hidden></td></tr> -->
         <tr><td><s:textfield name="presentamt" label="present amt" readonly="true"></s:textfield></td></tr>
          <tr><td><s:textfield name="customername" label="Customer Name" readonly="true"></s:textfield></td></tr>
          <tr><td><s:textfield name="cacno" label="Customer AccNo" readonly="true"></s:textfield></td></tr>
          <tr><td><s:textfield name="companyname" label="Company Name" readonly="true"></s:textfield></td></tr>
          <tr><td><s:textfield name="saleshare" label="No of shares Want" readonly="true"></s:textfield></td></tr>
          <tr><td><s:textfield name="dmateid" label="Broker DematID" readonly="true"></s:textfield></td></tr>
          <tr><td><s:textfield name="shareprice" label="Present Share Price" readonly="true"></s:textfield></td></tr>
          <tr><td><s:textfield name="amtdeducted" label="Amount deducted" readonly="true"></s:textfield></td></tr>
          
          <tr><td><s:submit value="GO FOR IT" align="center"></s:submit></td></tr>
          <tr><td><font color="red"><s:property value="msg"/></font></td></tr>
</s:form>        
 </table>
 
		</center>
		
				</div>
		</div>
	</div>
	<div id="footer-wrapper"><br /></div>
</body>
</html>