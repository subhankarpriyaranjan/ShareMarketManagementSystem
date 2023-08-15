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
    <title>Online Share Trading</title>
    <style>
        body {
            background-color: #f1f1f1;
            font-family: Arial, sans-serif;
            margin: 0;
            padding: 0;
        }
        
        #header-wrapper {
            background-color: #333;
            color: #fff;
            padding: 10px;
        }
        
        #logo a {
            font-size: 24px;
            font-weight: bold;
            text-decoration: none;
            color: #fff;
        }
        
        #menu {
            background-color: #666;
            padding: 10px;
        }
        
        #menu ul {
            list-style-type: none;
            margin: 0;
            padding: 0;
        }
        
        #menu ul li {
            display: inline-block;
            margin-right: 10px;
        }
        
        #menu ul li a {
            color: #fff;
            text-decoration: none;
            padding: 5px 10px;
        }
        
        #menu ul li a:hover {
            background-color: #999;
        }
        
        #page {
            margin: 20px;
            padding: 20px;
            background-color: #fff;
            border: 1px solid #ccc;
            box-shadow: 0 2px 4px rgba(0, 0, 0, 0.1);
        }
        
        h1 {
            font-size: 24px;
            color: #333;
            text-decoration: underline;
            margin-bottom: 20px;
        }
        
        ul {
            list-style-type: square;
            margin: 0;
            padding: 0;
        }
        
        ul li {
            margin-bottom: 10px;
        }
        
        ul li a {
            color: #333;
            text-decoration: none;
        }
        
        ul li a:hover {
            color: #777;
        }
    </style>
</head>
<body>
    <div id="header-wrapper">
        <div id="logo">
            <a href="#">Online Share Trading</a>
        </div>
    </div>
    <div id="menu">
        <ul>
            <li><a href="home.jsp" accesskey="1" title="">Home</a></li>
            <li><a href="about.jsp" accesskey="2" title="">About Us</a></li>
            <li><a href="contactus.jsp" accesskey="3" title="">Contact Us</a></li>
        </ul>
    </div>
    <div id="page">
        <h1><u><font size="6" color="brown">Customer Management</font></u></h1>
        <ul>
            <li><a href="home.jsp">Home</a></li>
            <li><a href="combo3">Approve/Reject Customer</a></li>
            <li><a href="deletecustomer.jsp">Delete Customer</a></li>
        </ul>
    </div>
</body>
</html>
