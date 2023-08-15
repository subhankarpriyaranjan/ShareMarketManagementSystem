<%@ page language="java" import="java.util.*" pageEncoding="ISO-8859-1"%>
<%@taglib uri="/struts-tags" prefix="s"   %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta name="keywords" content="" />
<meta name="description" content="" />
<meta http-equiv="content-type" content="text/html; charset=utf-8" />
<link href='http://fonts.googleapis.com/css?family=Oswald:400,300' rel='stylesheet' type='text/css' />
<link href='http://fonts.googleapis.com/css?family=Abel|Satisfy' rel='stylesheet' type='text/css' />
<link href="default.css" rel="stylesheet" type="text/css" media="all" />

<style>
body {
  background-image: url('https://img.freepik.com/premium-photo/stock-prices-market-chart_273081-462.jpg');
  background-size: cover;
  font-family: Arial, sans-serif;
  color: #fff;
}

#wrapper {
  width: 960px;
  margin: 0 auto;
}

#header-wrapper {
  background-color: #333;
  padding: 10px;
}

#header {
  overflow: hidden;
}

#logo h1 a {
  font-size: 36px;
  color: #fff;
  text-decoration: none;
}

#menu ul {
  list-style: none;
  margin: 0;
  padding: 0;
}

#menu ul li {
  display: inline;
}

#menu ul li a {
  color: #fff;
  text-decoration: none;
  padding: 10px;
}

#banner img {
  width: 100%;
  height: auto;
}

#page-wrapper {
  background-color: rgba(0, 0, 0, 0.7);
  padding: 20px;
}

table {
  color: #000;
  width: 100%;
}

table td {
  padding: 5px;
}

textarea {
  width: 100%;
  padding: 5px;
}

input[type="submit"] {
  background-color: #ff0000;
  color: #fff;
  padding: 5px 10px;
  border: none;
  cursor: pointer;
}

a {
  color: #00f;
  text-decoration: none;
}
</style>

<!--[if IE 6]>
<link href="default_ie6.css" rel="stylesheet" type="text/css" />
<![endif]-->
</head>
<body>
<div id="wrapper">
	<div id="header-wrapper">
		<div id="header">
			<div id="logo">
				<h1><a href="#">ONLINE SHARE MARKET</a></h1>
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
	<div id="banner"><img src="https://w3assets.angelone.in/wp-content/uploads/2020/05/SHARE-MARKET-TIPS.jpg" width="1120" height="500" alt="" /></div>
	<div id="page-wrapper">
		<div id="page">
	    <a href="#"><font size="3" color="blue">Back</font></a>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
		<table>
		<s:form action="tips">
		<tr><td><s:textarea name="tips" label="PUT TIPS HERE"></s:textarea>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
		</td></tr>
		<tr><td><s:submit value="SUBMIT" name="submit"></s:submit>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
		</td></tr>
		</s:form>
		
		</table>	
		
		</div>
		</div>
	</div>
	<div id="footer-wrapper"><br /></div>
</body>
</html>
