<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Online Share Trading</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            background-color: #f2f2f2;
            margin: 0;
            padding: 0;
        }
        #header {
            background-color: #333;
            color: #fff;
            padding: 20px;
            text-align: center;
        }
        #menu {
            background-color: #666;
            padding: 10px;
            text-align: center;
        }
        #menu ul {
            list-style-type: none;
            margin: 0;
            padding: 0;
        }
        #menu ul li {
            display: inline;
            margin-right: 20px;
        }
        #menu ul li a {
            color: #fff;
            text-decoration: none;
            font-weight: bold;
            font-size: 18px;
        }
        #banner {
            background-image: url(https://img.etimg.com/thumb/width-1200,height-900,imgsize-448611,resizemode-75,msid-82202523/prime/money-and-markets/a-silver-lining-of-ready-inventory-and-a-stockpile-of-debt-is-lodhas-macrotech-a-value-buy.jpg);
            background-size: cover;
            height: 500px;
            display: flex;
            align-items: center;
            justify-content: center;
        }
        #banner h1 {
            color: #fff;
            font-size: 48px;
            text-align: center;
            text-shadow: 2px 2px 4px rgba(0, 0, 0, 0.5);
        }
        #page {
            margin: 20px auto;
            max-width: 800px;
            background-color: #fff;
            padding: 20px;
            border-radius: 5px;
        }
        #footer {
            background-color: #333;
            color: #fff;
            padding: 10px;
            text-align: center;
        }
        #footer p {
            margin: 0;
        }
    </style>
</head>
<body>
    <div id="header">
        <h1>ONLINE SHARE TRADING</h1>
    </div>
    <div id="menu">
        <ul>
            <li class="current_page_item"><a href="homepage.jsp" accesskey="1">Homepage</a></li>
            <li><a href="#" accesskey="2">Login</a></li>
            <li><a href="about.jsp" accesskey="3">About Us</a></li>
            <li><a href="contactus.jsp" accesskey="4">Contact Us</a></li>
        </ul>
    </div>
    <div id="banner">
        <h1>COMPANY MANAGEMENT</h1>
    </div>
    <div id="page">
        <h1><marquee><u>COMPANY MANAGEMENT</u></marquee></h1>
        <s:form action="loginaction">
            <ul>
                <li><a href="home.jsp">HOME</a></li>
                <li><a href="approvrejcom.jsp">APPROVE/REJECT COMPANY</a></li>
                <li><a href="deletecomp.jsp">DELETE COMPANY</a></li>
            </ul>
        </s:form>
    </div>
    <div id="footer">
        <p>&copy; 2023 Online Share Trading. All rights reserved.</p>
    </div>
</body>
</html>
