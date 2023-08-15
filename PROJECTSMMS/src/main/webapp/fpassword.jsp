<%@ page language="java" import="java.util.*" pageEncoding="ISO-8859-1"%>
<%@taglib uri="/struts-tags" prefix="s"   %>
<%@page import="p1.dbconnect"%>
<%@page import="java.sql.*"%>

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
<script type="text/javascript">
	//var ob;
	function func()
	{
	var code=document.forms[0].username.value;
	<%ResultSet rs=dbconnect.getStatement().executeQuery("select * from login");
	
	while(rs.next())
	{
	%>
if(code=='<%=rs.getString(2)%>')
{
document.forms[0].securityquestion.value='<%=rs.getString(6)%>';
}
<%}%>
	}
	</script>

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
		<a href="#">back</a>
		<h1><U><i>FORGET PASSWORD???</i></U></h1>
		<table>
		<s:form action="confpsww">
		<tr><td><s:textfield name="username" label="USERNAME" onblur="func()"></s:textfield>
		</td></tr>
		
		
		<tr><td>
		<s:textfield label="SECURITY QUESTION" name="securityquestion"/>
		</td>
		</tr>
		<tr><td><s:textarea name="answer" label="ANSWER"></s:textarea>
		</td></tr>
		<tr><td><s:radio name="usertype" label="USERTYPE" list="{'user','broker','company'}"/>
		</td></tr>
		<tr><td colspan="2" align="right" > <s:submit value="SUBMIT" ></s:submit>
		</td></tr>
		<tr><td><s:property value="msg"/></td></tr>
		</s:form>
		</table>
		
		
			
			</div>
			<div id="sidebar">
		</div>
	</div>
	<div id="footer-wrapper">
		<div id="footer-content">
			<div id="fbox1">
				<h2>World Currencies</h2>
				<table border="2">
					<tr>
					<th>Currencies vs. USD</th>
					<th>$1=</th>
					</tr>
					<tr>
					<td>Canada Dollar</td>
					<td>1.0097</td>
					</tr>
					<tr>
					<td>European Euro</td>
					<td>0.7490</td>
					</tr>
					<tr>
					<td>United Kingdom Pound</td>
					<td>0.6463</td>
					</tr>
					<tr>
					<td>Japan Yen</td>
					<td>93.9150</td>
					</tr>
					</table>
				
			</div>
			<div id="fbox2">
				<h2>Excel StockMarket Chart </h2>
				<p>A Volume-High-Low-Close stock market chart is a type of bar chart or graph used primarily to show changes in the value of tradable assets - such as stocks - over a given period of time.</p>
				<p><img src="images/img05.gif" width="500" height="200" alt="" /></p>
			
			</div>
			<div id="fbox3">
				<h2>Stock Market Related Terms</h2>
				<ul class="style3">
					<li class="first"><img src="images/img02.jpg" width="78" height="78" alt="">
	<p> An investor who believes 
	         the whole market or one
	         individualstock is going
	         to increase in price.This 
	         is the opposite of a Bear.</p>
						      

						 </p>
						<b><u> BULL & BEAR</u></b>
					</li>
					<li><img src="images/img03.jpg" width="78" height="78" alt="">
						<p>Nullam non wisi a sem eleifend. Donec mattis libero eget urna. </p>
						<b><u>CASH</u></b>
					</li>
					<li><img src="images/img04.jpg" width="78" height="78" alt="">
						<p> This widely used analysis tool of Price to Earnings ratio measures
						 now you pay for each dollar of corporate earnings.  </p>
						<b><u>P/E RATIO</u></b>
					</li>
				</ul>
			</div>
		</div>
	</div>
</div>
	
	<div id="footer">
	<p>Copyright (c) 2012 Sitename.com. All rights reserved. Design by <a href="http://www.freecsstemplates.org">FCT</a>. Photos by <a href="http://fotogrph.com/">Fotogrph</a>.</p>
</div>
</body>
</html>