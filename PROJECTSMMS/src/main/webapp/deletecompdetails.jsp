<%@ page language="java" import="java.util.*" pageEncoding="ISO-8859-1"%>
<%@taglib uri="/struts-tags" prefix="s" %>
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
            font-family: Arial, sans-serif;
            background-color: #f4f4f4;
            margin: 0;
            padding: 0;
        }
        
        #header {
            background-color: #333;
            color: #fff;
            padding: 10px;
        }
        
        #logo {
            font-size: 24px;
            font-weight: bold;
            text-decoration: none;
            color: #fff;
        }
        
        #menu {
            background-color: #555;
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
            background-color: #777;
        }
        
        #content {
            margin: 20px;
            padding: 20px;
            background-color: #fff;
            border: 1px solid #ccc;
        }
        
        h1 {
            font-size: 24px;
            color: #333;
            text-decoration: underline;
            margin-bottom: 20px;
        }
        
        form {
            margin-bottom: 20px;
        }
        
        label {
            display: block;
            margin-bottom: 5px;
        }
        
        input[type="text"],
        textarea {
            width: 100%;
            padding: 5px;
            border: 1px solid #ccc;
        }
        
        input[type="submit"] {
            background-color: #555;
            color: #fff;
            padding: 5px 10px;
            border: none;
            cursor: pointer;
        }
        
        .error {
            color: red;
        }
    </style>
</head>
<body>
    <div id="header">
        <a href="#" id="logo">Online Share Trading</a>
    </div>
    <div id="menu">
        <ul>
            <li><a href="homepage.jsp" accesskey="1" title="">Homepage</a></li>
            <li><a href="#" accesskey="2" title="">Login</a></li>
            <li><a href="about.jsp" accesskey="3" title="">About Us</a></li>
            <li><a href="contactus.jsp" accesskey="4" title="">Contact Us</a></li>
        </ul>
    </div>
    <div id="content">
        <a href="#">back</a>
        <h1>COMPANY DETAILS</h1>
        <form action="delete">
            <input type="hidden" name="loginid" />
            <label for="companyname">COMPANY NAME:</label>
            <input type="text" name="companyname" readonly="true" />
            <label for="address">ADDRESS:</label>
            <textarea name="address"></textarea>
            <label for="city">CITY:</label>
            <input type="text" name="city" />
            <label for="state">STATE:</label>
            <input type="text" name="state" />
            <label for="officeno">OFFICE NO.:</label>
            <input type="text" name="officeno" />
            <label for="faxno">FAX NO.:</label>
            <input type="text" name="faxno" />
            <label for="website">WEBSITE:</label>
            <input type="text" name="website" />
            <label for="email">EMAIL ID:</label>
            <input type="text" name="email" />
            <input type="submit" value="DELETE" />
        </form>
        <p class="error"><s:property value="msg" /></p>
    </div>
</body>
</html>
