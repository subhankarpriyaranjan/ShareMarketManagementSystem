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
					<li class="current_page_item"><a href="homepage.jsp" accesskey="1" title="">Homepage</a></li>
					<li><a href="#" accesskey="2" title="">Login</a></li>
					<li><a href="about.jsp" accesskey="3" title="">About Us</a></li>
					<li><a href="contactus.jsp" accesskey="4" title="">Contact Us</a></li>
					
				</ul>
			</div>
		</div>
	</div>
	<div id="banner"><img src="images/anigif.gif " width="1120" height="500" alt="" /></div>
	<div id="page-wrapper">
		<div id="page">
		<h1><U><font size="6" color="brown">NEW BROKER</font></U></h1>
		<table>
		<s:form action="newbroker">
		<tr><td><s:textfield name="firstname" label="FIRST NAME"></s:textfield>
		</td></tr>
		<tr><td><s:textfield name="lastname" label="LAST NAME"></s:textfield>
		</td></tr>
		<tr><td><s:textfield name="username" label="USERNAME"></s:textfield>
		</td></tr>
		<tr><td><s:password name="password" label="PASSWORD"></s:password>
		</td></tr>
		<td><tr><s:radio name="sex" label="SEX"  list="{'female','male'}"></s:radio>
		</tr></td>
		<tr><td><s:textarea name="address" label="ADDRESS"></s:textarea>
		</td></tr>
		<tr><td><s:textfield name="dmateid" label="DMATE ID"></s:textfield>
		</td></tr>
		<tr><td><s:textfield name="acno" label="BANK ACCOUNT NO."></s:textfield>
		</td></tr>
		<tr><td><s:textfield name="balance" label="BALANCE"></s:textfield>
		</td></tr>
		<tr><td><s:textfield name="email" label="EMAIL ID"></s:textfield>
		</td></tr>
		<tr><td><s:textfield name="phon" label="PHONE NO."></s:textfield>
		</td></tr>
		<tr><td>
		<s:select label="SECURITY QUESTION" name="securityquestion"  list="{'place   of  birth','your  home town','your favourite  food','your  favourite color'}" headerValue="---please select---" >
		</s:select>
		</td>
		</tr>
		<tr><td><s:textfield name="answer" label="ANSWER"></s:textfield>
		</td></tr>
		<tr><td><s:textarea name="experience" label="EXPERIENCE"></s:textarea>
		</td></tr>
		<tr><td colspan="2" align="right" > <s:submit value="ADD" ></s:submit>
		</td></tr>
		</s:form>
		<tr><td><font color="red"><s:property value="msg" /></font></td></tr>
		</table>	
			</div>
			
		</div>
	</div>
	<div id="footer-wrapper"><br /></div>
</body>
</html>